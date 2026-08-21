import java.util.Scanner;
class DivideByZeroException extends Exception
{
    DivideByZeroException(String msg)
    {
        super(msg);
    }
}
public class GuardedCalculator
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        boolean success=false;
        while(!success)
        {
            try
            {
                System.out.println("Enter First Number:");
                double a=Double.parseDouble(sc.nextLine());
                if(a<0)
                {
                    System.out.println("Invalid Number!!");
                    continue;
                }
                System.out.println("Enter Operator (+,-,*,/,%) :");
                char op=sc.nextLine().charAt(0);
                System.out.println("Enter Second Number:");
                double b=Double.parseDouble(sc.nextLine());
                if(b<0)
                {
                    System.out.println("Invalid Number!!");
                    continue;
                }
                double result;
                switch(op)
                {
                    case '+':
                        result=a+b;
                        break;
                    case '-':
                        result=a-b;
                        break;
                    case '*':
                        result=a*b;
                        break;
                    case '/':
                        if(b==0)
                        {
                            throw new DivideByZeroException("Can't divide by zero!");
                        }
                        result=a/b;
                        break;

                    case '%':
                        result=a%b;
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid operator!");
                }
                System.out.println("=======================");
                System.out.println("Result : "+result);
                System.out.println("=======================");
                success=true;
            }
            catch(NumberFormatException e)
            {
                System.out.println("Invalid Number!!");
            }
            catch(DivideByZeroException e)
            {
                System.out.println(e.getMessage());
            }
            catch(IllegalArgumentException e)
            {
                System.out.println(e.getMessage());
            }
            finally
            {
                System.out.println("Operation completed.");
            }
        }
        sc.close();
    }
}