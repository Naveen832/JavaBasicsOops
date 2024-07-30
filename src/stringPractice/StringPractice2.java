package stringPractice;

public class StringPractice2 
{
	
	StringPractice2()
	{
		String i = "hello";
		if(i=="hello")
		{
			System.out.println("hello");
		}
	}
	public static void main(String[] args) 
	{
		String s1 = "hello";
		String s2 = "hello";
		String s3 = new String("hello").intern();
		String s4 = new String("hello").intern();
		//System.out.println(s1.equals(s2));
		//System.out.println(s3.equals(s4));
		StringPractice2 s = new StringPractice2();
		//System.out.println(s3.equals(s4));
		
		
		
		
		
		
		
		
		
		
//		System.out.println(s1.compareTo(s4));
//		System.out.println(s1.compareTo(s2));
//		System.out.println(s3.compareTo(s1));
		
		//System.out.println(s3==s4);
	}

}
