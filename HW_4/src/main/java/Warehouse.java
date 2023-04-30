import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Warehouse {
    private String name;
    private Integer capacity = 100;

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }
}
