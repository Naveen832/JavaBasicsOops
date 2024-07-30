package stringPractice;

public class StringImmutable 
{
	

	public static void main(String[] args)
	{		
		
		String s = "data";
		String ss = s.concat(" added");		
		System.out.println(ss);
		
		StringBuffer sb = new StringBuffer("Soumya");
		sb.append(" Rathore");
		System.out.println(sb);
		
		
		
		
		
	//	String a = new String("data");
	//	String b = new String("data").intern();
		//System.out.println(a==b);			
		//String c = a.concat("hi");		
		//System.out.println(a);		
//		StringBuffer sb = new StringBuffer("Stringbuffer");
//		sb.append("  afterappend");				
//		System.out.println(sb);		 
		 //System.out.println(s);
	}
}
