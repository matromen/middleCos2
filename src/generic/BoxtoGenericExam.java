package generic;

public class BoxtoGenericExam {
	public static void main(String[] args) {
		BoxtoGeneric<String> box = new BoxtoGeneric<>();
		
		box.setObj("한글");
		System.out.println(box.getObj());
		
		
		
		BoxtoGeneric<Integer> box2 = new BoxtoGeneric<>();
		box2.setObj(12);
		
		int value = box2.getObj(); // <=== auto unboxing
		
		System.out.println(value);
		
	}
}
