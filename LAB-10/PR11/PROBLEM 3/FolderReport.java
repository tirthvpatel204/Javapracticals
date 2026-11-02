import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.*;
public class FolderReport{
    public static void main(String[] args)throws Exception{
        try(PrintWriter out=new PrintWriter("report.txt")){
            Files.walk(Path.of(".")).filter(Files::isRegularFile).forEach(file->{
                try{
                    BasicFileAttributes a=Files.readAttributes(file,BasicFileAttributes.class);
                    out.println(file.getFileName()+" | "+a.size()+" bytes | "+a.lastModifiedTime());
                }catch(Exception e){
                    System.out.println("Error reading file");
                }
            });
        }
        System.out.println("Report created!");
    }
}