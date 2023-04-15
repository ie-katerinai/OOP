import java.util.concurrent.ThreadLocalRandom;
public class Wall implements Barrier{
    private Integer height;
    public Wall(){
        this.height = ThreadLocalRandom.current().nextInt(0, 2);
    }
    public Integer getMeasure() {
        return height;
    }
    public void getInfo(){
        System.out.println(String.format("Стена высотой %dм", height));
    }
}
