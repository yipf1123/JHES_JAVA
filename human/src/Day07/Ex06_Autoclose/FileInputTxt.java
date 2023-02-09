package Day07.Ex06_Autoclose;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTxt {

	public static void main(String[] args) {
	
		FileInputStream fis = null;

	try
	{
		fis = new FileInputStream("test.txt");
		int read = 0;
		while ((read = fis.read()) != -1) {
			System.out.print((char) read);
		}
	}catch(
	FileNotFoundException e){
		e.printStackTrace();
		System.err.println("파일을 찾을 수 없습니다.");
	}catch(IOException e){
		e.printStackTrace();
		System.err.println("입출력 관련 예외 발생");
	}finally
	{
		if (fis != null) {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}

}
