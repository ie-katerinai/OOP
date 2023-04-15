import java.util.concurrent.ThreadLocalRandom;

public class Human implements Players{
    private String name;
    private Integer runningDistance;
    private Integer jumpingHeight;

    public Human(String name) {
        this.name = name;
        this.runningDistance = ThreadLocalRandom.current().nextInt(0, 100);
        this.jumpingHeight = ThreadLocalRandom.current().nextInt(0, 2);
    }

    public Human(){
        this("Ivan");
    }

    public void printInfo(){
        System.out.println(String.format("Человек %s может бежать %dм и прыгать на высоту %dм",name, runningDistance, jumpingHeight));
    }

    @Override
    public Boolean jump(Barrier barriers){
        Boolean result = false;
        if(runningDistance >= barriers.getMeasure()) {result = true;
            System.out.println(String.format("Стена человеком %s пройдена", name));}
        else System.out.println(String.format("Стена человеком %s не пройдена", name));
        return result;
    }

    @Override
    public Boolean run(Barrier barriers) {
        Boolean result = false;
        if(runningDistance >= barriers.getMeasure()) {result = true;
            System.out.println(String.format("Дорожка человеком %s пройдена", name));}
        else System.out.println(String.format("Дорожка человеком %s не пройдена", name));
        return result;
    }
}
