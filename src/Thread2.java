
public class Thread2 extends Thread {
	boolean run = false;
	
	public void start() {
		super.start();
		run = true;
	}
	
	public void run() {
		while(this.run) {
			long start = System.currentTimeMillis();
			while(System.currentTimeMillis() - start < 50);
			System.out.println("2");
		}
	}
	
	public void terminate() {
		run = false;
	}
}
