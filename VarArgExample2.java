
public class VarArgExample2 {

    public static void main (String[] argv)
    {
	System.out.println ( max(1) );
	System.out.println ( max(1,2) );
	System.out.println ( max(1,2,3) );
	System.out.println ( max(1,2,3,4) );
    }

    static int max (int a, int ... remaining)
    {
	int max = a;
	for (int k: remaining) {
	    if (k>max) {
		max = k;
	    }
	}
	return max;
    }

}
