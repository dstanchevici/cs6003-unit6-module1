import java.util.*;

public class ArrayExample {

    public static void main (String[] argv)
    {
	int[] A = {1, 2, 3};
	System.out.println (A);
	System.out.println (Arrays.toString(A));

	int[] B = new int[] {1, 2, 3, 4};
	System.out.println (Arrays.toString(B));

	B = new int[] {1, 2, 3, 4, 5};
	System.out.println (Arrays.toString(B));

	System.out.println (Arrays.toString( new int[] {1, 2, 3, 4, 5, 6} ) );

	for (int i=0; i<B.length; i++) {
	    System.out.printf ("Element #%2d = %2d\n", i, B[i]);
	}

	System.out.println ("Now with for-each loop:");
	int counter = 0;
	for (int k: B) {
	    System.out.printf ("Element #%2d = %2d\n", counter++, k);
	}

	String[] words = {"this", "and", "that"};
	Arrays.sort (words);
	for (String w: words) {
	   
	}
	
    }
}
