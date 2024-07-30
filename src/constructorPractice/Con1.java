package constructorPractice;

public class Con1 
{
		
	
/*
	String method1()
	{
		 return "Namaste";
	}
	
	void method2(String name)
	{
		System.out.println("hey "+name+"!");
	}
*/	
	
	String method3(String babu)
	{
		
		System.out.println(babu);
		return ("Doctarrr BOB loves "+babu);
	}
	
	
	
	public static void main(String[] args)
	{
		Con1 c = new Con1();
		
		String value = c.method3("Vantalakka");
//		System.out.println(c.method3("me"));
		System.out.println(value);
		
		
		
		/*
		System.out.println(c.method1());		
		c.method2("Prudhvi");
		*/
	}
}
