package service;
import model.Student;
import java.util.*;
import java.io.*;

public class StudentService{
    public ArrayList<Student> list=new ArrayList<>();

    public void add(String name){
        if(name==null||name.isEmpty())
            throw new IllegalArgumentException("Invalid name");
        list.add(new Student(name));
    }

    public int count(){
        return list.size();
    }

    public void save()throws Exception{
        ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("students.dat"));
        out.writeObject(list);
        out.close();
    }

   public void load()throws Exception{
    ObjectInputStream in=new ObjectInputStream(new FileInputStream("students.dat"));
    list=(ArrayList<Student>)in.readObject();
    in.close();
    for(Student s:list)
        System.out.println(s.name);
}
}