import java.util.Scanner;

class ParkingLot {

    int twoWheelers = 0;
    int fourWheelers = 0;

    int revenue = 0;

    void park(String type) {

        if (type.equalsIgnoreCase("two")) {

            if (twoWheelers < 2) {
                twoWheelers++;
                revenue = revenue + 20;
                System.out.println("Two wheeler parked.");
            } else {
                System.out.println("Parking into full section is refused.");
            }

        } else if (type.equalsIgnoreCase("four")) {

            if (fourWheelers < 1) {
                fourWheelers++;
                revenue = revenue + 40;
                System.out.println("Four wheeler parked.");
            } else {
                System.out.println("Parking into full section is refused.");
            }

        } else {
            System.out.println("Invalid vehicle type.");
        }
    }

    void leave(String type) {

        if (type.equalsIgnoreCase("two")) {

            if (twoWheelers > 0) {
                twoWheelers--;
                System.out.println("Two wheeler left.");
            } else {
                System.out.println("No two wheeler parked.");
            }

        } else if (type.equalsIgnoreCase("four")) {

            if (fourWheelers > 0) {
                fourWheelers--;
                System.out.println("Four wheeler left.");
            } else {
                System.out.println("No four wheeler parked.");
            }

        } else {
            System.out.println("Invalid vehicle type.");
        }
    }

    void display() {

        System.out.println("\n----- Final Status -----");
        System.out.println("Two Wheelers : " + twoWheelers);
        System.out.println("Four Wheelers : " + fourWheelers);
        System.out.println("Revenue : " + revenue);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ParkingLot p = new ParkingLot();

        int n;

        System.out.print("Enter number of parking/leave events: ");

        while (!sc.hasNextInt()) {
            System.out.print("Please enter a number: ");
            sc.next();
        }

        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("\nEvent " + i);

            System.out.print("Enter action (park/leave): ");
            String action = sc.next();

            System.out.print("Enter vehicle type (two/four): ");
            String type = sc.next();

            if (action.equalsIgnoreCase("park")) {
                p.park(type);
            }
            else if (action.equalsIgnoreCase("leave")) {
                p.leave(type);
            }
            else {
                System.out.println("Invalid action.");
            }
        }

        p.display();

        sc.close();
    }
}