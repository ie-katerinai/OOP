public class Main {
    public static void main(String[] args) {
        Category category1 = new Category("Молочные продукты");
        Category category2 = new Category("Хлеб");
        Category category3 = new Category("Бакалея");

        Product product1 = new Product("Молоко", 123.00, 4);
        Product product2 = new Product("Масло", 190.00, 5);
        Product product3 = new Product("Бородинский", 40.00, 5);
        Product product4 = new Product("Нарезной", 38.00, 5);
        Product product5 = new Product("Колбаса", 340.50, 4);
        Product product6 = new Product("Сосиски", 180.00, 3);
        Product product7 = new Product("Икра чёрная", 5900.00, 4);

        category1.addProduct(product1);
        category1.addProduct(product2);
        category2.addProduct(product3);
        category2.addProduct(product4);
        category3.addProduct(product5);
        category3.addProduct(product6);
        category3.addProduct(product7);
        category1.printCategoryInfo();
        category2.printCategoryInfo();
        category3.printCategoryInfo();

        Catalog catalog = new Catalog();
        catalog.addCategory(category1);
        catalog.addCategory(category2);
        catalog.addCategory(category3);
        catalog.getAllProductsInfo();

        User user1 = new User("pablo127", "TVwgdv%$gdv!^66g");
        User user2 = new User("11jango", "11ilona44");
        User user3 = new User("Zhanna Baranova", "Zhanna18Pupyrochka!");
        System.out.println("User1: " + user1.getUserName());

        user1.buyProduct(catalog, product2);
        user1.buyProduct(catalog, product4);
        user1.printUserBasketInfo();
        user2.buyProduct(catalog, product1);
        user2.buyProduct(catalog, product4);
        user2.buyProduct(catalog, product3);
        user2.printUserBasketInfo();
        user3.buyProduct(catalog, product5);
        user3.buyProduct(catalog, product7);
        user3.printUserBasketInfo();
        catalog.getAllProductsInfo();
    }
}
