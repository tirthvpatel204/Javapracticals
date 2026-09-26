import java.lang.annotation.*;
import java.lang.reflect.*;
@Retention(RetentionPolicy.RUNTIME)
@interface Column 
{ 
    String name(); 
}
class Student 
{
    @Column(name="name") String name;
    @Column(name="age") int age;
}
public class Main 
{
    public static void main(String[] args) throws Exception 
    {
        String[] header={"name","age"};
        String[] data={"Tirth","20"};
        Student s=new Student();
        for(Field f:Student.class.getDeclaredFields()) 
        {
            Column c=f.getAnnotation(Column.class);
            for(int i=0;i<header.length;i++) 
            {
                if(header[i].equals(c.name())) 
                {
                    if(f.getType()==int.class)
                    {
                        f.set(s,Integer.parseInt(data[i]));
                    }else
                    {
                        f.set(s,data[i]);
                    }
                }
            }
        }
        System.out.println(s.name);
        System.out.println(s.age);
    }
}