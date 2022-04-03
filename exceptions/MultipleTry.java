package exceptions;

public class MultipleTry {
	
    public static void main(String args[])  
    {    
        try {  
        	
            try {  
     
                try {  
                    int a[] = { 1, 2, 3, 4 };  
                    System.out.println(a[7]);  
                } 
                catch (ArithmeticException ae) {
                	ae.printStackTrace();
                    System.out.println("Arithmetic exception");    
                }  
            }     
            catch (NullPointerException npe) {
            	npe.printStackTrace();
                System.out.println("NullPointerException");    
            }  
        }    
        catch (ArrayIndexOutOfBoundsException ae) {  
            ae.printStackTrace();  
            System.out.println("ArrayIndexOutOfBoundsException");  
        }  
        catch (Exception e) {  
            e.printStackTrace();
            System.out.println("Exception is handled");  
        }
        finally {
        	System.out.println("Successful Run");
        }
    } 

}
