//case -16: nested try-catch block with different type of exception

public class Case16 {

	public static void main(String[] args) {
		try{
			System.out.println("first try block");
			try{
				System.out.println("inner try block");
				System.out.println(10/0);
			}catch(Exception e){
				System.out.println("inner catch block : exception handled!!");
			}
		}catch(ArithmeticException e) {
			System.out.println("outer catch block : exception handled!!");
	
		}
	}
}


/*
 	result : valid
 	output : first try block
			 inner try block
			 inner catch block : exception handled!!
 

*/