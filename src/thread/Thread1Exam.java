package thread;

public class Thread1Exam {
	public static void main(String[] args) {
		Thread1 thread = new Thread1("김개똥");
		thread.start();
		
		Thread1 thread2 = new Thread1("김개똥2");
		thread2.start();
		
		
		System.out.println("main thread end");
	}
}
