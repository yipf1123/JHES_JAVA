package Day05.Ex05_StaticMember;

public class StaticMember {

	//static 변수
	static int a;
	static int b;
	int c;
	// final 선언 시, 반드시 값을 초기화해야한다.
	// final은 상수가 되서, 값을 바꿀 수 없다.
	static final double PI = 3.141592;
	
	//static 메소드 
	public static int sum(int x, int y) {
		int sum = a+b+x+y;
		// sum += c; //static 메소드는 static 멤버만 접근할 수 있다.
		return sum;
	}
	
	public static void main(String[] args) {
		int sum = sum(10,20);
		a = 100;
		StaticMember sm1 = new StaticMember();
		StaticMember sm2 = new StaticMember();
		
		int a1 =sm1.a;
		int c1 = sm1.c=10;
		int a2 =sm2.a;
		int c2 = sm2.c = 20;
		
		// PI = 100;
		
		System.out.println("a1 : " + a1);
		System.out.println("c1 : " + c1);
		System.out.println("a2 : " + a2);
		System.out.println("c2 : " + c2);
		
	}
}
