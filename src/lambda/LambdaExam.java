package lambda;

public class LambdaExam {
	public static void main(String[] args) {
/*		new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=0; i<100; i++) {
					try {
						Thread.sleep((int)(Math.random()*1000));
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("hello " + i);
				}
				
			}
			
		}).start();*/
		
		new Thread(
				()->{
						for(int i=0; i<100; i++) {
							try {
								Thread.sleep((int)(Math.random()*1000));
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							System.out.println("hello " + i);
						}					
					}
				).start();
	}
}
