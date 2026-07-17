public class Thermostat {

    // Instance variables
    private String location;
    private int temperature;

    // Constants
    private static final int MIN_TEMP = 16;
    private static final int MAX_TEMP = 30;

    // Static variable
    private static int activeCount = 0;

    // Constructor with location and temperature
    public Thermostat(String location, int startTemp) {
        this.location = location;

        if (startTemp >= MIN_TEMP && startTemp <= MAX_TEMP) {
            this.temperature = startTemp;
        } else {
            this.temperature = 22; // Default temperature
        }

        activeCount++;
    }

    // Constructor with default temperature
    public Thermostat(String location) {
        this(location, 22);
    }

    // Increase temperature
    public void raise() {
        if (temperature < MAX_TEMP) {
            temperature++;
        } else {
            System.out.println(location + " is already at maximum temperature (" + MAX_TEMP + "°C)");
        }
    }

    // Decrease temperature
    public void lower() {
        if (temperature > MIN_TEMP) {
            temperature--;
        } else {
            System.out.println(location + " is already at minimum temperature (" + MIN_TEMP + "°C)");
        }
    }

    // Display current temperature
    public void display() {
        System.out.println(location + " Temperature = " + temperature + "°C");
    }

    // Return number of active thermostats
    public static int getActiveCount() {
        return activeCount;
    }

    // Main method
    public static void main(String[] args) {

        Thermostat hall = new Thermostat("Hall");
        Thermostat bedroom = new Thermostat("Bedroom", 25);

        System.out.println("Increasing Hall Temperature:");

        for (int i = 0; i < 10; i++) {
            hall.raise();
            hall.display();
        }

        System.out.println("\nDecreasing Hall Temperature:");

        for (int i = 0; i < 20; i++) {
            hall.lower();
            hall.display();
        }

        System.out.println("\nBedroom Status:");
        bedroom.display();

        System.out.println("\nActive Thermostats = " + Thermostat.getActiveCount());
    }
}