package polymorphism;

public class Poly1 
{
	int x,y,z;
	double d;
	
	void sum(int a , int b)
	{
		x=a;
		y=b;
		System.out.println(x+y);
	}
	
	void sum(int a , double b)
	{
		x=a;
	double y=b;
		System.out.println(x+y);
	}
	
	void sum(double b, int a)
	{
		x=a;
	double y=b;
		System.out.println(x+y);
	}
	
	void sum(double  a , double b)
	{
		double x=a;
	double y=b;
		System.out.println(x+y);
	}
	
	void sum(String  a , double b)
	{
		String x= a;
	double y=b;
		System.out.println(x+y);
	}
	
	public static void main(String[] args) 
	{
		Poly1 p = new Poly1();
		
		p.sum(0, 1);
		p.sum(11.5, 22.5);
		
//		p.sum(1, 2);
//		p.sum(10, 20);
//		p.sum(100, 200);
		
	}
}
