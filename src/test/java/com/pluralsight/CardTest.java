package com.pluralsight;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {

    @org.junit.jupiter.api.Test
    void getPointValue_1PlayrHand1Deck_ReturnRandomWorth() {
//        arrange
        Deck deck = new Deck();
        Hand hand1 = new Hand();
        deck.shuffle();
        for (int i = 0; i < 2; i++) {
            Card card = deck.deal();
            hand1.deal(card);

        }
//        act
        int handValue = hand1.getValue();
        System.out.println("This hand is worth " + handValue);
//        assert

    }
}