//note 1: After throw statement we can't write any statement directly,otherwise we will get Compile time error

public class Case2_B {

	public static void main(String[] args) {
		throw new ArithmeticException();
		System.out.println("hello");

	}

}

/*
	output - CE:Unresolved compilation problem: 
				Unreachable code
*/

//note 2: from above example here we have got compile time error