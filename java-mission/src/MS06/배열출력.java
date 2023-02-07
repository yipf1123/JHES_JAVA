package MS06;

import java.util.Scanner;

public class 배열출력 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 게임? ");
		int N = sc.nextInt();
		int arr[] = new int[6];

		for (int i = 0; i < N; i++) {
			System.out.print("[" + (i + 1) + " 게임] : ");

			for (int j = 0; j < arr.length; j++) {
				int random = (int) (Math.random() * 45 + 1);
				arr[j] = random;
				for (int k = 0; k < args.length; k++) {
					if (j == k)
						continue;
					if (arr[k] == random) {
						i--;
						break;
					}
				}

				System.out.print(arr[j] + " ");
			}
			
			System.out.println();
		}

		// 오름차순 정렬
		for (int i = 0; i < args.length; i++) {
			for (int j = 1+1; j < args.length; j++) {
				if( arr[i] > arr[j]) {
				int temp = arr[i]; // 임시 장소에 저장
				arr[i] = arr[j];
				arr[j] = temp;		
			}
		}

	}

//		for (String i : arr) {
//			System.out.print(i + " ");		}
		
}
	}
