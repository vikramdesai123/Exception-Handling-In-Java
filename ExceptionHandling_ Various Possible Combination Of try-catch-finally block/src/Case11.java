//Case -11: try-try-catch-finally

public class Case11 {

	public static void main(String[] args) {
		try{
			System.out.println("first try block");
		}try{
			System.out.println("first try block");
		}catch(Exception e) {
			System.out.println("catch block");
		}finally {
			System.out.println("finally block");
		}

	}

}

/*
	result : Invalid
	output : Unresolved compilation problem
*/