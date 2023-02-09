package Day07.Ex04_TryCatch;

import java.util.Scanner;

public class DivideByZero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;

		System.out.print("a: ");
		a = sc.nextInt();

		System.out.print("b: ");
		b = sc.nextInt();

		// 예외 메세지 : java.lang.ArithmeticException: / by zero

		// 예외 처리문 : try~catch
		try {
			// 예외 발생 가능성이 있는 문장
		System.out.println("a/b = " + a / b);
		
		}
		//catch(예외타입 객체명)
		catch(ArithmeticException e) {
			// 예외 발생시, 예외 처리 문장
			System.err.println("0 으로 나누는 연산은 수학적으로 정의되지 않습니다.");
		}
			//finally 블록은 생략가능
		finally {

			sc.close();
		}
			
			
	
	}

}
