package com.pluralsight;

public class Player {
    String name;
    Hand hand;

    public Player(String name) {
        this.name = name;
        hand = new Hand();
    }

    public String getName() {
        return name;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Hand getHand() {
        return hand;
    }
}
