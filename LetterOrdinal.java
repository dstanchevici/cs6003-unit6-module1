
public class LetterOrdinal {

    public static void main (String[] argv)
    {
	System.out.println ("e: " + ordinal('e'));
	System.out.println ("E: " + ordinal('E'));
    }

    static int ordinal (char ch)
    {
	if (ch >= 'a' && ch <= 'z') {
	    return (int)ch - (int) 'a' + 1;
	}
	else if (ch >= 'A' && ch <= 'Z') {
	    return (int)ch - (int) 'A' + 1;
	}
	else {
	    System.out.println ("Not a letter");
	    return -1;
	}

    }

}
