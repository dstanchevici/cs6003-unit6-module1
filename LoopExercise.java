
public class LoopExercise {

    public static void main (String[] argv)
    {
	int[] A = {-1, 1, -3, 2, -5, 3, 4, -4, 5};

	// Use a combination of do-while and continue
	// to sum up only the positive elements of the array A.
	int sum = 0;

	// WRITE YOUR LOOP HERE.
	int i = 0;
	do {
	    if (A[i] <  0) {
		i++;
		continue;
	    }
	    sum += A[i];
	    i++;
	} while (i < A.length);

	System.out.println (sum);       // Should print 15.
    }

}
