import java.util.concurrent.ThreadLocalRandom;

public class Cat implements Players {
    private String name;
    private Integer runningDistance;
    private Integer jumpingHeight;

    public Cat(String name) {
        this.name = name;
        this.runningDistance = ThreadLocalRandom.current().nextInt(0, 60);
        this.jumpingHeight = ThreadLocalRandom.current().nextInt(0, 3);
    }

    public Cat() {
        this("Vasiliy");
    }

    public void printInfo() {
        System.out.println(String.format("Кот %s может бежать %dм и прыгать на высоту %dм", name, runningDistance, jumpingHeight));
    }


    @Override
    public Boolean run(Barrier barriers) {
        Boolean result = false;
        if (runningDistance >= barriers.getMeasure()) {
            result = true;
            System.out.println(String.format("Дорожка котом %s пройдена", name));
        } else System.out.println(String.format("Дорожка котом %s не пройдена", name));
        return result;
    }

    @Override
    public Boolean jump(Barrier barriers) {
        Boolean result = false;
        if (runningDistance >= barriers.getMeasure()) {
            result = true;
            System.out.println(String.format("Стена котом %s пройдена", name));
        } else System.out.println(String.format("Стена котом %s не пройдена", name));
        return result;
    }

}
