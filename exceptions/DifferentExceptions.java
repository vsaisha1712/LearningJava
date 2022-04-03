package exceptions;

public class DifferentExceptions {
	
	public static void main(String[] args) {
		int[] b = {2,3,4,5,6};
		String names = null;
		try {
			int a = 50/2;
			System.out.println("a value == " + a);
			b[5] = 12;
			System.out.println("b[5] value == " + b[5]);
			names.length();
			
		}catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Arithmetic Exception");
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			ae.printStackTrace();
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		catch(IndexOutOfBoundsException ib) {
			ib.printStackTrace();	
			System.out.println("IndexOutOfBounds Exception");
		}
		catch(NullPointerException ne) {
			ne.printStackTrace();
			System.out.println("Null Pointer Exception");
		}
		catch (RuntimeException ae) {
			ae.printStackTrace();
			System.out.println("Runtime Exception");
		}
		
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Exception");
		}
	}

}
