abstract class Employee 
{
    String name;
    int id;
    Employee(String name,int id) 
    {
        this.name=name;
        this.id=id;
    }
    abstract double monthlySalary();
}
class FullTime extends Employee 
{
    double salary;
    FullTime(String name,int id,double salary) 
    {
        super(name,id);
        this.salary=salary;
    }
    double monthlySalary() 
    {
        return salary;
    }
}
class PartTime extends Employee 
{
    int hours;
    double rate;
    PartTime(String name,int id,int hours,double rate) 
    {
        super(name,id);
        this.hours=hours;
        this.rate=rate;
    }
    double monthlySalary() 
    {
        return hours*rate;
    }
}
class Intern extends Employee 
{
    double stipend;
    Intern(String name,int id,double stipend) 
    {
        super(name, id);
        this.stipend=stipend;
    }
    double monthlySalary() 
    {
        return stipend;
    }
}

public class Payroll 
{
    public static void main(String[] args) 
    {
        Employee[] employees={
            new FullTime("Tirth",101,25300),
            new PartTime("Rahul",102,80,320),
            new Intern("Amit",103,10000)
        };
        double total=0;
        for(Employee e:employees) 
        {
           double salary = e.monthlySalary();
           System.out.println(e.name+" Salary: "+salary);
           if(e instanceof Intern) 
           {
               System.out.println("Note: This employee is an Intern.");
           }
            total+=salary;
        }
        System.out.println("Total Salary: "+total);
    }
}