package blocks;
/*
class cls2
{
	{
		System.out.println("cls2 class");
	}
}

class cls
{
	{
		System.out.println("hello");
	}
	
		
	{
		cls2 c2 = new cls2();
	}
}
*/
public class Blck1 
{	
	
	static
	{
		System.out.println("static block within class");
	}
	
	{
		System.out.println("non static block within class");
	}
	
	public static void main(String[] args)
	{
		
	}
}
