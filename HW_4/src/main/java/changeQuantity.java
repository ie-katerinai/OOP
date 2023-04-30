public interface changeQuantity {
    Integer quantity = 1;

    public void increase(Product product, Integer quantity);
    public void decrease(Product product, Integer quantity);

}
