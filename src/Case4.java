// case -4: if we used "System.exit(0)" method in try block then program will terminate without executing finally block
public class Case4 {

	public static void main(String[] args) {
		try {
			System.out.println("try block");
			System.out.println(20/0);
		}catch(ArithmeticException e) {
			System.out.println("Exception handled!!");
			System.exit(0);
		}finally {
			System.out.println("Finally block");
		}

	}

}

/*
	output: try block
			Exception handled!!
*/