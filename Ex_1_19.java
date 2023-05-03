import java.util.*;

public class Ex_1_19 {

    static void changeIt (int m)
    {
	m = m + 1;
	System.out.println (m);
    }

    static void changeItArray (int[] A)
    {
	A[1] = A[1] + 1;
	System.out.println (Arrays.toString(A));
    }

    public static void main (String[] argv)
    {
	int[] B = {1, 2, 3, 4, 5};
	changeIt (B[0]);
	changeItArray (B);
	System.out.println (Arrays.toString(B));
    }
}
