package interfacepackage;
import java.util.Scanner;
interface i11
{
	public static final int i=10;
	public abstract void demo();
	
	private void e()
	{
		System.out.println("private - in interface");
	}
	default void d()
	{
		System.out.println("default - in interface");		
	}
	private static void f()
	{
		System.out.println("static - in interface");
	}	
}

abstract class i12 implements i11
{
	public static final int j =24;
	public abstract void demo2();
	public static void demo3()
	{
		System.out.println("public static - abstract class");
	}
	private static void demo4()
	{
		System.out.println("private static  - abstract class");
	}
	protected static void demo5()
	{
		System.out.println("protected static - abstract class");
	}
}

public abstract class Inter4 extends i12
{
	public static void main(String args[])
	{
		System.out.println(i12.i);
		System.out.println(i12.j);
		i12.demo3();
		i12.demo5();
		
		Scanner sc = new Scanner(System.in);
		//String a = sc.next();
		//String b = sc.nextLine();
		
		//System.out.println(a);
		//System.out.println(b);
		
		String t = "2000i";
		int i = Integer.parseInt(t);
		System.out.println(i);
		
		
	}
}
