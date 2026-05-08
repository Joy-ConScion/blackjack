package com.pluralsight;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class HandTest {

    @Test
    void viewHand_1PlayrHandAnd1Deck_ReturnCardsInHand() {
//        arrange

         class Hand {
             private ArrayList<Card> cards;

             public Hand() {
                 cards = new ArrayList<>();
             }

             public void deal(Card card) {
                 cards.add(card);
             }

             public void viewHand() {
                 for (Card card : cards) {
                     card.flip();
                     System.out.println(card);
                 }
             }
//        act
hand1.viewHand()
//        assert

         }
    }
}