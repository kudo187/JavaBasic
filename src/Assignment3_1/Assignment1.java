package Assignment3_1;

import java.util.Scanner;

public class Assignment1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number: ");
		int num = sc.nextInt();
		int square = num*num;
		int exponential = num*num*num;
		System.out.println("Số nhập vào: " + num);
		System.out.println("Bình phương: " + square);
		System.out.println("Lũy thừa 3: " + exponential);
		
	}
	
	
}
