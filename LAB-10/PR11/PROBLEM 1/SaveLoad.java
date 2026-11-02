import java.io.*;
class Student implements Serializable{
    int id;
    String name;
    transient int marks;
    Student(int id,String name,int marks){
        this.id=id;
        this.name=name;
        this.marks=marks;
    }
}
public class SaveLoad{
    public static void main(String[] args)throws Exception{
        Student[] s={
            new Student(1,"Tirth",90),
            new Student(2,"Rahul",80)
        };
        ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("student.txt"));
        out.writeObject(s);
        out.close();
        ObjectInputStream in=new ObjectInputStream(new FileInputStream("student.txt"));
        Student[] a=(Student[])in.readObject();
        in.close();
        for(Student x:a)
            System.out.println(x.id+" "+x.name+" "+x.marks);
    }
}