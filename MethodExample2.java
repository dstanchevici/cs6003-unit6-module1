public class MethodExample2 {

    static int add (int a, int b)
    {
	System.out.println (a + " + " + b + " = " + (a+b));
	return (a+b);
    }

    public static void main (String[] argv)
    {
	int x = 1, y = 2;
	int z = add ( add( add(1,2), add(3,4) ), 5);
	System.out.println (z);
    }
}
