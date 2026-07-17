import java.util.Scanner;

record Vehicle(String number, String type) {}

public class TollBooth {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int total = 0;
        int bike = 0;
        int car = 0;
        int truck = 0;

        while (true) {

            System.out.print("Enter Vehicle Number (or done): ");
            String number = sc.next();

            if (number.equalsIgnoreCase("done")) {
                break;
            }

            // Vehicle Number Validation
            if (!number.matches("[A-Za-z0-9]+")) {
                System.out.println("Invalid Vehicle Number! Use only letters and digits.");
                continue;
            }

            System.out.print("Enter Vehicle Type (bike/car/truck): ");
            String type = sc.next().toLowerCase();

            // Vehicle Type Validation
            if (!(type.equals("bike") || type.equals("car") || type.equals("truck"))) {
                System.out.println("Invalid Vehicle Type!");
                continue;
            }

            Vehicle v = new Vehicle(number, type);

            switch (v.type()) {

                case "bike":
                    total += 20;
                    bike++;
                    break;

                case "car":
                    total += 50;
                    car++;
                    break;

                case "truck":
                    total += 150;
                    truck++;
                    break;
            }
        }

        System.out.println("\n===== Toll Booth Report =====");
        System.out.println("Total Toll Collected = " + total);

        if (bike == 0 && car == 0 && truck == 0) {
            System.out.println("No vehicles entered.");
        } else if (bike >= car && bike >= truck) {
            System.out.println("Most Frequent Vehicle = Bike");
        } else if (car >= bike && car >= truck) {
            System.out.println("Most Frequent Vehicle = Car");
        } else {
            System.out.println("Most Frequent Vehicle = Truck");
        }

        sc.close();
    }
}