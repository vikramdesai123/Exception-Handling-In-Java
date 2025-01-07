// case -2: if an exception occurred and handled 
public class Case2 {

	public static void main(String[] args) {
		try {
			System.out.println("try block");
			System.out.println(80/0);
		}catch(ArithmeticException e) {
			System.out.println("catch block: Exception handled");
		}finally {
			System.out.println("finally block");
		}
	}

}

/*
output: try block
		catch block: Exception handled
		finally block
*/
