package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class PlayGame {/*Hides from App class for cleaner look and easier tracking*/

    private static Scanner keyboard = new Scanner(System.in);
    private ArrayList<Player> playerArrayList = new ArrayList<>();


    public void runGame() {
        Deck deck = new Deck();
        deck.shuffle();

        System.out.println("How many players are there?");
        int numPlayers = keyboard.nextInt();
        keyboard.nextLine();

        for (int i = 0; i < numPlayers; i++) {/*Est players*/
            System.out.println("Enter username:");
            String name = keyboard.nextLine();
            playerArrayList.add(new Player(name));
        }

        for (int i = 0; i < 2; i++) {/*Deal cards*/
            for (Player player : playerArrayList) {
                player.getHand().deal(deck.deal());
            }
        }

        for (Player player : playerArrayList) {/*Show hand*/
            System.out.println("\n" + player.getName() + "'s hand:");
            player.getHand().viewHand();
            System.out.println("Value: " + player.getHand().getPointValue());/*NOT WORKING PROPERLY, will return*/
        }
    }
}



