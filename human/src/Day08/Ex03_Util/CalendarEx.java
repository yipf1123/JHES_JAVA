package Day08.Ex03_Util;

import java.util.Calendar;

public class CalendarEx {

	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		System.out.println("오늘 날짜");
		System.out.print(calendar.get(Calendar.YEAR) + "년 ");
		System.out.print(calendar.get(Calendar.MONTH) + 1 + "월 ");
		System.out.print(calendar.get(Calendar.DATE) + "일");
		System.out.println();
		
		System.out.println("현재 시간");
		System.out.print(calendar.get(calendar.HOUR) + "시 ");
		System.out.print(calendar.get(calendar.MINUTE) + "분 ");
		System.out.print(calendar.get(calendar.SECOND) + "초");

	
	}
	
}

