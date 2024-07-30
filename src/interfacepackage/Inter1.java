package interfacepackage;

interface i1
{
	final static int i=10;
	void m1();
}
interface i2 extends i1
{
	static final int i=20;
	String m2();
}
public class Inter1 implements  i2
{	
	public void m1() 
	{		
		System.out.println("hello");
	}
	public String m2()
	{
		return "hello";
	}
public static void main(String[] args)
	{
		//Inter1 i= new Inter1();
		//i.m1();
		i2 inter = new Inter1();
		
		String j =inter.m2();
		System.out.println(inter.m2());
	
		
		
		
//		System.out.println(i);
		
		
		
		//i1 i = new Inter1();
	}

}
