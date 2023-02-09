package Day07.Ex07_ExceptionThrows;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionThrows {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		try {
			input();
		}catch(InputMismatchException e) {
			e.printStackTrace();
			System.err.println("정수를 입력해주세요");
		}
	}

	public static void input() throws InputMismatchException{
		
		System.out.print("입력 : ");
		int input = sc.nextInt();
		
		System.out.print(input);
				
	}
	
	
}
