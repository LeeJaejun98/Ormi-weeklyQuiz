package Q2;

public class PremiumShoppingMall extends ShoppingMall{
    public PremiumShoppingMall(Product[] productArray, int arraySize) {
        super(productArray, arraySize);
    }
    @Override
    boolean checkOrderAvailability(Product product){
        if(product.getInventory() >= 10){
            return true;
        }
        return false;
    }
}
