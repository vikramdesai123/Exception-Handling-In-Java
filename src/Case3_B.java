//note 1: 'throw' keyword is only applicable for 'Throwable' (Exceptions and error) types
//			But here we will see how we can resolve this problem if we want to use throw keyword for Non-Throwable types

public class Case3_B extends RuntimeException{

	public static void main(String[] args) {
		throw new Case3_B();

	}

}
