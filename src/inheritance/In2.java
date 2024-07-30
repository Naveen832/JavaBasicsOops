package inheritance;

class animal
{
	void method()
	{
		System.out.println("hello animal");
	}
}

class dog extends animal
{
	void method()
	{
		System.out.println("hello dog");
	}
}

class cat extends animal
{
	void method()
	{
		System.out.println("hello cat");
	}
}

class rat extends animal
{
	void method()
	{
		System.out.println("hello rat");
	}
}




public class In2 
{
	public static void main(String[] args)
	{
		animal a = new dog();
		a.method();
	}
}
