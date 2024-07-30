package demo;

class x 
{
	void v1()
	{
		System.out.println("This is Parent class");
		//super.v1();

	}
}


class y  extends x
{
	void v1()
	{
		System.out.println("This is child-1 class");
		//super.v1();

	}
	
	
}

class z extends y 
{
	void v1()
	{
		
		System.out.println("This is child-2 class");
		super.v1();
	}
}
public class MultiLevelInheritance 
{

	public static void main(String[] args) 
	{
		z obj = new z();
		obj.v1();
		
		//obj.v2();
		//obj.v3();
		
		
	}

}
