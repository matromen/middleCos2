package thread;

public class Thread1 extends Thread{
	String str;
	
	public Thread1(String str) {
		this.str = str;
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
			System.out.println(this.str + ", " + i);
		}

	}
	
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
}
