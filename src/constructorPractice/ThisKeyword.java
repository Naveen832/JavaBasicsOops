package constructorPractice;

public class ThisKeyword 
{
	//int x,y; //instance variables/class variables
	
	ThisKeyword(int x, int y) //x=10, y=20  //local variables
	{
		x=x; 
		y=y;  
		System.out.println(x);
		System.out.println(y);
	}
	
//	void method2()
//	{
//		System.out.println(x);  
//		//System.out.println(y);
//	}
	public static void main(String[] args) 
	{
		ThisKeyword c = new ThisKeyword(10,20);
		//c.method1(10,20);
		//c.method2();
	}
}
