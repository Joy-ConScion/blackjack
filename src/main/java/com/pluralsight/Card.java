package com.pluralsight;

public class Card {
    private String suit;
    private String value;
    private boolean isFaceUp;

    public Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
        this.isFaceUp = false;
    }

    public String getSuit() {// only return the suit if the card is face up
        if (isFaceUp) {
            return suit;
        } else {
            return "#";
        }
    }

    public String getValue() {// only return the value if the card is face up
        if (isFaceUp) {// this is the string value of the card // i.e. A, K, Q, J, 10, 9 ...
            return value;
        } else {
            return "#";
        }
    }

    public int getPointValue() {// only return the value if the card is face up
        if (isFaceUp) {/*|| vs && -> pipes are for OR while and-symbols are AND*/

            if (value.equalsIgnoreCase("a"))
                return 11; /*IRL I believe A can be either 1 or 11*/
            if (value.equalsIgnoreCase("k") || value.equalsIgnoreCase("q") || value.equalsIgnoreCase("j"))
                return 10;
            // determine point value and return it // A = 11 | K, Q, J = 10 | All numeric cards are equal to their face value
            return Integer.parseInt(value);
        } else {
            return 0;
        }

    }

    public boolean isFaceUp() {
        return isFaceUp;
    }

    public void flip() {
        isFaceUp = !isFaceUp;
    }
}

