package constructorPractice;

class sam{
	char tarak()
	{
		return 'a';
	}
}



public class Cons 
{
//	Cons(int x, int y)
//	{
//	int a = x;
//	int b = y;
//	System.out.println(+a+" "+b); 
//	}
		
	
	
	public static void main(String[] args)
	{
		//Cons c = new Cons(10, 20);
		
		sam s = new sam();
		System.out.println(s.tarak());
	}
}
