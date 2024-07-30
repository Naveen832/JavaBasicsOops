package programs;

public class ReverseString1 
{
	public static void main(String[] args)
	{
		String s = "Hello world";
		int i = s.length();
		while(i>0)
		{
			System.out.print(s.charAt(i-1));
			i--;
		}
	}
}
