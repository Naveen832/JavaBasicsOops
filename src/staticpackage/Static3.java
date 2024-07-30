package staticpackage;

class class1
{
	static
	{
		System.out.println("static class1");
	}
}
class class2
{
	
}
class class3
{
	
}
public class Static3 
{
	static
	{
		System.out.println("within class");
	}
	public static void main(String[] args)
	{
		class1  c = new class1();
	}
}
