package Q2;

public class Clothing extends Product {

    private String size;

    public Clothing(String productName, double price, int inventory, String size) {
        super(productName, price, inventory);
        this.size = size;
    }

    @Override
    public double calculatePrice(){
        if (size.equals("L")){
            return super.getPrice() * 1.1;
        }
        return super.getPrice();
    }
}
