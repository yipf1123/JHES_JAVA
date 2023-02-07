package Day04.Ex02_Calculator;

public class CalculatorEx {

	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		int a = 10;
		int b = 5;
		double x = 10.25;
		double y = 5.4;
		int arr[] = { 1,2,3,4,5};
		
		int plus = calculator.plus(a, b);
		int minus = calculator.minus(a, b);
		double multiple = calculator.multiple(a, b);
		double divide = calculator.divide(x, y);
		int sum = calculator.sum(arr);
		double avg = calculator.avg(arr);
		
		System.out.println("plus : " + plus);
		System.out.println("minus : " + minus);
		System.out.printf("multiple : %5.2f \n", multiple);
		System.out.printf("divide : %5.2f \n", divide);
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
		
		
	}
	
}
