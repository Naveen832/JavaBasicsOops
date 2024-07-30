package demo;

public class s 
{
public static String reverseString(String str)
{
    
	//Converting to character array
    char ch[] = str.toCharArray();
    
    //System.out.println(str);
    
    int n = ch.length;
    char result[] = new char[n];
    for(int i = 0; i<ch.length; i++) {
       result[n-1] = ch[i];
       n = n - 1;
    }
    return new String(result);
 }


	public static void main(String[] args) 
	{

	      String str = "kiran";
	      String result = s.reverseString(str);
	      System.out.println(result);
	}
	
}