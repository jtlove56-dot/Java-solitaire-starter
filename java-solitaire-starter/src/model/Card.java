
package model;

public class Card {
    private final Suit suit;
    private final Rank rank;
    private boolean faceUp;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
        this.faceUp = false;
    }

    public void flip() {
        faceUp = !faceUp;
    }

    public boolean isFaceUp() {
        return faceUp;
    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    @Override
    public String toString() {
        if (!faceUp) return "[XX]";
        return "[" + rank + " of " + suit + "]";
    }
}
