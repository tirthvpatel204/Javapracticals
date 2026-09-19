class demol  
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
    }
}
