package Q2;

public class Electronics extends Product {
    String brand;

    public Electronics(String productName, double price, int inventory, String brand) {
        super(productName, price, inventory);
        brand = this.brand;
    }

    @Override
    public double calculatePrice() {
        if (brand == "Apple") {
            return super.getPrice() * 1.2;
        }
        return super.getPrice();
    }
}
