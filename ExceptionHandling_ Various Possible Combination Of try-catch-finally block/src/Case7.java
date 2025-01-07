//Case -7: only try block

public class Case7 {

	public static void main(String[] args) {
		try {
			System.out.println("try block");
		}
	}

}

/*
	result : invalid
	output : Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
			 Syntax error, insert "Finally" to complete BlockStatements
			 at Case7.main(Case7.java:8)
*/