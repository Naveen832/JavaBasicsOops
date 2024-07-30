package demo;

public class ArrayProgramPractice1 
{
	public static void main(String[] args)
	{
		String message = "wElcOme tO caPgemiNi!";
		char[] ch = message.toCharArray();
		
		boolean space = true;
		
		
		for(int i=0; i<ch.length; i++)
		{
			if(Character.isLetter(ch[i]))
			{
				if(space)
				{
					ch[i] = Character.toUpperCase(ch[i]);
					space = false;
				}
				else
				{
					if(Character.isUpperCase(ch[i]))
					{
						ch[i] = Character.toLowerCase(ch[i]);
					}
					//ch[i] = Character.toLowerCase(ch[i]);
					
				}
			}
			
			else
			{
				space = true;
			}
		}
		
		message = String.valueOf(ch);
		System.out.println(message);
	}
}
