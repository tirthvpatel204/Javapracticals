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

            System.out.print("Enter Vehicle Type (bike/car/truck): ");
            String type = sc.next().toLowerCase();

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

                default:
                    System.out.println("Invalid Type");
            }
        }

        System.out.println("Total Toll = " + total);

        if (bike >= car && bike >= truck)
            System.out.println("Most Frequent = bike");
        else if (car >= bike && car >= truck)
            System.out.println("Most Frequent = car");
        else
            System.out.println("Most Frequent = truck");

        sc.close();
    }
}