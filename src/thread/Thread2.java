package thread;

public class Thread2 implements Runnable{
	private String name;
	
	public Thread2(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(this.name + ", " + i);
		}		
	}
}
