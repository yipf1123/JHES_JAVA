package Day05.Ex01_ObjectArray;





class Circle{
	// 변수		: 반지름
	// 메소드 	: 넓이
	int radius;
	
	// 생성자
	public Circle(int radius) {
		this.radius = radius;
	}
	
	//메소드
	public double getArea() {
		return 3.14 *radius*radius;
		}
}

public class CircleArray {

	public static void main(String[] args) {
		Circle[] c; 
		c = new Circle[5];
		
		for (int i = 0; i < c.length; i++) {
			c[i] = new Circle(i+1);
		}
		
		for (Circle circle : c) {
			System.out.println("넓이 : " + circle.getArea());
		}
		
		
	}
	
	
}
