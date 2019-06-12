package lambda;

public class CompareExam{
	public static void main(String[] args) {
		exec(
				(k,m) -> {
					if(k>m) {
						return k;
					}else {
						return m;
					}
				}
			);
	}
	
	public static void exec(Compare compare) {
		int k=30;
		int m=20;
		
		int value = compare.compareTo(k, m);
		System.out.println(value);
	}
	
}
