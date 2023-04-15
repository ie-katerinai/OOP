import java.util.concurrent.ThreadLocalRandom;

public class Robot implements Players {
    private String name;
    private Integer runningDistance;
    private Integer jumpingHeight;

    public Robot(String name) {
        this.name = name;
        this.runningDistance = ThreadLocalRandom.current().nextInt(0, 500);
        this.jumpingHeight = ThreadLocalRandom.current().nextInt(0, 4);
    }

    public Robot() {
        this("Arkadiy");
    }


    public void printInfo() {
        System.out.println(String.format("Робот %s может бежать %dм и прыгать на высоту %dм", name, runningDistance, jumpingHeight));
    }

    @Override
    public Boolean run(Barrier barriers) {
        Boolean result = false;
        if (runningDistance >= barriers.getMeasure()) {
            result = true;
            System.out.println(String.format("Дорожка роботом %s пройдена", name));
        } else System.out.println(String.format("Дорожка роботом %s не пройдена", name));
        return result;
    }

    @Override
    public Boolean jump(Barrier barriers) {
        Boolean result = false;
        if (runningDistance >= barriers.getMeasure()) {
            result = true;
            System.out.println(String.format("Стена роботом %s пройдена", name));
        } else System.out.println(String.format("Стена роботом %s не пройдена", name));
        return result;
    }
}
