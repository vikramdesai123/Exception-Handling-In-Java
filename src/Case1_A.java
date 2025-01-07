//case-1A: if reference variable of Arithmetic Exception refers to the null, then it will throw NullPointerException instead of ArithmeticException

//first of all here we will see if we created an object of Arithmetic Exception 

public class Case1_A {

	static ArithmeticException e = new ArithmeticException();
	
	public static void main(String[] args) {
			throw e;
		
	}
}
// output - RE:ArithmeticException

/*
	In above example we have got RE:ArithmeticException 
	but if reference variable of Arithmetic Exception refers to the null, 
	then it will throw NullPointerArithmeticException instead of ArithmeticException
	
	we will see it next(Case1_B) example

*/