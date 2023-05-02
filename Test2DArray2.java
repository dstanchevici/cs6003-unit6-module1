public class Test2DArray2 {

    public static void main (String[] argv)
    {
	int size = 5;
	int[][] triangle;

	triangle = new int [size][];

	// Construct a Pascal's triangle
	for (int i=0; i<size; i++) {
	    triangle[i] = new int [i+1];
	    for (int j=0; j<triangle[i].length; j++) {
		if (i<2) {
		    triangle[i][j] = 1;
		}
		else {
		    triangle[i][0] = 1;
		    triangle[i][triangle[i].length-1] = 1;

		    for (int k=1; k<triangle[i].length-1; k++) {
			triangle[i][k] = triangle[i-1][k] + triangle[i-1][k-1];
		    }
		}
	    }
	}

	System.out.println ("Pascal's triangle:");
	for (int i=0; i<size; i++) {
	    
	    for (int k=0; k<(size-1-i); k++) {
	        System.out.print (" ");
	    }
	    
	    for (int j=0; j<triangle[i].length; j++) {
		System.out.print (triangle[i][j] + " ");
	    }
	    System.out.println ();
	}
    }

}
