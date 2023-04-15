import java.util.ArrayList;

public class User {
    private final String userName;
    private String login;
    private String password;
    Basket userBasket = new Basket();


    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
        this.userBasket = new Basket();
    }

    private User(String userName) {
        this(userName, "xy123456");
    }

    public String getUserName() {
        return userName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Basket getUserBasket() {
        return userBasket;
    }

    public void setUserBasket(Basket userBasket) {
        this.userBasket = userBasket;
    }

    public void printUserBasketInfo(){
        System.out.println("Покупки пользователя " + userName + ". " +
                           " Список покупок: - "+ userBasket.getBasketInfo());
    }

    public void buyProduct(Catalog catalogName, Product productName){
        userBasket.putProduct(catalogName, productName);
        catalogName.deleteProduct(productName);
    }
}
