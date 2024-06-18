package Q2;

import java.util.Arrays;

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

    public void removeProduct(Product product) {
        int index = findIndex(product);
        if (index != -1) {
            if(index >= 0 && index < cnt){
               for (int i = index; i < productArray.length - 1 ; i++){
                   productArray[i] = productArray[i+1];
               }
               productArray = Arrays.copyOf(productArray, productArray.length - 1);
            }
        }
    }

    public int findIndex(Product product) { // productArray에서 매치되는 index 찾기
        for (int i = 0; i < cnt; i++) {
            if (productArray[i].equals(product))
                return i;
        }
        return -1;
    }

    public void displayProducts() {
        for (int i = 0; i < cnt; i++) {
            System.out.println("product name : " + productArray[i].getProductName());
            System.out.println("product price : " + productArray[i].getPrice());
            System.out.println("product stock : " + productArray[i].getInventory());
        }
    }

}
