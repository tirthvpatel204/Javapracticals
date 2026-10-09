/*class demol  
{
    public static void main(String[] args)    
    {
        String a="Tirth";
        String b="Patel";
        System.out.println("String 'a' Length : "+a.length());
        System.out.println("String 'b' Length : "+b.length());
        System.out.println("String charAt : "+a.charAt(3));
        System.out.println(a.equalsIgnoreCase(b));
        System.out.println(a.equals(b));
        System.out.println(a.concat(b));
        System.out.println(a.toUpperCase());
        System.out.println(a.toLowerCase());
        System.out.println(a.substring(0,2));
        String c="Patel";
        System.out.println(b.equals(c));
        System.out.println(b.equalsIgnoreCase(c));
        System.out.println("---------------------------------------------------------");
        String p="Tirth";
        String q="Tirth";
        System.out.println(p.compareTo(q));
        System.out.println(p.replace('i','e'));
        String m="    Tirth            ";
        System.out.println(m.trim());
        String l="Tirth Patel";
        System.out.println(l.startsWith("Tirth"));
        System.out.println(a.endsWith("Patel"));
        System.out.println(l.contains("Patel"));
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        StringBuffer sb=new StringBUffer("Tirth");
        sb.append("Java");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
}
*/

/*class demol
{
    public static void main(String[] args)
    {
        StringBuffer sb=new StringBuffer("Tirth");
        sb.append("Patel");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
}*/

/* RegEx  */
import java.util.regex.Pattern;
class demo
{
    public static void main(String[] args)
    {
        String num="9876543210";
        boolean result=Pattern.matches("[0-9]{10}",num);
        System.out.println(result);
    }
}