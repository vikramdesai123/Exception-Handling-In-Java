//case -13: try-catch-finally-finally block

public class Case13 {

	public static void main(String[] args) {
		try{
			System.out.println("first try block");
			System.out.println(10/0);
		}catch(Exception e) {
			System.out.println("catch block");
		}finally {
			System.out.println("finally block");
		}finally {
			System.out.println("finally block");
		}

	}

}

/*
	result : Invalid
	output : : Unresolved compilation problems

*/