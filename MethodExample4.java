
public class MethodExample4 {

    public static void main (String[] argv)
    {
	System.out.println ( max(1,2) );
	System.out.println ( max(max(1.1,2.2),3.3) );
	System.out.println ( max(max("alpha","beta"), max("gamma","delta")) );
    }

    // WRITE YOUR CODE HERE
    // In each version of max, use a single return statement with
    // the ternary operator.

    static int max (int a, int b)
    {
	return (a>b) ? a : b;
    }

    static double max (double a, double b)
    {
	return (a>b) ? a : b;
    }

    static String max (String a, String b)
    {
	return (a.compareTo(b)>0) ? a : b;
    }
    
    
}
