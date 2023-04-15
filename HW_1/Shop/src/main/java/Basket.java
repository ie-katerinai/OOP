import java.util.ArrayList;

public class Basket {
    private ArrayList<Product> purchasedGoods = new ArrayList();

    public ArrayList getPurchasedGoods() {
        return purchasedGoods;
    }

    public void setPurchasedGoods(ArrayList purchasedGoods) {
        this.purchasedGoods = purchasedGoods;
    }
    public void putProduct(Catalog catalogName, Product productName){
        if (catalogName.checkProductExist(productName)){
            purchasedGoods.add(productName);
        }
        else System.out.println("Продукт отсутствует в магазине");
    }

    public String getBasketInfo(){
        String result = "";
        for (Product product:purchasedGoods) {
            result = result + product.getProductName() + " ";
        }
        return result.trim();
    }
}
