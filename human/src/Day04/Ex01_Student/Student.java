package Day04.Ex01_Student;

public class Student {

	String name;
	int age;
	String stdNo;
	String major;

	public Student() {

	}

	public Student(String name, int age, String stdNo, String major) {
		this.name = name;
		this.age = age;
		this.stdNo = stdNo;
		this.major = major;
	}

	public void study(String subject) {
		System.out.println(subject + "(을/를) 공부합니다.");
	}

	public double getAverage(int score1, int score2) {
		double average = 0.0;
		average = (double) (score1 + score2) / 2;
		return average;
	}

	// 메소드 오버로딩
	public double getAverage(int score1, int score2, int score3) {
		double average = 0.0;
		average = (double) (score1 + score2 + score3) / 3;
		return average;
	}

	public double getAverage(int[] scores) {
		double average = 0.0;
		int sum = 0;
//		for (int i = 0; i < scores.length; i++) {
//			sum += scores[i];
//		}
//		average = (double) sum / scores.length;
//		return average;

		for (int score : scores) {
			sum += score;
		}
		average = (double) sum / scores.length;
		return average;

	}
	

	
	
}
