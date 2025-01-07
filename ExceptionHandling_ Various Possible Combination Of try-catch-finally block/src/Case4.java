//case -4: normal try-catch-finally block
public class Case4 {

	public static void main(String[] args) {
		try {
			System.out.println("try block");
		}catch(Exception e) {
			System.out.println("catch block");
		}finally {
			System.out.println("finally block");
		}

	}

}

/*
	result: valid
	output: try block
			finally block

*/