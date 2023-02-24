package Day08.Ex03_Util;

import java.util.StringTokenizer;

public class StrintTokenizerEx {

	public static void main(String[] args) {

		String java = "클래스,생성자,상속,오버로딩.오버라이딩 추상클래스/인터페이스";
		StringTokenizer st = new StringTokenizer(java, ".,/ ");

		System.out.println("토큰의 수 : " + st.countTokens());

		while (st.hasMoreTokens()) {
			System.out.print(st.nextToken() + " ");
		}
		System.out.println();
	}

}


