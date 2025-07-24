package exceptionhandling;

public class nullpointer {

	public static void main(String[] args) {
		
		String name=("Kiran borate");
		System.out.println(name.charAt(2));
		try {
		
		int a=10;
		int b=10;
		int result=a/b;
		System.out.println(result);
		}catch(ArithmeticException e)
		{
			System.out.println("can not divide by the zero");
		}
		
		
		
		// TODO Auto-generated method stub
		
		//if assign reference variable as a null then
		try {
		String name1=null;
		String newname=name1.toUpperCase();
		System.out.println(newname);
		}catch(NullPointerException e){
			System.out.println("reference variable is a null");
		}
		System.out.println("continue the execution");

	}

}
