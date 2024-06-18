package Q2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Food extends Product {

    private String expirationDate;

    private static final String DATE_FORMAT = "yyyyMMdd";
    private static final Long DATE_MILLI_SEC = 86400000L;

    public Food(String name, double price, int stock, String expirationDate) {
        super(name, price, stock);
        this.expirationDate = expirationDate;
    }

    @Override
    public double calculatePrice() {
        SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
        try {
            Date endDate = dateFormat.parse(expirationDate);
            String now = dateFormat.format(new Date());
            Date today = dateFormat.parse(now);
            long diff = endDate.getTime() - today.getTime();
            long diffTime = diff / DATE_MILLI_SEC;

            if (diffTime < 8) {
                return getPrice() * 0.8;
            }
            return getPrice();
        } catch (ParseException ignored) {
            return getPrice();
        }
    }

}