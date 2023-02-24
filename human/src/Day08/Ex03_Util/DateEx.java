package Day08.Ex03_Util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) throws ParseException {
	
		Date now = new Date();
		System.out.println("now : " + now);
		
		String dateStr = now.toString();
		System.out.println("Date 문자열 기본 포맷 : " + dateStr);
		
		String dateFormat = "yyyy년 MM월 dd일 hh시 mm분 ss초";
		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
		String nowStr = sdf.format(now);
		System.out.println(nowStr);
		
		String day1 ="2023/01/30";
		String day2 ="2023/07/21";
		
		Date date1 = new SimpleDateFormat("yyyy/MM/dd").parse(day1);
		Date date2 = new SimpleDateFormat("yyyy/MM/dd").parse(day2);
		
		long gapDays = (date2.getTime() - date1.getTime()) / (1000*60*60*24);
		long gapHours = (date2.getTime() - date1.getTime()) / (1000*60*60);
		long gapMin = (date2.getTime() - date1.getTime()) / (1000*60);
		long gapSec = (date2.getTime() - date1.getTime()) / (1000);
		
		System.out.println("종강 D-day : " + gapDays);
		System.out.println("종강까지 남은 시간(/시) : " + gapHours);
		System.out.println("종강까지 남은 시간(/분) : " + gapMin);
		System.out.println("종강까지 남은 시간(/초) : " + gapSec);
		
		System.out.println("Today (년) : " + date1.getYear());		
		System.out.println("Today (년) : " + date1.getMonth());		
		System.out.println("Today (년) : " + date1.getDate());
		
		Date today  = new Date();
		System.out.println("오늘 : " + today) ;
		
		
		int dayTime = (1000* 60 * 60 * 24);
		int day5TimeValue = 5 * dayTime;
		int day10TimeValue = 10 * dayTime;
		int day100TimeValue = 100 * dayTime;
	
		Date after5Days = new Date();
		after5Days.setTime( today.getTime() + day5TimeValue );
		String after5DayStr = sdf.format(after5Days);
		System.out.println(after5DayStr);
		
		Date after10Days = new Date();
		after10Days.setTime( today.getTime() + day10TimeValue );
		String after10DayStr = sdf.format(after10Days);
		System.out.println(after10DayStr);
		
		Date after100Days = new Date();
		after100Days.setTime( today.getTime() + day100TimeValue );
		String after100DayStr = sdf.format(after100Days);
		System.out.println(after100DayStr);
	}

}

























