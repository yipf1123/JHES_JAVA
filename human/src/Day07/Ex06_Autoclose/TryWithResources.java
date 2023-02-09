package Day07.Ex06_Autoclose;

import java.io.FileInputStream;

public class TryWithResources {

	public static void main(String[] args) {

		try (FileInputStream fis = new FileInputStream("test.txt")) {
			int read;

			while ((read = fis.read()) != -1) {
				System.out.print((char) read);
			}
		} catch (Exception e) {
			System.out.println("예외 발생");
		}

	}
}
