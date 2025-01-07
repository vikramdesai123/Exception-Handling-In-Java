//case -12: try-catch-catch-finally block

public class Case12 {

	public static void main(String[] args) {
		try{
			System.out.println("first try block");
			System.out.println(10/0);
		}catch(ArithmeticException e) {
			System.out.println("first catch block");
		}catch(Exception e) {
			System.out.println("second catch block");
		}finally {
			System.out.println("finally block");
		}

	}

}

/* 
	result : valid
	output : first try block
			 first catch block
			 finally block

*/