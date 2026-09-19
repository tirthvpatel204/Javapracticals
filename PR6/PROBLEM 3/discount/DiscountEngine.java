package discount;
import java.util.*;
public class DiscountEngine
{
    public static void applyDiscount(ArrayList<Double> prices,DiscountRule rule)
    {
        for(double price:prices)
        {
            double newPrice=rule.apply(price);
            System.out.println(price+" -> "+newPrice);
        }
    }
}