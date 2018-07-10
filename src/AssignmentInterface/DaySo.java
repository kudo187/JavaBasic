package AssignmentInterface;
import java.util.Scanner;

public class DaySo {
	int arrDaySo[];
	DaySo(int n){
		arrDaySo = new int[n];
	}
	
	public void nhap(){
		int count = 1;
		while(count <= arrDaySo.length){
			System.out.println("Mời bạn nhập số thứ " + count + ": ");
			Scanner sc = new Scanner(System.in);
			arrDaySo[count-1] = sc.nextInt();
			count++;
		}
		
		
	}
	
	public void print() {
		if (arrDaySo.length > 0) {
			String result = "";
		for (int i = 0; i < arrDaySo.length; i++) {
			result = result + arrDaySo[i] + ",";
		}
		System.out.println(result);
		}
		else{
			System.out.println("Mảng không có phẩn tử nào...");
		}
	}
}
