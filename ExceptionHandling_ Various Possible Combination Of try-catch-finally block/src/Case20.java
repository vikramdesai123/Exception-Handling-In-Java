//Case -20 : nested try-catch-finally within finally block

public class Case20 {

	public static void main(String[] args) {
		try {
			System.out.println("outer try block" );
		}catch(Exception e) {
			System.out.println("outer catch block");
		}finally {
			System.out.println("outer finnaly block");
			try {
				System.out.println("inner try block" );
			}catch(Exception e) {
				System.out.println("inner catch block");
			}finally {
				System.out.println("inner finnaly block");
			}
		}
	}

}

/*
	result : valid
	output : outer try block
			 outer finally block
			 inner try block
			 inner finally block

*/