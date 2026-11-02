import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import service.StudentService;
import java.io.*;

public class StudentServiceTest{
    @Test
    void addStudent(){
        StudentService s=new StudentService();
        s.add("Tirth");
        assertEquals(1,s.count());
    }

    @Test
    void invalidName(){
        StudentService s=new StudentService();
        assertThrows(IllegalArgumentException.class,()->s.add(""));
    }

    @Test
    void saveAndLoad()throws Exception{
        StudentService s=new StudentService();
        s.add("Tirth");
        s.add("Rahul");
        s.save();

        StudentService t=new StudentService();
        t.load();

        assertEquals(s.count(),t.count());
        assertEquals(s.list.get(0).name,t.list.get(0).name);
        assertEquals(s.list.get(1).name,t.list.get(1).name);

        new File("students.dat").delete();
    }
}