//case -19: nested try-catch block within catch block
	
public class Case19 {

	public static void main(String[] args) {
		try{
			System.out.println("outer try block");
			System.out.println(20/0);
			
		}catch(Exception e) {
			System.out.println("outer catch block : exception handled!!");
			try{
				System.out.println("inner try block");
				System.out.println(10/0);
			}catch(Exception y){
				System.out.println("inner catch block : exception handled!!");
			}
		}


	}

}

/*
	result : valid 
	output : outer try block
			 outer catch block : exception handled!!
			 inner try block
			 inner catch block : exception handled!!
*/
