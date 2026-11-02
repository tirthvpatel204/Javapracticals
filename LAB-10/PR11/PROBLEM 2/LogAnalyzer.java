import java.nio.file.*;
import java.util.*;
public class LogAnalyzer{
    public static void main(String[] args)throws Exception{
        Files.write(Path.of("log1.txt"),Arrays.asList("Java is easy","Hello world"));
        Files.write(Path.of("log2.txt"),Arrays.asList("Java programming","Learn Java"));
        int lines=0,count=0;
        for(String file:new String[]{"log1.txt","log2.txt"}){
            Path path=Path.of(file);
            System.out.println(file+" Size: "+Files.size(path));
            for(String line:Files.readAllLines(path)){
                lines++;
                if(line.contains("Java"))
                    count++;
            }
        }
        System.out.println("Total lines: "+lines);
        System.out.println("Keyword count: "+count);
    }
}