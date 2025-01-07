//case -18: nested only try block in try block
public class Case18 {

	public static void main(String[] args) {
		try{
			System.out.println("first try block");
			try{
				System.out.println("inner try block");
				System.out.println(10/0);
			}
		}catch(Exception e) {
			System.out.println("outer catch block : exception handled!!");
		}
	}

}

/*
	result : invalid
	output : Unresolved compilation problem
*/