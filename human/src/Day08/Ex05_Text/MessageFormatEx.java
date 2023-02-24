package Day08.Ex05_Text;

import java.text.MessageFormat;

public class MessageFormatEx {
 
	public static void main(String[] args) {
		
		String text = "아이디 : {0}\n비밀번호 : {1}";
		String id = "human1004";
		String pw = "123456";
		String login = MessageFormat.format(text, id, pw);
		
		System.out.println(login);
		
		String[] studentInfo = {"김휴먼", "23학번", "컴퓨터공학과", "20살"};
		String studentFormat = "이름 : {0} \n"
							 + "학번 : {1} \n"
							 + "전공 : {2} \n"
							 + "나이 : {3} \n";
		
		String student = MessageFormat.format(studentFormat, studentInfo);
		
		System.out.println(student);
	
	
	}
	
}
