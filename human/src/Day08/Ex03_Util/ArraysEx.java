package Day08.Ex03_Util;

import java.util.Arrays;

public class ArraysEx {

	public static void main(String[] args) {

		int[] arr = { 5, 3, 4, 1, 2 };

		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}
		System.out.println();

		int[] random = new int[100];

		for (int i = 0; i < random.length; i++) {
			random[i] = (int) (Math.random() * 100 + 1);
		}

		Arrays.sort(random);

		for (int i = 0; i < random.length; i++) {
			System.out.print(random[i] + " ");
		}
		System.out.println();

		if (Arrays.binarySearch(random, 10) < 0) {
			System.out.println("랜덤 수 10이 없습니다.");
		} else {
			System.out.println("index : " + Arrays.binarySearch(random, 10));
		}

		int fill[] = new int[10];

		Arrays.fill(fill, 6);

		for (int i = 0; i < fill.length; i++) {
			System.out.print(fill[i] + " ");
		}
		System.out.println();

		int copy[] = Arrays.copyOf(fill, 3);

		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();

		int copyRange[] = Arrays.copyOfRange(arr, 2, 4);

		for (int i = 0; i < copyRange.length; i++) {
			System.out.print(copyRange[i] + " ");
		}
		System.out.println();
	}

}
















