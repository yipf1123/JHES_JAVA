package Day08.Ex02_Lang;

public class StringEx {

	public static void main(String[] args) {
		String str1 = " Human Edu Center ";
		String str2 = " human Edu Center ";
		
		System.out.println( str1.charAt(2) );
		System.out.println( str1.concat(str2) );
		System.out.println( str1.contains("Edu") );
		System.out.println( str1.equals(str2) );
		System.out.println( str1.equalsIgnoreCase(str2) );
		System.out.println( str1.indexOf("c") );
		System.out.println( str1.lastIndexOf("u") );
		System.out.println( str1.trim() );
		System.out.println( str1.length() );
		System.out.println( str1.substring(7) );
		System.out.println( str1.substring(7, 17) );
		System.out.println( str1.replace(" ", "#") );
		System.out.println( str1.replaceAll(" ", "*") );
		System.out.println( str1.toUpperCase() );
		System.out.println( str1.toLowerCase() );
	
		String[] sp = str1.split("");
		for (int i = 0; i < sp.length; i++) {
			System.out.println(i + "\t : " + sp[i]);
		}
	}
	
}

