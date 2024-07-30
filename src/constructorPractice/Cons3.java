package constructorPractice;

public class Cons3 
{
	int a, b;
	double d;
	Cons3()
	{
		System.out.println(" 1 ");
	}
	
	Cons3(int x, int y)
	{
		System.out.println(" 2 ");
	}
	
	Cons3(int x , double y)
	{
		System.out.println(" 3 ");
	}
	
	Cons3(double y, int x)
	{
		System.out.println(" 4 ");
	}
	public static void main(String[] args) 
	{
		Cons3 c = new Cons3(10.1, 10);
		
	}
}
