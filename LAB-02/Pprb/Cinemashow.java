import java.util.Scanner;

public class CinemaShow {

    // Instance variables
    private String title;
    private int seatsAvailable;
    private final int capacity;

    // Static variable
    private static int totalBooked = 0;

    // Constructor with title and capacity
    public CinemaShow(String title, int capacity) {
        this.title = title;
        this.capacity = capacity;
        this.seatsAvailable = capacity;
    }

    // Constructor with default capacity
    public CinemaShow(String title) {
        this(title, 100);
    }

    // Book seats
    public boolean book(int n) {
        if (n <= seatsAvailable) {
            seatsAvailable -= n;
            totalBooked += n;
            return true;
        }
        return false;
    }

    // Cancel seats
    public void cancel(int n) {
        seatsAvailable += n;

        if (seatsAvailable > capacity) {
            seatsAvailable = capacity;
        }
    }

    // Getter for available seats
    public int getSeatsAvailable() {
        return seatsAvailable;
    }

    // Getter for total booked seats
    public static int getTotalBooked() {
        return totalBooked;
    }

    // Main Method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input movie details
        System.out.print("Enter Movie Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Cinema Capacity: ");
        int capacity = sc.nextInt();

        // Create object
        CinemaShow show = new CinemaShow(title, capacity);

        System.out.println("\nCinema Show Created Successfully!");
        System.out.println("Movie Title      : " + title);
        System.out.println("Total Capacity   : " + capacity);
        System.out.println("Available Seats  : " + show.getSeatsAvailable());

        // First Booking
        System.out.print("\nEnter seats to book: ");
        int bookSeats = sc.nextInt();

        if (show.book(bookSeats)) {
            System.out.println("Booking Successful.");
        } else {
            System.out.println("Booking Failed! Not enough seats available.");
        }

        System.out.println("Available Seats: " + show.getSeatsAvailable());

        // Cancellation
        System.out.print("\nEnter seats to cancel: ");
        int cancelSeats = sc.nextInt();

        show.cancel(cancelSeats);

        System.out.println("Cancellation Successful.");
        System.out.println("Available Seats: " + show.getSeatsAvailable());

        // Second Booking
        System.out.print("\nEnter seats to book again: ");
        int secondBooking = sc.nextInt();

        if (show.book(secondBooking)) {
            System.out.println("Booking Successful.");
        } else {
            System.out.println("Booking Failed! Not enough seats available.");
        }

        System.out.println("Available Seats: " + show.getSeatsAvailable());

        // Total booked seats
        System.out.println("\nTotal Booked Seats = " + CinemaShow.getTotalBooked());

        sc.close();
    }
}
