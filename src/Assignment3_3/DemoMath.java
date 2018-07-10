package Assignment3_3;

import java.util.Scanner;

public class DemoMath {
	static int[] arrNumber;
	static int count = 0;
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		inputNumber();
		int min = arrNumber[0];
		int max = arrNumber[0];
		for (int i = 1; i < arrNumber.length; i++) {
			if(max < arrNumber[i])
			{
				max = arrNumber[i];
			}
		}
		System.out.println("Square of the largest number : " + Math.pow(max,2));
		
		for (int i = 1; i < arrNumber.length; i++) {
			if(min > arrNumber[i])
			{
				min = arrNumber[i];
			}
		}
		System.out.println("Square of the largest number : " + Math.pow(min,2));
		
	}
	
	public static void inputNumber(){
		System.out.println("Enter the number of elements");
		int numElement = sc.nextInt();
		arrNumber = new int[numElement];
		while (count < numElement) {
			System.out.println("Enter " + (count + 1) + " element: ");
			arrNumber[count] = sc.nextInt();
			count++;
		}
	}
}
