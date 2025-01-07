//note 1: After throw statement we can't write any statement directly,otherwise we will get Compile time error
//		  But before that in this example(case2_A) we will see the actual exception what type of error throws


public class Case2_A {

	public static void main(String[] args) {
			
		System.out.println(10/0);
		System.out.println("hello");
	}

}
/*

output - RE: ArithmeticException

*/

//note 2 : from above example we have got output as "output - RE: ArithmeticException" ,
//		   But we will see in next(Case2_B) example what error we will get if we wrote statement after throw statement 
