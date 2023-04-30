public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("TV-set", 17, 25000.00);
        System.out.println(product1.printInfo());
        Product product2 = new Product("Cycle", 5, 10000.00);
        ProductWarehouse productWarehouse = new ProductWarehouse();
        productWarehouse.add(product1);
        productWarehouse.add(product2);
        productWarehouse.increase(product1, 5);
        productWarehouse.decrease(product1, 8);
        System.out.println(productWarehouse);
        System.out.println(productWarehouse.search(product1));
        System.out.println(productWarehouse.search(product2));
        productWarehouse.decrease(product1, 3);
        System.out.println(productWarehouse);
        productWarehouse.increase(product2, 4);
        Manager admin = new Manager("Andre Kotov");
        Order order1 = admin.createOrder();
        System.out.println(productWarehouse);
        admin.addProductToOrder(product1, order1, productWarehouse,2);
        order1.getOrderInfo();
        System.out.println(productWarehouse);
        admin.removeProductFromOrder(product1, order1, productWarehouse);
        order1.getOrderInfo();
        System.out.println(productWarehouse);
        admin.addProductToOrder(product2, order1, productWarehouse, 5);
        order1.getOrderInfo();
        System.out.println(productWarehouse);
        admin.increaseProductInOrder(product2, order1, productWarehouse,3);
        order1.getOrderInfo();
        System.out.println(productWarehouse);
        admin.decreaseProductInOrder(product2, order1, productWarehouse, 7);
        order1.getOrderInfo();
        System.out.println(productWarehouse);
    }
}
