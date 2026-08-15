abstract class Media 
{
    String title;
    int lateDays;
    Media(String title,int lateDays)
    {
        this.title=title;
        this.lateDays=lateDays;
    }
    abstract double lateFee();
}
class Movie extends Media 
{
    Movie(String title,int lateDays) 
    {
        super(title,lateDays);
    }
    double lateFee() 
    {
        return lateDays*5;
    }
}
class CD extends Media 
{
    CD(String title, int lateDays) 
    {
        super(title,lateDays);
    }
    double lateFee() {
        return lateDays*3;
    }
}
class Book extends Media 
{
    Book(String title,int lateDays) 
    {
        super(title,lateDays);
    }
    double lateFee() 
    {
        return lateDays*2;
    }
}
public class MediaFee 
{
    public static void main(String[] args) 
    {
        Media[] media={
            new Movie("Avengers",3),
            new CD("Music CD",4),
            new Book("Java Book",5)
        };
        double total=0;
        for(Media m:media) 
        {
            double fee=m.lateFee();
            System.out.println(m.title+"Late Fee: "+fee);
            total+=fee;
        }
        System.out.println("Total Late Fee: "+total);
    }
}