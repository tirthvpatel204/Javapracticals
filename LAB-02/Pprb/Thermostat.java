class Thermostat {

    private String location;
    private int temperature;

    private static final int min=16;
    private static final int max=30;
    private static int actco=0;
    Thermostat(String location, int startTemp) 
    {
        this.location = location;

        if (startTemp>=min && startTemp<=max)
             {
            this.temperature = startTemp;
        } else {
            this.temperature = 22;
        }

        actco++;
    }
    Thermostat(String location) 
    {
        this(location, 22);
    }
    void raise() 
    {
        if (temperature<max) 
        {
            temperature++;
        } else 
            {
            System.out.println(location + " is already at maximum temperature (" + MAX_TEMP + "°C)");
        }
    }
    void lower() 
    {
        if (temperature>min) 
        {
            temperature--;
        } else 
        {
            System.out.println(location + " is already at minimum temperature (" + MIN_TEMP + "°C)");
        }
    }
    void display() 
    {
        System.out.println(location + " Temperature = " + temperature + "°C");
    }
    static int getActiveCount() 
    {
        return actco;
    }

    public static void main(String[] args) 
    {

        Thermostat hall = new Thermostat("Hall");
        Thermostat bedroom = new Thermostat("Bedroom", 25);

        System.out.println("Increasing Hall Temperature:");
        for (int i=0; i<10; i++) 
        {
            hall.raise();
            hall.display();
        }

        System.out.println("\nDecreasing Hall Temperature:");
        for (int i=0; i<20; i++) 
        {
            hall.lower();
            hall.display();
        }
        System.out.println("\nBedroom Status:");
        bedroom.display();
        System.out.println("\nActive Thermostats = " + Thermostat.getActiveCount());
    }
}