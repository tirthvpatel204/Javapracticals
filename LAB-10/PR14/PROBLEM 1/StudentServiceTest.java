import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentServiceTest{
    @Test
    void addStudent(){
        StudentService s=new StudentService();
        s.add("Tirth");
        assertEquals(1,s.count());
    }

    @Test
    void addTwoStudents(){
        StudentService s=new StudentService();
        s.add("Tirth");
        s.add("Rahul");
        assertEquals(2,s.count());
    }

    @Test
    void invalidName(){
        StudentService s=new StudentService();
        assertThrows(IllegalArgumentException.class,()->s.add(""));
    }
}