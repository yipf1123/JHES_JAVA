package Day04;


public class Ex03_Language {

	public static void main(String[] args) {

		int count[] = new int[6];
		for (int i = 0; i < count.length; i++) {
			count[i] = (i + 1);
			System.out.print(count[i] + " ");
		}
		System.out.println();

		String language[] = {"java", "html", "css", "javascript","sql","python"};
		
		for (int i = 0; i < language.length; i++) {
			System.out.print(language[i] + " ");
		}
		System.out.println();
		
		for (String lang : language) {
			System.out.print(lang + " ");
		}
	 System.out.println();
	
	 	int x = 0;
	 	while (x <language.length) {
	 		System.out.print(language[x] + " ");
	 		x++;
	 	}
	 
	}
	
	
	

}
