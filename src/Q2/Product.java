package Q2;

public class Product {
    String productName;
    double price;
    int inventory;

    public Product(String productName, double price, int inventory) {
        this.productName = productName;
        this.price = price;
        this.inventory = inventory;
    }


    public void calculatePrice(){
        System.out.println("가격은 : " + this.price);
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }
}
