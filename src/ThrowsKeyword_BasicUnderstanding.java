//Note -1: when we have need to delegate responsibility of exception handling to the caller(JVM or another method)at that time we can use throws keyword


public class ThrowsKeyword_BasicUnderstanding {

	public static void main(String[] args)throws InterruptedException {
		doStuff();

	}
	public static void doStuff() throws InterruptedException{
		doMoreStuff();
	}
	public static void doMoreStuff() throws InterruptedException{
		Thread.sleep(1000);
	}
		
}
/*
	In above example, an exception will occur at Thread steep(1000).

	To handle that exception, we have used 'throws to delegate that exception to its  caller.

	For compile successfully, we need to hand over this exception to the 'main' method.For that, we will throw an exception till the 'main' method works as caller.  

*/