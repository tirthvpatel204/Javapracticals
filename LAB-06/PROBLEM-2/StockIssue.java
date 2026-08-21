import java.util.*;
class OutOfStockException extends Exception
{
    private int shortfall;
    OutOfStockException(int shortfall)
    {
        super("Out of stock");
        this.shortfall=shortfall;
    }
    public int getShortfall()
    {
        return shortfall;
    }
}
class InvalidQuantityException extends Exception
{
    InvalidQuantityException(String msg)
    {
        super(msg);
    }
}
class Warehouse
{
    private Map<String,Integer> stock=new HashMap<>();
    Warehouse()
    {
        stock.put("Laptop",10);
        stock.put("Mouse",20);
        stock.put("Keyboard",15);
    }
    public void issue(String item,int qty)throws OutOfStockException,InvalidQuantityException
    {
        if(qty<=0)
        {
            throw new InvalidQuantityException("Quantity must be greater than 0");
        }
        if(!stock.containsKey(item))
        {
            throw new OutOfStockException(qty);
        }
        int available=stock.get(item);
        if(qty>available)
        {
            throw new OutOfStockException(qty-available);
        }
        stock.put(item,available-qty);
        System.out.println("Issued "+qty+" "+item+" successfully.");
    }
}
public class StockIssue
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Warehouse warehouse=new Warehouse();
        System.out.print("Enter number of requests: ");
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=1;i<=n;i++)
        {
            System.out.println("\nRequest "+i);
            System.out.print("Enter item: ");
            String item=sc.nextLine();
            System.out.print("Enter quantity: ");
            int qty=sc.nextInt();
            sc.nextLine();
            try
            {
                warehouse.issue(item,qty);
            }
            catch(InvalidQuantityException e)
            {
                System.out.println("Failed: "+e.getMessage());
            }
            catch(OutOfStockException e)
            {
                System.out.println("Failed: Shortfall = "+e.getShortfall());
            }
        }
        System.out.println("All requests processed.");
        sc.close();
    }
}