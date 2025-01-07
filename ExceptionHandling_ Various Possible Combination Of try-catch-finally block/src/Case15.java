//case -15: try-catch-statement-catch block
public class Case15 {

	public static void main(String[] args) {
		try{
			System.out.println("first try block");
			System.out.println(10/0);
		}
		System.out.println("this is statement between catch and catch block");
		catch(ArithmeticException e) {
			System.out.println("first catch block");
		}catch(Exception e) {
			System.out.println("second catch block");
		}
	}

}

/*
result : Invalid
output : : Unresolved compilation problems

*/