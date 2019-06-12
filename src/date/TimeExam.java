package date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * 
 * @author bgkim
 *
 *	java.time을 이용한 여러가지 객체 생성 방법
 */
public class TimeExam {
	public static void main(String[] args) {
		///////////여러가지 객체 초기화 //////////////
		LocalDateTime localDateTime = LocalDateTime.now(); 
		System.out.println(localDateTime);
		
		
		LocalDate ld = LocalDate.of(2005, 1, 10);
		System.out.println(ld);
		
		
		LocalTime lt = LocalTime.of(17, 20);
		System.out.println(lt);
		
		
		lt = LocalTime.parse("10:10:10");
		System.out.println(lt);
		
		
		///////////////////////////////////////
		
		
		System.out.println("현재 월 : " + localDateTime.getMonthValue());  //+1 하지 않아도 됨.
		LocalDateTime localDateTime2 = localDateTime.plusMonths(2);
		System.out.println("변경 월 : " + localDateTime2.getMonthValue());
		
		
		
	}
}
