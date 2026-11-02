abstract class Shape 
{
    abstract double area();
}
class Circle extends Shape 
{
    double r;
    Circle(double r) 
    {
        this.r=r;
    }
    double area() 
    {
        return 3.14*r*r;
    }
}
class Rectangle extends Shape 
{
    double l,b;
    Rectangle(double l,double b) 
    {
        this.l=l;
        this.b=b;
    }
    double area() 
    {
        return l*b;
    }
}
class Triangle extends Shape 
{
    double b, h;
    Triangle(double b,double h) 
    {
        this.b=b;
        this.h=h;
    }
    double area() 
    {
        return 0.5*b*h;
    }
}
public class Shapepr 
{
    public static void main(String[] args) 
    {
        Shape s[]={
                new Circle(5),
                new Rectangle(4, 6),
                new Triangle(8, 5)
        };
        double total=0;
        double largest=0;
        for(Shape x:s) 
        {
            double a=x.area();
            System.out.println("Area = "+a);
            total+=a;
            if(a>largest)
                largest=a;
        }
        System.out.println("Total Area = "+total);
        System.out.println("Largest Area = "+largest);
    }
}