
public class Interleave {

    public static void main (String[] argv)
    {
	System.out.println ( interleave("xx","oo"));          // xoxo
	System.out.println ( interleave("aaaaa","bbbbbbbb")); // abababababbbb
	System.out.println ( interleave("?| */"," |/*"));
	// What does the last interleaved string mean?
    }

    static String interleave (String str1, String str2)
    {
	String str3 = "";
	int ind1=0, ind2=0;

	while ( (ind1<str1.length()) ||  (ind2<str2.length()) ) {

	    // str1 is empty, but str2 is not 
	    while ( (ind1 >= str1.length()) && (ind2 < str2.length()) ) {
		str3 += str2.charAt (ind2++);
	    }

	    // str2 is empty, but str1 is not
	    while ( (ind2 >= str2.length()) && (ind1 < str1.length()) ) {
	        str3 += str1.charAt (ind1++);
	    }

	    // both strs have characters
	    while ( (ind1<str1.length()) &&  (ind2<str2.length()) ) {
		str3 += str1.charAt (ind1++);
		str3 += str2.charAt (ind2++);
	    }
	}

	return str3;
    }

}
