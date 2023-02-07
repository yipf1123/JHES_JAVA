package Day06.Ex01_Shape;

public class Circle extends Shape {

	double radius;

	public Circle(double radius) {
		this.radius = radius;
	}
	
	
	@Override
	double area() {
		return Math.PI *radius *radius;
	}

	@Override
	double round() {
		return 2 *Math.PI*radius;
	}


	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	

}
