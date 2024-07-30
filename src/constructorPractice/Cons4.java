package constructorPractice;

public class Cons4 
{
	int x,y; //instance variables/class variables
	void method1(int a, int b) //local variables/method variables
	{
		this.x=a;
		this.y=b;
	}
	
	void method2()
	{
		System.out.println(x);
		System.out.println(y);
	}
	public static void main(String[] args) 
	{
		Cons4 c = new Cons4();
		c.method1(10,20);
		c.method2();
	}
}
