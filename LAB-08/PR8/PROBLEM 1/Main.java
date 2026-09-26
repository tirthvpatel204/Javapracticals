import java.util.*;
class DivideByZeroException extends Exception {
    DivideByZeroException(String msg) {
        super(msg);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter two numbers: ");
                int a=sc.nextInt();
                int b=sc.nextInt();
                System.out.print("Enter operator: ");
                char op = sc.next().charAt(0);
                if (op=='/' && b==0) 
                {
                    throw new DivideByZeroException("Cannot divide by zero");
                }
                int ans;
                if(op=='+') {
                    ans=a+b;
                }else if(op=='-') 
                {
                    ans=a-b;
                }else if(op=='*') 
                {
                    ans=a*b;
                }else if(op=='/') {
                    ans=a/b;
                }else{
                    System.out.println("Invalid operator");
                    continue;
                }
                System.out.println("Result: " + ans);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid number. Try again.");
                sc.nextLine();
            } catch (DivideByZeroException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
