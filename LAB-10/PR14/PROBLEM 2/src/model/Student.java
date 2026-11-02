package model;
import java.io.Serializable;

public class Student implements Serializable{
    private static final long serialVersionUID=1L;
    public String name;

    public Student(String name){
        this.name=name;
    }
}