// This is an in-line comment. It ends at the end of this line.

// This line fixes the split-comment problem from ex. 1.2.

/* Use long comments placed
   inside block comments
   like this one */

/**
 * Finally, there is the type of documentation that
 * javadoc produces. To use this, you need to use javadoc
 * commands inside the comment block, like this one.
 * Note: each line must start with a '*' symbol.
 */

public class HelloWorldWithTooManyComments {

    /**
     * Javadoc usually includes comments for the class and each method within.
     * @author Rahul Simha
     * @return No value returned
     * @param command arguments (any number of strings)
     */

    public static void main (String[] argv)
    {
	System.out.println ("Hello World!"); // prints to screen
    }

}
