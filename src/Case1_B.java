//case-1B: if reference variable of Arithmetic Exception refers(here 'e' in below example ) to the null, then it will throw NullPointerException instead of ArithmeticException

public class Case1_B {

	static ArithmeticException e;
	
	public static void main(String[] args) {
		
		throw e;
	}
}

/*
	Output - RE:NullPointerException
*/