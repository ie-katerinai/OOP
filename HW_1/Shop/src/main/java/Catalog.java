import java.util.ArrayList;

public class Catalog {
    private ArrayList<Category> catalogProduct = new ArrayList<>();

    public void addCategory(Category categoryName) {
        catalogProduct.add(categoryName);
    }

    public void deleteProduct(Product productName){
        for (Category category : catalogProduct) {
            category.deleteProduct(productName);
        }
    }

    public void getAllProductsInfo() {
        String result = "";
        for (Category category : catalogProduct) {
            result = result + category.getProductListInfo() + " ";
        }
        System.out.println("Список всех продуктов магазина: " + result.trim());
    }

    public Boolean checkProductExist(Product productName) {
        Boolean result = false;
        for (Category category : catalogProduct) {
            if (category.checkProduct(productName)) {
                result = true;
                break;
            }
        }
        return result;
    }
}
