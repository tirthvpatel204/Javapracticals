//package LAB-07.PR6.PROBLEM 2;
interface notifier 
{
    void send(String msg);
}
interface urgent 
{
}
class urgentEmail implements notifier,urgent 
{
    public void send(String msg) 
    {
        System.out.println("Email: "+msg);
    }
}
public class notification 
{
    public static void main(String[] args) 
    {
        notifier email=msg->System.out.println("Email: "+msg);
        notifier sms=msg->System.out.println("SMS: "+msg);
        notifier[] n={email,sms};
        for(notifier x:n) 
        {
            x.send("Hello");
        }
        urgentEmail e=new urgentEmail();
        e.send("Urgent Message");
        e.send("Urgent Message");
    }
}
