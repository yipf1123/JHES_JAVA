package Day04;

import java.util.Scanner;

public class Ex04_Matrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M, N, X, Y;
		System.out.print("M : ");
		M = sc.nextInt();
		System.out.print("N : ");
		N = sc.nextInt();

		int arr[][] = new int[M][N];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
				System.out.print(arr[i][j] + " ");
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

			}
			System.out.println();
		}

		System.out.print("X : ");
		X = sc.nextInt();
		System.out.print("Y : ");
		Y = sc.nextInt();

		int brr[][] = new int[X][Y];
		
		for (int i = 0; i < brr.length; i++) {
			for (int j = 0; j < brr[i].length; j++) {
				brr[i][j] = sc.nextInt();
			}
		}
		
		
		for (int[] row : brr) {
			for (int col : row) {
				System.out.print(col + " ");

			}

			System.out.println();
		}

		sc.close();

	}

}
