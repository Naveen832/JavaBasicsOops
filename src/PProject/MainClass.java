package PProject;

public class MainClass 
{
	public static void main(String[] args)
	{
		GetSetClass s = new GetSetClass();
		s.setpName("Prudhvi");
		s.setnName("Nikhil");
		
		System.out.println(s.getpName());
		System.out.println(s.getnName());
		
		s.date = "65";
		System.out.println(s.date);
	}
}
