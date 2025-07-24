package exceptionhandling;

public class throwss {
	public static void main(String[] args) {
		
		try {
			operation( 100,10);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		finally {
			System.out.println("rest of the logic is executed");
		}
		
		public static void operation(int val1,int val2)throws Exception
		{
			if(val2==0) {
				throw new Exception("do not divide by the zero");
			}
			else {
				System.out.println(val1/val2);
				
			}
			System.out.println("print the rest of the logic in the program");
		}
		
		
		// TODO Auto-generated method stub

	}

}
