package lang;

/**
 * 
 * @author bgkim
 *
 *	문자열 더하는 것은 내부적으로 new StringBuffer() 객체를 생성하는 것임.
 *
 */
public class StringExam {
	public static void main(String[] args) {
		String str1 = "Hello World";
		String str2 = str1.substring(5);
		
		System.out.println(str1);
		System.out.println(str2);
		
		String str3 = str1 + str2;
		System.out.println(str3);
		
		String str4 = new StringBuffer().append(str2).append(str3).toString();  //<== 위에 문자열 더하는 것은 지금처럼 내부적으로는 StringBuffer로 작동 된다. 
		System.out.println(str4);
		
		
		
		String str5 = "";
		
		for(int i=0; i<100; i++) {
			str5 = str5 + "*";                     // <=== 문자열 더하기는 new StringBuffer().append() 가 계속 발생함.
		}
		System.out.println(str5);
		
		
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<100; i++) {
			sb.append("*");                       // <== StringBuffer 객체를 미리생성하고 append만 사용함.
		}
		System.out.println(sb.toString());
	}
}
