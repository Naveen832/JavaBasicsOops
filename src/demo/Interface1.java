package demo;

interface a1
{
	void method1();	
}

interface a2
{
	void method2();
}

 class a3 implements a2,a1
{
	public void method2()
	{
		System.out.println("hello this is method2");
	}
	public void method1()
	{
		System.out.println("hello this is mehtod1");
	}
}

public class Interface1 
{

	public static void main(String[] args) 
	{
		a3 obj = new a3();
		obj.method1();
		obj.method2();
	}

}
