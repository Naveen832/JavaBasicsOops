package constructorPractice;

class obj
{
	static 
	{
	System.out.println("outside class");
	}
	
	obj()
	{
		System.out.println("this is obj constructor");
	}
}
public class Cons5 
{
	void StringPractice3()
	{
		System.out.println("not a constructor");
		//return 0;		
	}
	
	Cons5()
	{
		System.out.println("I'm constructor");
		
		//StringPractice3 s = new StringPractice3();
		//s.StringPractice3();
		
		obj o = new obj();
		
		
	
	}
		
	public static void main(String[] args)
	{
		
		Cons5 s = new Cons5();
//		s.StringPractice3();
		
		
		
		
		
//		obj o = new obj();
//		
//		String a = new String("zello").intern();
//		String b = new String("aello").intern();
//		
//		
//		System.out.println(a.compareTo(b));
	}
}
