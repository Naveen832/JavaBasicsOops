package staticpackage;

public class Static1 
{
	 int a;
	static int b = 20; 
	
	void method1()
	{
		System.out.println(a);
		System.out.println(b);

	}
	
	void method2(int b)
	{
		this.b = b;
		
		System.out.println(a);
		System.out.println(b);

	}
	public static void main(String []args) 
	{
		Static1 s = new Static1();
		s.method1();
		s.method2(50);
	}
}
