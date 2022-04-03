package exceptions;

public class Finally {
	
	public static void main(String[] args) {
		int[] x = new int[3];
		try {
			x[4] = 10;
			System.out.println("x[4] == " + x[4]);
		}catch(IndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("IndexOutOfBoundsException");
		}
		finally { 
			System.out.println("Finally Block is excecuted");
			System.out.println("x[2] == " + x[2]);
			
		}
	}

}
