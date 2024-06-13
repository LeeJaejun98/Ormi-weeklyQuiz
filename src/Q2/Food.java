package Q2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Food extends Product {
    Date date = new Date();

    public Food(String productName, double price, int inventory, Date date) {
        super(productName, price, inventory);
        date = this.date;
    }

    @Override
    public void calculatePrice(){
        if()
    }
}
