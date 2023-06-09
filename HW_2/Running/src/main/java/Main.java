import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Track track1 = new Track();
        Wall wall1 = new Wall();
        Track track2 = new Track();
        Wall wall2 = new Wall();

        ArrayList<Barrier> barriers = new ArrayList<>();
        barriers.add(track1);
        barriers.add(wall1);
        barriers.add(track2);
        barriers.add(wall2);

        Human human1 = new Human("Федя");
        Human human2 = new Human("Соня");
        Cat cat1 = new Cat("Борис");
        Robot robot1 = new Robot("Валера");

        ArrayList<Players> players = new ArrayList<>();
        players.add(human1);
        players.add(human2);
        players.add(cat1);
        players.add(robot1);

        for (Players user : players) {
            user.printInfo();
        }
        System.out.println("-----------------------------");

        for (Barrier obstacle : barriers) {
            obstacle.getInfo();

        }
        System.out.println("-----------------------------");

        for (Players user : players) {
            for (Barrier obstacle : barriers) {
                if (!user.jump(obstacle) || !user.run(obstacle)) break;
            }
        }
    }
}
