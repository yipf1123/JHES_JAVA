package Day08.Ex01_Wrapper;

public class ValueCompare {

	public static void main(String[] args) {
		
		Integer intObj1 = 10;
		Integer intObj2 = 10;
		
		System.out.println("intObj1 == intObj2");
		System.out.println("결과 : " + (intObj1 == intObj2));
		System.out.println("언박싱하여 비교");
		System.out.println("결과 : " + (intObj1.intValue() == intObj2.intValue() ));
		
		System.out.println("equals() 메소드로 비교");
		System.out.println("결과 : " + intObj1.equals(intObj2));
	
		System.out.println("---------------------------------------");
	
		
		Integer intObj3 =  200;
		Integer intObj4 =  200;
	
		System.out.println("intObj3 == intObj4");
		System.out.println("결과 : " + (intObj3 == intObj4));
		System.out.println("언박싱하여 비교");
		System.out.println("결과 : " + (intObj3.intValue() == intObj4.intValue() ));
		
		System.out.println("equals() 메소드로 비교");
		System.out.println("결과 : " + intObj3.equals(intObj4));
		
		
	}
	
}
