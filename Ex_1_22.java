public class Ex_1_22 {

    public static int squareIt (int inputInteger)
    {
	if (inputInteger >= 0) 
	    return (inputInteger * inputInteger);
	
    }

    public static void main (String[] argv)
    {
	int i = 5;
	System.out.println ("The square of " + i + " is " + squareIt(i) );
    }
}
