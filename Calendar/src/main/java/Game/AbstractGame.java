package Game;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Data
@AllArgsConstructor
@NoArgsConstructor

public abstract class AbstractGame implements Game {
    Integer sizeWord;
    Integer attempts;
    String word;// загаданное компьютером слово
    GameStatus gameStatus = GameStatus.INIT;


    @Override
    public void start(Integer sizeWord, Integer attempts) {
        this.sizeWord = sizeWord;
        this.attempts = attempts + 1;
        word = generateWord();
        this.gameStatus = GameStatus.START;
    }

    @Override
    public Answer inputValue(String value) {
        int bulls = 0;
        int cows = 0;
        for (int i = 0; i < value.length(); i++) {
            if (value.charAt(i) == word.charAt(i)) {
                bulls++;
            }
            Character character = value.charAt(i);
            if (word.contains(character.toString())) {
                cows++;
            }
        }
        if (attempts >= 0 && bulls == value.length() && bulls != 0) {
            gameStatus = GameStatus.WIN;
        }
        attempts--;
        return new Answer(value, cows, bulls, attempts);
    }

    @Override
    public GameStatus getGameStatus() {
        if (attempts == 0 && !gameStatus.equals(GameStatus.WIN)) {
            System.out.println("Вы проиграли:(");
            return GameStatus.LOSE;
        }
        if (gameStatus.equals(GameStatus.WIN)) {
            System.out.println("Вы выиграли:)");
            return GameStatus.WIN;
        }
     else return GameStatus.START;
}

    private String generateWord() {
        Random random = new Random();
        List<String> charList = generateCharList();
        String resWord = "";
        for (int i = 0; i < sizeWord; i++) {
            int randomIndex = random.nextInt(charList.size());
            resWord = resWord.concat((charList.get(randomIndex)));
            charList.remove((randomIndex));
        }
        return resWord;
    }

    abstract List<String> generateCharList();
}
