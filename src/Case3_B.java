//note 1: 'throw' keyword is only applicable for 'Throwable' (Exceptions and error) types
//			But here we will see how we can resolve this problem if we want to use throw keyword for Non-Throwable types

//for that we need to extends Non-Throwable class
public class Case3_B extends RuntimeException{

	public static void main(String[] args) {
		throw new Case3_B();

	}

}

/*
	output - RE:Exception in thread "main" Case3_B

*/

//Here we have got Runtime error