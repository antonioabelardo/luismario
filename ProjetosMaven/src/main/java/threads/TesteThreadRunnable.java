package threads;

public class TesteThreadRunnable {

	public static void main(String[] args) {

		MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1", 500);
		
		MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2", 300);
		
		MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3", 200);
		
		//Thread t1 = new Thread(thread1);
		//t1.start();

	}
}
