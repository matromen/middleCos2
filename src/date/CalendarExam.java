package date;

import java.util.Calendar;
import java.util.Date;

public class CalendarExam {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.get(Calendar.YEAR));
		System.out.println(calendar.get(Calendar.MONTH)+1);
		System.out.println(calendar.get(Calendar.DATE));
		
		System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println(calendar.get(Calendar.MINUTE));
		System.out.println(calendar.get(Calendar.SECOND));
		
		
		
		System.out.println();
		
		
		
		calendar.add(Calendar.HOUR, 5);           // add 를 통해 날짜/시간 등 조정
		System.out.println(calendar.get(Calendar.YEAR));
		System.out.println(calendar.get(Calendar.MONTH)+1);
		System.out.println(calendar.get(Calendar.DATE));
		
		System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println(calendar.get(Calendar.MINUTE));
		System.out.println(calendar.get(Calendar.SECOND));
		
		
		
		
		System.out.println(calendar.getTimeInMillis());
		Date date = calendar.getTime();
		System.out.println(date.getTime());
	}
}
