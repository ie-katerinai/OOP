import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private String name;
    private Integer amount;
    private Double price;
    private String color;
    private String manufacture;

    public Product(String name, Integer amount, Double price) {
        this.name = name;
        this.amount = amount;
        this.price = price;
    }

    public Product(String name) {
        this(name, 0, 0.0);
    }

    public String printInfo() {
        String result = String.format("Товар %s в количестве %d шт. и стоимостью %s ₽", name, amount, price.toString());
        return result;
    }
}
