package blocks;

class outclass
{
	{
		Blck2 b = new Blck2();
		System.out.println("non static outclass block");
	}
	
	static
	{
		//System.out.println("static outclass block");
		
	}
}


public class Blck2 
{
	{
		System.out.println("nonstatic within class block");
		outclass o = new outclass();
	}
	
	public static void main(String[] args)
	{
		outclass c = new outclass();
	}
}
