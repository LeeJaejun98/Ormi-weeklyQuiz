package Q2;

public class Electronics extends Product{
    String brand;

    public Electronics(String productName, double price, int inventory, String brand) {
        super(productName, price, inventory);
        brand = this.brand;
    }

    @Override
    public void calculatePrice(){
        if (brand == "Apple"){
            price *= 1.2;
        }
    }
}
