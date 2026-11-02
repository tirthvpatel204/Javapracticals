import java.util.*;
public class UniqueVisitors{
    public static void main(String[] args){
        String[] names={"Tirth","Rahul","Amit","Tirth","Rahul","Neha"};
        HashSet<String> set=new HashSet<>(Arrays.asList(names));
        LinkedHashSet<String> users=new LinkedHashSet<>(Arrays.asList(names));
        System.out.println("Unique users: "+set.size());
        int count=0;
        for(String name:users){
            if(count==3)break;
            System.out.println(name);
            count++;
        }
    }
}