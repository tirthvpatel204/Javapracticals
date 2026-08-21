class MyResource implements AutoCloseable
{
    MyResource()
    {
        System.out.println("Resource opened.");
    }
    public void use()
    {
        System.out.println("Resource is being used.");
    }
    @Override
    public void close()
    {
        System.out.println("Resource closed.");
    }
}
public class AutoCloseDemo
{
    public static void main(String[] args)
    {
        try(MyResource resource=new MyResource())
        {
            resource.use();
            System.out.println("Exception is thrown inside try block.");
            throw new RuntimeException("Original error occurred!");
        }
        catch(Exception e)
        {
            System.out.println("Reported error: "+e.getMessage());
        }
    }
}