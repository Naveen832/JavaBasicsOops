package generalPractice;

public class StaticMethod 
{	
	static 
	{
		System.out.println("static method");
	}
	
	
	{
		System.out.println("nonstatic method");
	}
	
	public static void main(String[] args) 
	{
		StaticMethod s = new StaticMethod();		
		
		
		
		
		
		//		StaticMethod.method();
//		s.nonstaticmethod();
	
	}
}





/*{
System.out.println("non static block");
int	i=10;
System.out.println(i);
}

static 
{
System.out.println("static block");
int j=20;
System.out.println(j);
}*/
