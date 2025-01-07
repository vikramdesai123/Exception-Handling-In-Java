//case -3: single try block with two or more catch block having same type of exceptions
public class Case3 {

	public static void main(String[] args) {
		try {
			System.out.println("try block");
			System.out.println(40/0);
		}catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception catch block");
		}
		catch(ArithmeticException e) {
			System.out.println("Exception catch block");
		}

	}

}

/*
	result: Invalid
	output: Compile time error


*/