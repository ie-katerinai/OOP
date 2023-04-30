import java.util.ArrayList;

public class ProductWarehouse extends Warehouse implements changeQuantity, changeProducts, searchProducts{
    Integer capacity = super.getCapacity();
    ArrayList<Product> products = new ArrayList<>();
    @Override
    public void increase(Product product, Integer quantity) {
        if (this.search(product) != -1) {
            product.setAmount(product.getAmount() + quantity);
        } else System.out.println("Продукт не найден.");
    }

    @Override
    public void decrease(Product product, Integer quantity) {
        if (search(product) != -1 && product.getAmount() >= quantity) {
            product.setAmount(product.getAmount() - quantity);
        } else System.out.println("Количество товара не достаточно для уменьшения на указанную величину.");
    }

    @Override
    public void add(Product product) {
        if (search(product) == -1 && products.size() <= this.capacity) {
            this.products.add(product);
        } else System.out.println("Такой продукт уже добавлен в каталог.");
    }

    @Override
    public void delete(Product product) {
        if (search(product) != -1) {
            this.products.remove(product);
        } else System.out.println("Продукт не найден.");
    }

    @Override
    public Integer search(Product product) {
        return this.products.indexOf(product);
    }

    @Override
    public String toString() {
        String result = "";
        for (Product prod : products
        ) {
            result = result + prod.printInfo() + ", ";
        }
        return result;
    }
}
