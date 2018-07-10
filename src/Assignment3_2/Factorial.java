package Assignment3_2;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		System.out.println("Input number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		long fac = factorial(num);
		System.out.println("Number input: " + num);
		System.out.println("Factorial number : " + fac);
		
	}
	
	public static long factorial (int n) {
        long result = 1;
        if (n == 0 || n == 1) {
            return result;
        } else {
            for (int i = 2; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    }


}
