//case -5: try-catch block followed by another try-catch block

public class Case5 {

	public static void main(String[] args) {
		try {
			System.out.println("first try block");
		}catch(Exception e) {
			System.out.println(" first catch block");
		}
		try {
			System.out.println("second try block");
		}catch(Exception e) {
				System.out.println("second catch block");		
		}

	}
}

/*
	result: valid
	output: first try block
			second try block
*/