package exceptions;

public class HandleExceptions {
	
	public static void main(String[] args) {
		int a = 9;
		int x[] = new int[5];
		
		try {
			a = 5 / 0;
		} 
		catch (ArithmeticException e) {
			System.out.println("ArithmeticException Handling");
			a = a / 3;
			System.out.println("a value == " + a);
		}
		
		try {
			x[8] = 10;
		}catch(IndexOutOfBoundsException ie) {
			System.out.println("IndexOutOfBoundsException");
			x[4] = 7;
			System.out.println("x value == " + x[4]);
		}
	}

}
