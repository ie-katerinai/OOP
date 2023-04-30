public class Manager {
    String name;

    public Manager(String name) {
        this.name = name;
    }

    public Order createOrder() {
        Order order = new Order();
        order.status = Order.Status.CREATE;
        return order;
    }

    public void deleteOrder(Order order){
        order.status = Order.Status.DELETE;
    }

    public void addProductToOrder(Product product, Order order, ProductWarehouse productWarehouse, Integer quantity) {
        order.add(product);
        order.increase(product, quantity);
        productWarehouse.decrease(product, quantity);
    }

    public void removeProductFromOrder(Product product, Order order, ProductWarehouse productWarehouse) {
        order.delete(product);
        productWarehouse.increase(product, order.product.getAmount());
    }

    public void increaseProductInOrder(Product product, Order order, ProductWarehouse productWarehouse, Integer quantity){
        order.increase(product, quantity);
        productWarehouse.decrease(product, quantity);
    }

    public void decreaseProductInOrder(Product product, Order order, ProductWarehouse productWarehouse, Integer quantity){
        order.decrease(product, quantity);
        productWarehouse.increase(product, quantity);
    }

}
