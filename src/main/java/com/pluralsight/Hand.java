package com.pluralsight;

import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> cards;

    public Hand() {
        cards = new ArrayList<>();
    }

    public void deal(Card card) {    // A Card is dealt to the Hand and the Hand is responsible to store the card
        cards.add(card);
    }

    public void viewHand(){
        for (Card card:cards){
            card.flip();
            System.out.println(card);
        }
    }

    public int getSize() {/*Test this, should say how many cards in hand*/
        return cards.size();
    }

    public int getValue() {// The Hand uses the methods of each card to determine the value of each card - and adds up all values
        int value = 0;

        for (Card card : cards) {
            card.flip(); // turn the card over to see the value
            value += card.getPointValue();
            card.flip(); // hide the card again
        }

        return value;
    }
}