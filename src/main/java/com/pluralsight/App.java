package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    private static Scanner keyboard = new Scanner(System.in);
    private static ArrayList<Player> playerArrayList = new ArrayList<>();

    public static void main(String[] args) {
        Deck deck = new Deck();
        Hand hand1 = new Hand();

        System.out.println("How many players are there? ");
        int numOfPlayrs = keyboard.nextInt();
        keyboard.nextLine();
        while (numOfPlayrs > 0) {
            System.out.println("What are their usernames? ");
            String name = keyboard.nextLine();
            playerArrayList.add(new Player((name)));
            numOfPlayrs--;
        }



// deal 5 cards
        for (int i = 0; i < 5; i++) {
// get a card from the deck
            Card card = deck.deal();
// deal that card to the hand
            hand1.deal(card);
        }
        int handValue = hand1.getValue();
        System.out.println("This hand is worth " + handValue);
    }

}
