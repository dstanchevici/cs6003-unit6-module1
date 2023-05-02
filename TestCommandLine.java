public class TestCommandLine {

    public static void main (String[] argv)
    {
	int totalLength = 0;
	for (int i=0; i<argv.length; i++) {
	    System.out.println ("Arg#" + i + " = " + argv[i] + ", length = " + argv[i].length() );
	    totalLength += argv[i].length();
	}
	double average = (double) totalLength / argv.length;
	System.out.println ("Average: " + average);
    }
}
