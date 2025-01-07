//case -14: try - statement - catch block

public class Case14 {

	public static void main(String[] args) {
		try{
			System.out.println("first try block");
			System.out.println(10/0);
		}
		System.out.println("this is statement between try and catch block");
		catch(Exception e) {
			System.out.println("catch block");
		}
	}
}


/*
	result : Invalid
	output : Unresolved compilation problems

*/