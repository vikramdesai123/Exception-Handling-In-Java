//case -10: try-finally-catch (change in order)

public class Case10 {

	public static void main(String[] args) {
		try {
			System.out.println("try block");
		}finally {
			System.out.println("finally block");
		}catch(Exception e) {
			System.out.println("catch block");
		}
	}

}

/*
	result : Invalid
	output : Unresolved compilation problems
 

*/
