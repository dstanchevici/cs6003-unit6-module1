
public class LoopExercise2 {

    public static void main (String[] argv)
    {
	int[] A = {-1, 1, -3, 2, -5, 3, 4, -4, 5};


	int sum = 0;

	// WRITE YOUR LOOP HERE.
	// Use the ternary operator to add elements only if they are positive.

	for (int i=0; i<A.length; i++) {
	    //int addend = (A[i] >= 0) ? A[i] : 0;
	    //sum += addend;

	    sum += (A[i]>0) ? A[i] : 0;
	}

	System.out.println (sum);
	
    }

}
