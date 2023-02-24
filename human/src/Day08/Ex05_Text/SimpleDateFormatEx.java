package Day08.Ex05_Text;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatEx {

	public static void main(String[] args) throws ParseException {
		
		Date now = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat();
		System.out.println( sdf.format(now) );
		
		String day = "2023/2/1";
		Date date = new SimpleDateFormat("yyyy/MM/dd").parse(day);
		sdf = new SimpleDateFormat("yyyy/M/d");
		System.out.println( sdf.format(date) );
		
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println( sdf.format(now) );
		
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일 a HH:mm:ss");
		System.out.println( sdf.format(now) );
		
		sdf = new SimpleDateFormat("yyyy/MM/dd(E)");
		System.out.println( sdf.format(now) );
		
		sdf = new SimpleDateFormat("올해 첫 날부터 D번째 날");
		System.out.println( sdf.format(now) );
		
		sdf = new SimpleDateFormat("이번 달 첫 날부터 d번째 날");
		System.out.println( sdf.format(now) );
		
		sdf = new SimpleDateFormat("올해의 w주차 입니다.");
		System.out.println( sdf.format(now) );
		
		sdf = new SimpleDateFormat("이번 달의 W주차 입니다.");
		System.out.println( sdf.format(now) );
	}
	
}


