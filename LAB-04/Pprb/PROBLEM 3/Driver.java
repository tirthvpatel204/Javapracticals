import java.util.regex.*;
public class Driver 
{
    public static void main(String[] args) 
    {
        String template = "Dear {name}, order {id} ships {date}.";
        String[] names = 
        {
                "name",
                "id"
        };
        String[] values= 
        {
                "Riya",
                "A07"
        };
        Pattern p = Pattern.compile("\\{(\\w+)\\}");
        Matcher m=p.matcher(template);
        StringBuilder sb=new StringBuilder();
        int last=0;
        while(m.find()) 
        {
            sb.append(template.substring(last, m.start()));
            String key=m.group(1);
            String value="[?]";
            for(int i=0; i<names.length; i++) 
            {
                if(names[i].equals(key)) 
                {
                    value=values[i];
                    break;
                }
            }
            sb.append(value);
            last = m.end();
        }
        sb.append(template.substring(last));
        System.out.println(sb);
    }
}
