package staticpackage;

 class st
{
	
	 
	static void method()
	{
		System.out.println("hello");		
	}
}

 
 class at
 {
	 static void method2()
	 {
		 st s = new st();
		 s.method();

	 }
 }


public class Static2 
{
	public static void main(String[] args)
	{
		st.method();
		
		at t = new at();
		t.method2();
	}
}
