import java.util.Scanner;
public class driver2 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String[] logs= 
        {
                "10:05 alice Hello there",
                "10:10 bob Good Morning",
                "WrongLine"
        };
        System.out.print("Enter keyword : ");
        String keyword=sc.nextLine().toLowerCase();
        int count=0;
        StringBuilder sb=new StringBuilder();
        for(String line:logs) 
        {
            String[] parts=line.split(" ", 3);
            if (parts.length<3)
            {
                continue;
            }
            String time=parts[0];
            String user=parts[1];
            String message=parts[2];
            if(message.toLowerCase().contains(keyword)) 
            {
                count++;
                sb.append(time)
                    .append(" ")
                    .append(user)
                    .append(": ")
                    .append(message)
                    .append("\n");
            }
        }
        System.out.println("Matches : " + count);
        System.out.println(sb);
    }
}