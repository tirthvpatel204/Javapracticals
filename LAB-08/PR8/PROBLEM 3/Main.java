class MyResource implements AutoCloseable 
{
    void use() 
    {
        System.out.println("Resource is used");
        throw new RuntimeException("Error occurred");
    }
    public void close() 
    {
        System.out.println("Resource closed");
    }
}
public class Main{
    public static void main(String[] args) 
    {
        try(MyResource r=new MyResource()) 
        {
            r.use();
        }catch (Exception e) 
        {
            System.out.println(e.getMessage());
        }
    }
}

