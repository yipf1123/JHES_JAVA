package Day08.Ex05_Text;

import java.text.DecimalFormat;

public class DecimalFormatEx {

	public static void main(String[] args) {

		double num = 1234.5678;

		DecimalFormat df = new DecimalFormat("0");
		System.out.println(df.format(num));

		df = new DecimalFormat("0.0");
		System.out.println(df.format(num));

		df = new DecimalFormat("00000.00000");
		System.out.println(df.format(num));

		df = new DecimalFormat("#");
		System.out.println(df.format(num));

		df = new DecimalFormat("#.#");
		System.out.println(df.format(num));

		df = new DecimalFormat("#####.#####");
		System.out.println(df.format(num));
		
		double num2 = 100000000;

		df = new DecimalFormat("#,###");
		System.out.println(df.format(num2));
		
		double num3 = 123;
		
		df = new DecimalFormat("+#.0");
		System.out.println(df.format(num3));
		
		df = new DecimalFormat("-#.0");
		System.out.println(df.format(num3));

		double num4 = 0.2;
		
		df = new DecimalFormat("#.#%");
		System.out.println(df.format(num4));
		
		df = new DecimalFormat("\u00A4 #,###");
		System.out.println(df.format(num2));


	}

}










