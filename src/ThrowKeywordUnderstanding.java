//note-1: 'throw' keyword is used to create exception object to throw an exception explicitly

public class ThrowKeywordUnderstanding {
	
//	public void method1() {
//		System.out.println(20/0);
//	}

	//note-2: Above Arithmetic Exception we can throw manually 

	public void method2() {
		throw new ArithmeticException("/ by zero");
	}

	public static void main(String[] args) {
		ThrowKeywordUnderstanding t = new ThrowKeywordUnderstanding();
//		t.method1();
		t.method2();
	}
}

