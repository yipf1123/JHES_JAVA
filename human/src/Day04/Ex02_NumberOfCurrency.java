package Day04;

import java.util.Scanner;

/**
 * 문서 주석
 *
 * 금액 : 534760 50000 : 10개 10000 : 3개 5000 : 0개 1000 : 4개 500 : 1개 100 : 2개 50 :
 * 1개 10 : 1개 5 : 0개 1 : 0개
 * 
 * 위와 같이 금액을 입력하면, 큰 화폐단위부터 계산하여 화폐단위별로 화폐매수를 출력하는 프로그램을 작성하시오.
 * 
 * @author 휴먼교육센터
 *
 */
public class Ex02_NumberOfCurrency {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("금액 : ");
		int input = sc.nextInt(); // 입력금액
		int count; // 화폐매수
		int money = 50000; // 화폐단위 : 큰 화폐단위부터 시작
		boolean sw = true; // 화폐단위 변환 스위치 변수

		while (money >= 1) {

			count = input / money;
			System.out.println(money + "\t : " + count + "개");
			input = input - (money * count);
			// input = input % money

			if (sw) {
				money = money / 5;
				sw = false;
			} else {
				money = money / 2;
				sw = true;
			}
		}

		// sw = !sw;

		sc.close();
	}
}
