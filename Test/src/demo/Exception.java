package demo;

public class Exception {

	public static void main(String[] args) 
	{
		System.out.println("First");
		try{
			int c=10/0;
			
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception is coming");
		}
		
		System.out.println("End");
		

	}

}
