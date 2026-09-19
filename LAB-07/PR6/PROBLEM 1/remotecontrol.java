//package LAB-07.PR6.PROBLEM 1;
interface Switchable {
    void on();
    void off();
    default void toggle() 
    {
        on();
    }
}
class Fan implements Switchable 
{
    public void on() 
    {
        System.out.println("Fan ON");
    }
    public void off() 
    {
        System.out.println("Fan OFF");
    }
}
class Light implements Switchable 
{
    public void on() 
    {
        System.out.println("Light ON");
    }
    public void off() 
    {
        System.out.println("Light OFF");
    }
}
interface Check 
{
    boolean check(Switchable s,int hour);
}
public class remotecontrol 
{
    public static void main(String[] args) 
    {
        Switchable[] devices={new Fan(),new Light()};
        for (Switchable d:devices) 
        {
            d.toggle();
        }
        Check c1=new Check() 
        {
            public boolean check(Switchable s,int hour) 
            {
                return hour<22;
            }
        };
        Check c2=(s,hour)->hour<22;
        System.out.println(c1.check(devices[0],10));
        System.out.println(c2.check(devices[1],23));
    }
}
