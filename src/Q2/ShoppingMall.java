package Q2;

public abstract class ShoppingMall {
    private Product[] productArray;
    private int arraySize;
    private int cnt;

    public ShoppingMall(Product[] productArray, int arraySize) {
        this.productArray = new Product[arraySize];
        cnt = 0;
    }

    abstract boolean checkOrderAvailability(Product product);

    public void addProduct(Product product) { // count 필요함
        if (cnt == productArray.length) {
            Product[] addedArray = new Product[productArray.length * 2];
            for (int i = 0; i < productArray.length; i++) {
                addedArray[i] = productArray[i];
            }
            productArray = addedArray;
        }
        productArray[cnt++] = product;
    }

    public void removeProduct(String productName) {

    }

    public void displayProducts() {
        for (int i = 0; i < cnt; i++){
            System.out.println("product name : " + productArray[i].getProductName());
            System.out.println("product price : " + productArray[i].getPrice());
            System.out.println("product stock : " + productArray[i].getInventory());
        }
    }

}
