package exceptions;

public class SimpleException {
	
	public static void main(String[] args) {
		
		try {
			int a = 90/0;
		}
		catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Exception is handled");
		}
	}

}
