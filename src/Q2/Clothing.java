package Q2;

public class Clothing extends Product {

    String size;

    public Clothing(String productName, double price, int inventory, String size) {
        super(productName, price, inventory);
        size = this.size;
    }

    @Override
    public void calculatePrice(){

    }
}
