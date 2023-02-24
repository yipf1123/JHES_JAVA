package Day08.Ex03_Util;

import java.util.Random;

public class RandomEx {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		boolean randomTF = random.nextBoolean();
		System.out.println(randomTF);
		
		System.out.println("동전을 던집니다...");
	
		if ( randomTF ) {
			System.out.println("앞면");
		}
		
		else {
			System.out.println("뒷면");
		}
		
		int fourByteRandom = random.nextInt();
		System.out.println("4바이트 랜덤 점수 : " + fourByteRandom);
		
		int dice = random.nextInt(6) + 1;
		System.out.println("주사위 : " + dice);
		
		int lotto = random.nextInt(45) + 1;
		System.out.println("로또번호 : " + lotto);
		
		double randomDouble = random.nextDouble();
		System.out.println("실수 랜덤 수 : " + randomDouble);
		
	}
	
}

