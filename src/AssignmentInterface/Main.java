package AssignmentInterface;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int select;
		int numElement;
		while(true){
			
			do {
				System.out.println("Mời bạn chọn giả thuật");
				System.out.println("1. Quick sort");
				System.out.println("2. Selection sort");
				System.out.println("3. Insert sort");
				System.out.println("4. Exit");
				select = sc.nextInt();
			} while (select <= 0 && select > 4);
			 
			switch(select)
			{
			case 1: 
				System.out.println("Nhập số phần tử");
				numElement = sc.nextInt();
				QuickSort quickSort = new QuickSort(numElement);
				System.out.println("Nhập các dãy số để sắp xếp bằng Quick Sort");
				quickSort.nhap();
				System.out.println("Mảng hiện tại");
				quickSort.print();
				quickSort.Sort();
				System.out.println("Mảng sau khi Sort");
				quickSort.print();
				break;
			case 2:
				// Selection Sort
				System.out.println("Nhập số phần tử");
				numElement = sc.nextInt();
				SelectionSort selectionSort = new SelectionSort(numElement);
				System.out.println("Nhập các dãy số để sắp xếp bằng Selection Sort");
				selectionSort.nhap();
				System.out.println("Mảng hiện tại");
				selectionSort.print();
				selectionSort.Sort();
				System.out.println("Mảng sau khi Sort");
				selectionSort.print();
				break;
			case 3:
				// Insert Sort
				System.out.println("Nhập số phần tử");
				numElement = sc.nextInt();
				InsertSort insertSort = new InsertSort(numElement);
				System.out.println("Nhập các dãy số để sắp xếp bằng Insert Sort");
				insertSort.nhap();
				System.out.println("Mảng hiện tại");
				insertSort.print();
				insertSort.Sort();
				System.out.println("Mảng sau khi Sort");
				insertSort.print();
				break;
			case 4: 
				return;
			}
		}


	}
}
