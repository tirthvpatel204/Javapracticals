import java.util.*;
import model.Student;
import service.StudentService;

public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        StudentService s=new StudentService();

        while(true){
            System.out.println("1.Add 2.Count 3.Save 4.Load 5.Exit");
            int ch=sc.nextInt();
            sc.nextLine();

            if(ch==1){
                System.out.print("Name: ");
                s.add(sc.nextLine());
            }else if(ch==2){
                System.out.println("Count: "+s.count());
            }else if(ch==3){
                s.save();
                System.out.println("Saved");
            }else if(ch==4){
                s.load();
                System.out.println("Loaded");
            }else if(ch==5){
                break;
            }else{
                throw new IllegalArgumentException("Invalid choice");
            }
        }
        sc.close();
    }
}