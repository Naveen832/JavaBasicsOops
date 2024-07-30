package Encapsulation;

public class ep1 
{
	private int a;
	private double b;
	private String c;
	private boolean d;
	
	public int getA() 
	{
		return a;
	}

	public void setA(int a) 
	{
		this.a = a;
	}

	public double getB() 
	{
		return b;
	}

	public void setB(double b) 
	{
		this.b = b;
	}

	public String getC() 
	{
		return c;
	}

	public void setC(String c) 
	{
		this.c = c;
	}
	
//	public static void main(String[] args)
//	{
//		ep1 e = new ep1();
//	}
	
	
	public static void main(String[] args)
	{
		ep1 e = new ep1();
		e.a = 10;
	}
}
