import java.lang.annotation.*;
import java.lang.reflect.*;
@Retention(RetentionPolicy.RUNTIME)
@interface Run{
}
class Test{
    @Run void test1()
    {
         System.out.println("Test 1"); 
    }
    @Run void test2() 
    { 
        System.out.println("Test 2"); 
    }
    void test3()
    { 
        System.out.println("Test 3"); 
    }
}

public class Main 
{
    public static void main(String[] args) throws Exception 
    {
        Test t=new Test();
        int count=0;
        for(Method m : Test.class.getDeclaredMethods()) {
            if(m.isAnnotationPresent(Run.class)) 
            {
                m.invoke(t);
                count++;
            }
        }
        System.out.println("Total: "+count);
    }
}