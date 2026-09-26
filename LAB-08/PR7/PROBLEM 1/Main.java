import java.lang.annotation.*;
import java.lang.reflect.*;
@Retention(RetentionPolicy.RUNTIME)
@interface NotBlank {}
@Retention(RetentionPolicy.RUNTIME)
@interface MaxLength 
{ 
    int value(); 
}
class Signup 
{
    @NotBlank String name;
    @MaxLength(10) String password;
}
public class Main 
{
    public static void main(String[] args) throws Exception 
    {
        Signup s=new Signup();
        s.name="";
        s.password="abcdefghijk";
        for(Field f:Signup.class.getDeclaredFields()) 
        {
            String x=(String)f.get(s);
            if(f.isAnnotationPresent(NotBlank.class) && x.isEmpty())
            {
                System.out.println("Name is blank");
            }
            if(f.isAnnotationPresent(MaxLength.class) && x.length()>10)
            {
                 System.out.println("Password is too long");
            }
        }
    }
}