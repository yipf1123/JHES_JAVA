package Day08.Ex02_Lang;

public class MathEx {

	public static void main(String[] args) {
		
		System.out.println(Math.PI);
		System.out.println(Math.ceil(3.125));
		System.out.println(Math.floor(3.75));
		System.out.println(Math.sqrt(9));
		System.out.println(Math.pow(3,  2));
		System.out.println(Math.exp(2));
		System.out.println(Math.round(3.14));

		System.out.println("이번 주 행운번호는 ");
		for (int i = 0; i < 6; i++) {
			int random = (int)(Math.random() * 45 +1);
			System.out.print(random + " ");
		}
		System.out.println();
		
		int random2 = (int) (Math.random() * 41 -20); 
		System.out.println(random2);
	
	
	}

}


