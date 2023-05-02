public class MethodExample {

    static void printHello ()
    {
	System.out.println ("Ok then, hello");
    }

    static boolean areSame (int k, String intString)
    {
	try {
	    if (Integer.parseInt(intString) == k) {
		return true;
	    }
	    return false;
	}
	catch (NumberFormatException e) {
	    return false;
	}
    }

    static void changeIt (int m)
    {
	m = m + 1;
	System.out.println (m);
    }

    public static void main (String[] argv)
    {
	printHello ();
	System.out.println (areSame(5, "5"));
	System.out.println (areSame(5, "6"));
	System.out.println (areSame(5, "five"));

	int n = 1;
	changeIt (n);
	System.out.println (n);
	
    }
}
