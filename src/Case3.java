// case-3: If an exception raised but not handled

public class Case3 {

	public static void main(String[] args) {
		try {
			System.out.println("try block");
			System.out.println(20/0);
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}finally{
			System.out.println("Finally block");
		}
	}

}

/*
output: try block
		Finally block
		Exception in thread "main" java.lang.ArithmeticException: / by zero
				at Case3.main(Case3.java:8)
*/