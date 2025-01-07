//note 1: 'throw' keyword is only applicable for 'Throwable' (Exceptions and error) types

//	but here we will check if we use 'throw' for other than 'Throwable'

public class Case3_A {

	public static void main(String[] args) {
		throw new Case3_A();

	}
}

/*
	output - CE: No exception of type Case3_A can be thrown; 
				 an exception type must be a subclass of Throwable

*/

//note 2: here in above example we have got compile time error 

//		  But we always use throw keyword to throw exception explicitly at Runtime 

//		  In next example (Case3_B) we will see how we can resolve this problem if we want to use throw keyword for Non-Throwable types
