package Day08.Ex04_Time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.TimeZone;

public class DateTumeCreateEx {

	public static void main(String[] args) {
		
		LocalDate nowDate = LocalDate.now();
		System.out.println("현재 날짜 : " + nowDate);
	
		LocalDate endDate = LocalDate.of(2023, 7, 21);
		System.out.println("종료 날짜 : " + endDate);
	
		LocalTime nowTime = LocalTime.now();
		System.out.println("현재 시간: " + nowTime);

		LocalTime endTime = LocalTime.of(17, 40, 0, 0);
		System.out.println("종료 시간: " + endTime);
		
		LocalDateTime nowDateTime = LocalDateTime.now();
		System.out.println("현재 날짜와 시간: " + nowDateTime);
	
		LocalDateTime endDateTime = LocalDateTime.of(2023, 7, 21, 17, 40, 0, 0);
		System.out.println("현재 날짜와 시간: " + nowDateTime);
		
		ZonedDateTime utcDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println("협정 시계시 : " + utcDateTime);
		
		ZonedDateTime seoulDateTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		System.out.println("서울 시계시 : " + utcDateTime);
		
		ZonedDateTime newYorkDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println("뉴욕 시계시 : " + utcDateTime);
		
		ZonedDateTime JapanDateTime = ZonedDateTime.now(ZoneId.of("Japan"));
		System.out.println("일본 시계시 : " + utcDateTime);
		
		ZonedDateTime romeDateTime = ZonedDateTime.now(ZoneId.of("Europe/Rome"));
		System.out.println("로마 시계시 : " + utcDateTime);
		
		LocalDate ld= LocalDate.now();
		
		if( ld.isLeapYear() ) {
			System.out.println("올해는 윤년 : 2월 29일까지");
		}
		else {
			System.out.println("올해는 평년 : 2월 28일까지");			
		}

		String[] timeZoneId = TimeZone.getAvailableIDs();
		
		for (String ZoneId : timeZoneId) {
		System.out.println(ZoneId);
		}	
		
		
		
	}
}






























