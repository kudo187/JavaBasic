package Assignment2;

import java.util.Scanner;

public class Main {
	 public static void main(String[] args){
		 Scanner sc  = new Scanner(System.in);
		 System.out.println("Mời nhập số lượng người chơi. Tối đa chỉ 4 người chơi !!!");
		 int numOfPlayer = sc.nextInt();
		 Deck deck = new Deck();
		 deck.Shuffle();
		 deck.Playing(numOfPlayer);
		 deck.showCardPlayer();
	 }
}
