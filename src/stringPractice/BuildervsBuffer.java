package stringPractice;

public class BuildervsBuffer 
{
	public static void main(String[] args)
	{
		
		   long startTime = System.currentTimeMillis();  
	        StringBuffer sb = new StringBuffer("Java");  
	        for (int i=0; i<100000; i++){  
	            sb.append("Tpoint");  
	        }  
	        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");  
	        startTime = System.currentTimeMillis();  
	        StringBuilder sb2 = new StringBuilder("Java");  
	        for (int i=0; i<100000; i++){  
	            sb2.append("Tpoint");  
	        }  
	        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");  
	 
		
		
		/*StringBuffer b = new StringBuffer("before SBuffer");
		long st = System.currentTimeMillis();
		for(int i=0; i<1000000; i++)
		{
			b.append("after SBuffer");
		}
		System.out.println((System.currentTimeMillis()-st));
		
		st= System.currentTimeMillis();
		
		StringBuilder s = new StringBuilder("before SBuilder");
		for(int i=0;i<1000000; i++)
		{
			b.append("after SBuilder");
		}
		System.out.println(System.currentTimeMillis()-st);*/

		
		
		
		
		
		
		
		
		
	}
}
