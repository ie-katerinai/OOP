package Game;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("1 - цифра");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите игру: ");
        int num = scanner.nextInt();
        Game game = null;
        switch (num) {
            case 1:
                game = new NumberGame();
                game.start(3, 1);
                break;
            case 2:
                game = new RuGame();
                game.start(2, 30);
                break;
            case 3:
                game = new EnGame();
                game.start(2, 20);
                break;
            default:
                System.out.println("Данная игра пока не добавлена!");
        }
        while ((game.getGameStatus().equals(GameStatus.START))) {
            System.out.println("Ход: ");
            String answer = scanner.nextLine();
            Answer answerGame = game.inputValue(answer);
            System.out.println("Коров - " + answerGame.getCow() + " , быков - " + answerGame.getBull() + ", осталось попыток: " + answerGame.getAttempts());
        }
    }
}
