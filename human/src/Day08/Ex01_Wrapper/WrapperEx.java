package Day08.Ex01_Wrapper;

public class WrapperEx {

	public static void main(String[] args) {

		char a = 'a';
		char A = 'A';

		System.out.println(Character.toLowerCase(A));
		System.out.println(Character.toLowerCase(a));

		char c1 = '7', c2 = 'k';

		if (Character.isDigit(c1)) {
			System.out.println(c1 + "(은/는) 숫자");

		}

		if (Character.isAlphabetic(c2)) {
			System.out.println(c2 + "(은/는) 영문자");

		}
		
		System.out.println(Integer.parseInt("28"));
		System.out.println(Integer.toString(28) +2);
		System.out.println(Integer.toBinaryString(28));
		System.out.println(Integer.bitCount(28));
		
		// Integer i = new Integer(28);
		Integer i = 28;
		System.out.println(i.doubleValue());

		Double d = 3.14;
		System.out.println(d.toString() + 0.06);
		System.out.println(Double.parseDouble("3.14") + 0.06);

		Boolean b = ( i< 40);
		System.out.println(Boolean.toString(b));
		System.out.println(Boolean.parseBoolean("false"));
	}


}
