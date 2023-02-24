package Day08.Ex02_Lang;

public class StringBufferEx {

	public static void main(String[] args) {
		String str = "안녕";
		str = "안녕하세요";
		
		StringBuffer sb = new StringBuffer("This");
		
		System.out.println(sb);
		
		sb.append(" is Java");
		System.out.println(sb); 
		
		sb.insert(7, " real");
		System.out.println(sb);
		
		sb.replace(8, 12, "good");
		System.out.println(sb);
	
		sb.delete(8, 13);
		System.out.println(sb);
	
		sb.setLength(4);
		System.out.println(sb);
	}
	
}
