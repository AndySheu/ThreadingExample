
public class Main {
	public static void main(String[] args) {
		Thread1 one = new Thread1();
		Thread2 two = new Thread2();
		one.start();
		two.start();
		long start = System.currentTimeMillis();
		while(System.currentTimeMillis() - start < 1000);
		one.terminate();
		start = System.currentTimeMillis();
		while(System.currentTimeMillis() - start < 1000);
		two.terminate();
	}
}
