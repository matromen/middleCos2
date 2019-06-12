package generic;

public class BoxExam {
	public static void main(String[] args) {
		Box box = new Box();
		
		box.setObj(new Object());
		Object obj = box.getObj();
		
		box.setObj("hello");
		String string = (String)box.getObj();
		
		box.setObj(100);
		int value = (int) box.getObj();
	}
}
