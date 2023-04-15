import java.util.concurrent.ThreadLocalRandom;

public class Track implements Barrier {
    private Integer length;

    public Track() {
        this.length = ThreadLocalRandom.current().nextInt(0, 100);
    }

    public Integer getMeasure() {
        return length;
    }

    public void getInfo() {
        System.out.println(String.format("Беговая дорожка длиной %dм", length));
    }
}