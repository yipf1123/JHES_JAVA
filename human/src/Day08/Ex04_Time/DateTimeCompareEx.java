package Day08.Ex04_Time;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimeCompareEx {

	public static void main(String[] args) {
		
		LocalDateTime todayDateTime = LocalDateTime.of( 2023, 2, 10, 9, 0, 0);
		System.out.println("오늘 : " + todayDateTime);
		
		LocalDateTime endDateTime = LocalDateTime.of(2023,  7, 21, 18, 0, 0);
		System.out.println("종강 : " + endDateTime);
		
		if( todayDateTime.isBefore(endDateTime)) {
			System.out.println("훈련과정 진행 중입니다.");
		}
		else if ( todayDateTime.isEqual(endDateTime)) {
			System.out.println("종강합니다.");
		}
		else if (todayDateTime.isAfter(endDateTime)) {
			System.out.println("훈련과정이 종료되었습니다.");
		}
		System.out.println();
		
		long remainYear = todayDateTime.until(endDateTime, ChronoUnit.YEARS);
		long remainMonth = todayDateTime.until(endDateTime, ChronoUnit.MONTHS);
		long remainDay = todayDateTime.until(endDateTime, ChronoUnit.DAYS);
		long remainHour = todayDateTime.until(endDateTime, ChronoUnit.HOURS);
		long remainMinute = todayDateTime.until(endDateTime, ChronoUnit.MINUTES);
		long remainSecond = todayDateTime.until(endDateTime, ChronoUnit.SECONDS);
		
		System.out.println("남은 년도 : " + remainYear);
		System.out.println("남은 개월 수 : " + remainMonth);
		System.out.println("남은 일 수 : " + remainDay);
		System.out.println("남은 시 : " + remainHour);
		System.out.println("남은 분 : " + remainMinute);
		System.out.println("남은 초 : " + remainSecond);
		System.out.println();
		
		remainYear = ChronoUnit.YEARS.between(todayDateTime, endDateTime);
		remainMonth = ChronoUnit.MONTHS.between(todayDateTime, endDateTime);
		remainDay = ChronoUnit.DAYS.between(todayDateTime, endDateTime);
		remainHour = ChronoUnit.HOURS.between(todayDateTime, endDateTime);
		remainMinute = ChronoUnit.MINUTES.between(todayDateTime, endDateTime);
		remainSecond = ChronoUnit.SECONDS.between(todayDateTime, endDateTime);
		
		System.out.println("남은 년도 : " + remainYear);
		System.out.println("남은 개월 수 : " + remainMonth);
		System.out.println("남은 일 수 : " + remainDay);
		System.out.println("남은 시 : " + remainHour);
		System.out.println("남은 분 : " + remainMinute);
		System.out.println("남은 초 : " + remainSecond);
		
	}
	
}























