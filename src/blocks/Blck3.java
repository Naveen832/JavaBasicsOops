package blocks;

class out
{
	//static
	{
		System.out.println("outside class - block");
	
	}
	
	static
	{
		out s = new out();
	}
}

public class Blck3 
{
	
	{
		out o = new out();
	}
	public static void main(String[] args)
	{
		//Blck3 b = new Blck3();
	}
}
