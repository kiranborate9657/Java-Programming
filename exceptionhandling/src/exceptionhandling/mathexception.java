package exceptionhandling;

public class mathexception {

	public static void main(String[] args) {
		
		try {
		
		int val1=20;
		int val2=23;
		
		//to avoid the exception
		
		int result=(val1 + val2);
		
		System.out.println("Addition of the two number is :"+result);
		// TODO Auto-generated method stub
		int result2=(val1 - val2);
		System.out.println("subtraction of the two number is :"+result2);
		
		//if(val2 != 0)
		//{
		//	System.out.println("Division of the two number is  performed");
			
		//}
		
		int result3=(val1/val2);
		System.out.println("division of the two number is :"+result3);
		}
		
		catch(ArithmeticException ex) 
		{
			
			System.out.println("can not be divide by the zero");
		
		
		}
		
		String name="kiran";
		System.out.println(name.toUpperCase());
		
		System.out.println("End of the method");
		}
		

	

}
