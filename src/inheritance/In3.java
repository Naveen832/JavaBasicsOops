package inheritance;

class parent
{
	private void method()
	{
		System.out.println("parent method");
	}
}

class child extends parent
{
	 private void method()
	{
		System.out.println("child method");

	}
}

public class In3 
{
	//child c = new child();
	public static void main(String[] args)
	{
		child c = new child();
		//c.method();
	}
	
}
