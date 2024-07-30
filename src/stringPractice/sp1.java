package stringPractice;

public class sp1 
{
	public static void main(String[] args) 
	{
		String str = "string";
		String str1 = new String("string").intern();
		String str2 = new String("string").intern();
		
		System.out.println(str==str1);  //true
		
		System.out.println(str.equals(str1));  //true
		
		System.out.println(str1==str2);  //true
	}
}
