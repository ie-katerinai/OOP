public class Product extends Category {
    private String productName;
    private Double price;
    private Integer rating;

    public Product(String name, Double price, Integer rating) {
        this.productName = name;
        this.price = price;
        this.rating = rating;
    }

    public Product(String name, Double price){
        this(name, price, 0);
    }

    public Product(String name){
        this(name, 100.0, 0);
    }

    public Product() {
        this("Пакет", 5.0, 0);
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }
}
