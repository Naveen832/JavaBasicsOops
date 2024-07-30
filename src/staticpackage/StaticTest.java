package staticpackage;

public class StaticTest 
{ 
	public static int iStatic = 10; 
	public void nonStatic() 
{ 
		System.out.println("can access static variable inside non-static method : " + iStatic);		
		//main(new String[2]);
} 
	public static void main(String[] args)
	
{ 
		System.out.println("Inside main method");
		StaticTest t = new StaticTest();
		t.nonStatic();
} }

//Read more: https://javarevisited.blogspot.com/2017/10/can-non-static-method-access-static.html#ixzz88FsVUODa
