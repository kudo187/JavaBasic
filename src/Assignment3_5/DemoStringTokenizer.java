package Assignment3_5;

import java.util.Scanner;
import java.util.StringTokenizer;

public class DemoStringTokenizer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.println("Enter number phone with format (xxx) xxx-xxxxxx");
		str = sc.nextLine();
		StringTokenizer st = new StringTokenizer(str, "()-");
		System.out.println("Contry code: " + st.nextToken());
		System.out.println("Encode: " + st.nextToken());
		System.out.println("Number phone: " + st.nextToken());

	}
}
