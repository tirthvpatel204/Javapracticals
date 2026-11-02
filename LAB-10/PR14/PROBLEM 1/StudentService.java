import java.util.*;
public class StudentService{
    ArrayList<Student> list=new ArrayList<>();

    public void add(String name){
        if(name==null||name.isEmpty())
            throw new IllegalArgumentException("Invalid name");
        list.add(new Student(name));
    }

    public int count(){
        return list.size();
    }
}