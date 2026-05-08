package com.pluralsight;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class HandTest {

    @Test
    void viewHand_1PlayrHandAnd1Deck_ReturnCardsInHand() {
//        arrange
//        Deck deck = new Deck();
//        Hand hand1 = new Hand();
//        deck.shuffle();
//        for (int i = 0; i < 2; i++) {
//            Card card = deck.deal();
//            hand1.deal(card);
//         class Hand {
//             private ArrayList<Card> cards;
//
//             public Hand() {
//                 cards = new ArrayList<>();
//             }
//
//             public void deal(Card card) {
//                 cards.add(card);
//             }
//
//             public void viewHand() {
//                 for (Card card : cards) {
//                     card.flip();
//                     System.out.println(card);
//                 }
//             }
////        act
//void handView = hand1.viewHand();
//        System.out.println("Here's your hand " + hand.getValue());//        assert
//
//         }
//    }
    }

    @Test
    void viewHand_1PlayrHandAnd1Deck_ReturnCardsInHand2() {
//arrange
        Deck deck = new Deck();
        deck.shuffle();
        Hand hand = new Hand();
        hand.deal(deck.deal());
        hand.deal(deck.deal());
        hand.viewHand();

//act
        System.out.println("Hand value: " + hand.getValue());
//        arrange

    }
}