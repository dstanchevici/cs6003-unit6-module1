public class MethodExample3 {

    static int add (int a, int b)
    {
	return a+b;
    }
    
    static int add (int a, int b, int c)
    {
	return a+b+c;
    }
    
    static double add (double a, double b)
    {
	return a+b;
    }
    
    static int add (double a, double b)
    {
	return (int) a+b;
    }
    
    static String add (String a, String b)
    {
	return a+b;
    }
    
    public static void main (String[] argv)
    {
	System.out.println ( add(1,2) );
	System.out.println ( add(1,2,3) );
	System.out.println ( add(1.1,2.2) );
	System.out.println ( add("hello", "world") );
	
    }
    
}
