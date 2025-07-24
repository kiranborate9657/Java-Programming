package exceptionhandling;

public class exceptionrule {

	public static void main(String[] args) {
		try {
		
		int a=20, b=10;
		int result=a/b;
		System.out.println("call the 1st method");
		System.out.println("Division of the two number is:"+result);
		}
		
		
		catch(ArithmeticException ex)
		{
			String reason=ex.getMessage();
			System.out.println(reason);
			System.out.println("in a division we can not be divide by the zero!!!!");
		}
		
		try {
		System.out.println("call the 2nd method");
		int[] number= {10,20,10,52};
		System.out.println(number[1]);
		}

		catch(ArrayIndexOutOfBoundsException ex)
		{
			String reason=ex.getMessage();
			System.out.println(reason);
			System.out.println("index length is less you print more then and outof bound number!!!!");
		}
		
		
		try {
		System.out.println("call the 3rd method");
		String name="kiran";
		System.out.println(name.charAt(10));
		}
		//catch(NullPointerException ex)
		//{
		//	String reason=ex.getMessage();
			//System.out.println(reason);
		//	System.out.println("reference value is a null!!!!");
	//	}
		
		//from the parent Exception class we can call Directly
		
		
		///child first parent later because all other class is unreachable to execute!!!
		catch(Exception ex)
		{
			String reason=ex.getMessage();
			System.out.println(reason);
			System.out.println("parent exception class can be called immediatly!!!");
		}
		
		
		
		System.out.println("End of the all method");
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
