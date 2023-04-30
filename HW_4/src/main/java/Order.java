import java.util.ArrayList;

public class Order implements changeProducts, changeQuantity, searchProducts {
    ArrayList<Product> order = new ArrayList<>();
    Product product = new Product();
    enum Status{
        NEW,
        CREATE,
        IN_PROGRESS,
        DELETE
    }
    Status status = Status.NEW;

    @Override
    public Integer search(Product product) {
        return this.order.indexOf(this.product);
    }

    @Override
    public void add(Product product) {
        this.product = new Product(product.getName(), 0, product.getPrice());
        if (this.search(product) == -1) {
            this.order.add(this.product);
        } else this.increase(product, 1);
    }

    @Override
    public void increase(Product product, Integer quantity) {
        if (this.search(product) != -1) {
            this.product.setAmount(this.product.getAmount() + quantity);
        } else {
            this.add(product);
        }
    }

    @Override
    public void delete(Product product) {
        if (this.search(product) != -1) {
            this.order.remove(this.product);
        } else System.out.println("Продукт не найден.");
    }

    @Override
    public void decrease(Product product, Integer quantity) {
        if (this.search(product) != -1 && this.product.getAmount() > quantity) {
            this.product.setAmount(this.product.getAmount() - quantity);
        } else {
            System.out.println("Товара в данном количестве не добавлено в корзину.");
        }
    }

    public void getOrderInfo() {
        String result = "Товары в корзине: ";
        for (Product prod : order
        ) {
            result = result + prod.getName() + " - " + prod.getAmount() + " шт. ";
        }
        System.out.println(result);
    }
}
