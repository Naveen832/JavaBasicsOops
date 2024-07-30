package inheritance;

class c1
{
	final void method1()
	{
		System.out.println("method1");
	}
}
class c2 extends c1
{
	void method2()
	{
		System.out.println("method2");
		super.method1();
	}
}
public class In1 
{
	public static void main(String[] args)
	{
		c2 c = new c2();
		c.method2();
	}
}
