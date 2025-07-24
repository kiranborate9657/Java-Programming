package exceptionhandling;

public class exceptionhierarchy {

	public static void main(String[] args) {
		
		
		try {
		int a=20;
		int b=0;
		int result=a/b;
		System.out.println("Division of the number is:"+result);
		}
		
		
		catch(ArithmeticException ex)
		{
			String reason=ex.getMessage();
			System.out.println(reason);
			System.out.println("We can not a divide by the Zero");
		}
		try {
			String name=null;
			System.out.println(name.toUpperCase());
			
		}
			catch(NullPointerException ex)
		{
				String reason=ex.getMessage();
				System.out.println(reason);
				System.out.println("reference is null");	
		}
		try {
		int[] num= {10,20,30,40,50};
		System.out.println(num[10]);
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			String reason=ex.getMessage();
			System.out.println(reason);
			System.out.println("You want to print the value out of range Array");
		}
		
		
		finally {
       	 System.out.println("finally 2nd block is a Executed After all the Method");
        }
		 
         try {
		String namee="kiran";
		System.out.println(namee.charAt(1));
         }
         
       
		
		catch(Exception ex)
		{
			String reason=ex.getMessage();
			System.out.println(reason);
			System.out.println("Error");
		}
         
         
         finally {
        	 System.out.println("finally block is a Executed After all the Method");
        	 
        	 
        	 
         }
         
         
		
		
		
		// TODO Auto-generated method stub

	}

}
