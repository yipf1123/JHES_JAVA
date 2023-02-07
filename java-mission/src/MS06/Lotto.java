package MS06;

import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("몇 게임? ");
		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			System.out.print("[" + (i + 1) + " 게임] : ");
			int[] lotto = new int[6];
			for (int j = 0; j < lotto.length; j++) {
				int random = (int) (Math.random() * 45 + 1);
				lotto[i] = random;
				

			// Math.random() : 0.xxxxxx
			// Math.random() * 10 : x.xxxxxx(0~9)
			// (int)(Math.random() * 10) : 0~9
			// (int)(Math.random() * 100) : 0~99
			// (int)(Math.random() * 10) + 1 : 1~10
			// (int)(Math.random() * 100) + 1 : 1~100

			// 공식 : (int)(Math.random() * 개수 + 시작숫자
//		System.out.println(Math.random());
//		System.out.println((int)(Math.random()* 10));
//		System.out.println((int)(Math.random()* 100));

		}
	}

	}}
