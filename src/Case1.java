// case - 1: if there is no exception

public class Case1 {

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
	output: try block
			finally block
*/