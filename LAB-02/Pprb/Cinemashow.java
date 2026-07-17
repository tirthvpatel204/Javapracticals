class Cinemashow 
{

    String title;
    private int seatsAvailable;
    private final int capacity;
    private static int totalBooked=0;
    CinemaShow(String title, int capacity) 
    {
        this.title=title;
        this.capacity=capacity;
        this.seatsAvailable=capacity;
    }