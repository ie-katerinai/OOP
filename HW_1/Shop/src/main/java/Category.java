import java.util.ArrayList;

public class Category {
    private String categoryName;
    private ArrayList<Product> productList = new ArrayList<Product>();

    public Category(String name) {
        this.categoryName = name;
    }

    public Category() {
        this("Другое");
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public ArrayList getProductList() {
        return productList;
    }

    public void setProductList(ArrayList productList) {
        this.productList = productList;
    }

    public void printCategoryInfo(){
        System.out.println("Категория - "+ categoryName + ". Список товаров: " + printList(productList));
    }

    public String getProductListInfo(){
        String result = "";
        for (Product product: productList) {
            result = result + product.getProductName() + " ";
        }
        return result.trim();
    }

    public Boolean checkProduct(Product productName){
        Boolean result = false;
        if(productList.contains(productName)) result = true;
        return result;
    }

    public void deleteProduct(Product productName){
        if(checkProduct(productName)){
            productList.remove(productName);
        }
    }

    public void addProduct(Product productName){
        productList.add(productName);
        //System.out.println("Продукт добавлен!");
    }


    private String printList(ArrayList<Product> productList) {
        String result = "";
        for (Product product:productList) {
            result = result + product.getProductName() + " ";
        }
        return result.trim();
    }
}

