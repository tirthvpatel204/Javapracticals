class Thermostat 
{
    private String loca;
    private int temp;
    private static final int min=16;
    private static final int max=30;
    private static int actacount=0;

    Thermostat(String loca, int startTemp) 
    {
        this.loca=loca;

        if (startTemp>=min && startTemp<=max)
            temp=startTemp;
        else
            temp=22;
           actacount++;
    }
    Thermostat(String loca) 
    {
        this(loca, 22);
    }

    void raise() 
    {
        if (temp<max)
            temp++;
        else
            System.out.println("Already at maximum (30)");
    }

    void lower() 
    {
        if (temp>min)
            temp--;
        else
            System.out.println("Already at minimum (16)");
    }

    void print()
    {
        System.out.println(loca + " Temperature = " + temp);
    }

    static int getActiveCount() 
    {
        return actacount;
    }
    public static void main(String[] args)
     {
        Thermostat t1 = new Thermostat("Hall");
        Thermostat t2 = new Thermostat("Bedroom", 25);
        for (int i = 1; i <= 10; i++) 
        {
            t1.raise();
            t1.print();
        }
        for (int i = 1; i <= 20; i++) 
        {
            t1.lower();
            t1.print();
        }
        System.out.println("Active Thermostats = " + Thermostat.getActiveCount());
    }
}