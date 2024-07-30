package interfacepackage;

interface puli
{
	public abstract void dog();  //abstract method	
	
	static void h()
	{
		System.out.println(" static");
	}
	
	default void a()
	{
		System.out.println("default ");
	}	
}
public class Inter3 implements puli
{
	public void dog()
	{
		System.out.println("hello");
	}	
	public static void main(String[] args)
	{
		Inter3 p = new Inter3();
		p.dog();
		p.a();
		puli.h();		
	}
}
