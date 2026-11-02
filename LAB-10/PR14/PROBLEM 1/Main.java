import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        StudentService s=new StudentService();

        while(true){
            System.out.println("1.Add 2.Count 3.Exit");
            int ch=sc.nextInt();
            sc.nextLine();

            if(ch==1){
                System.out.print("Name: ");
                s.add(sc.nextLine());
            }else if(ch==2){
                System.out.println("Count: "+s.count());
            }else if(ch==3){
                break;
            }else{
                throw new IllegalArgumentException("Invalid choice");
            }
        }
        sc.close();
    }
}