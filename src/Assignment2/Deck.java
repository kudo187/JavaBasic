package Assignment2;

import java.util.ArrayList;
import java.util.Random;

public class Deck {
	ArrayList<Card> arrCard = new ArrayList<>();
	String[] suits = { "Spades", "Hearts", "Diamonds", "Clubs" };
	String[] ranks = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
	ArrayList<Card> player1 = new ArrayList<>();
	ArrayList<Card> player2 = new ArrayList<>();
	ArrayList<Card> player3 = new ArrayList<>();
	ArrayList<Card> player4 = new ArrayList<>();

	public Deck() {
		int lengthRank = ranks.length;
		int lengthSuit = suits.length;
		for (int i = 0; i < lengthRank; i++) {
			for (int j = 0; j < lengthSuit; j++) {
				arrCard.add(new Card(ranks[i], suits[j]));
			}
		}
	}

	public void Shuffle() {
		int sizeArrCard = arrCard.size();
		for (int i = 0; i < sizeArrCard; i++) {
			int index = (int) (Math.random() * sizeArrCard);
			Card temp = arrCard.get(i);
			arrCard.set(i, arrCard.get(index));
			arrCard.set(index, temp);
		}
	}

	public void Playing(int numOfPlayer) {
		switch (numOfPlayer) {

		case 2:
			for (int i = 0; i < 26; i = i + 2) {
				player1.add(arrCard.get(i));
				player2.add(arrCard.get(i + 1));
			}
			break;
		case 3:
			for (int i = 0; i < 39; i = i + 3) {
				player1.add(arrCard.get(i));
				player2.add(arrCard.get(i + 1));
				player3.add(arrCard.get(i + 2));
			}
			break;
		case 4:
			for (int i = 0; i < 52; i = i + 4) {
				player1.add(arrCard.get(i));
				player2.add(arrCard.get(i + 1));
				player3.add(arrCard.get(i + 2));
				player4.add(arrCard.get(i + 3));
			}
			break;
		default:
			for (int i = 0; i < 13; i++) {
				player1.add(arrCard.get(i));
			}
			break;
		}

	}

	public void showCardPlayer() {
		System.out.println("--------->Player 1<---------");
		for (Card card : player1) {
			System.out.println(card.toString());
		}
		System.out.println();
		System.out.println("--------->Player 2<---------");
		for (Card card : player2) {
			System.out.println(card.toString());
		}
		System.out.println();
		System.out.println("--------->Player 3<---------");
		for (Card card : player3) {
			System.out.println(card.toString());
		}
		System.out.println();
		System.out.println("--------->Player 4<---------");
		for (Card card : player4) {
			System.out.println(card.toString());
		}
	}
}
