class A {

    public static void main (String[] argv)
    {
	System.out.println ("Hello World again!");
    }

}

public class TestFileName {

    public static void main (String[] argv)
    {
	System.out.println ("Hello World!");

	A a = new A();
	String[] args = {"some", "arguments"};
	a.main(args);
    }

}
