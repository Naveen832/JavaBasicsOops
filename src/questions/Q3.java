package questions;

public class Q3 
{
private static int i =1;
public static void main(String argv[])
{
	int i =2;
	Q3 a = new Q3();
	a.somemethod();
	//Q3.somemethod();
}

public static void somemethod()
{
	System.out.println(i);
}
}
