import java.util.*;
import discount.*;
public class main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Double> prices=new ArrayList<>();
        System.out.print("Enter number of prices: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter price: ");
            prices.add(sc.nextDouble());
        }
        System.out.println("1. 10% Discount");
        System.out.println("2. 20% Discount");
        System.out.println("3. 50% Discount");
        System.out.print("Choose rule: ");
        int choice=sc.nextInt();
        DiscountRule rule;
        if(choice==1)
        {
            rule=(price)->price-(price*10/100);
        }
        else if(choice==2)
        {
            rule=(price)->price-(price*20/100);
        }
        else
        {
            rule=(price)->price-(price*50/100);
        }
        DiscountEngine.applyDiscount(prices,rule);
        sc.close();
    }
}