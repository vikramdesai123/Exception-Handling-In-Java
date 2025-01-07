//case -2: single try block with two or more catch block having different type exceptions
//note(imp): order of catch block exceptions should be child-parent 
public class Case2 {

	public static void main(String[] args) {
		try {
			System.out.println("try block");
			System.out.println(40/0);
		}catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception catch block");
		}catch(Exception e) {
			System.out.println("Exception catch block");
		}

	}

}

/*
	result: valid
	output: try block
			Arithmetic Exception catch block


*/