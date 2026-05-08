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


        for (int i = 0; i < 5; i++) {// deal 5 cards
            Card card = deck.deal();// get a card from the deck
            hand1.deal(card);// deal that card to the hand
        }
        int handValue = hand1.getValue();
        System.out.println("This hand is worth " + handValue);
    }

}
