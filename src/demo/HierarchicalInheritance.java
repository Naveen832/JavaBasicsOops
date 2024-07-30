package demo;

class pclass
{
	void pcls()
	{
		System.out.println("This is Parent class");
	}
}

class cclass extends pclass
{
	void clcs1()
	{
		System.out.println("This is child-1 class");
	}
}

class cclass2 extends pclass
{
	void clcs2()
	{
		System.out.println("This is child-2 class");
	}
}

public class HierarchicalInheritance 
{
	public static void main(String[] args) 
	{
		cclass2 cls2 = new cclass2();
		cls2.pcls();
		cclass cls = new cclass();
		cls.clcs1();
	}
}
