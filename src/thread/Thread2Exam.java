package thread;

public class Thread2Exam {
	public static void main(String[] args) {
		Thread thread = new Thread(new Thread2("김병구"));
		Thread thread2 = new Thread(new Thread2("김병구2"));
		
		thread.start();
		thread2.start();
	}
}
