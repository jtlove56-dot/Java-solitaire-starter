
package ui;

import model.Card;
import model.Deck;

public class ConsoleRenderer {

    public void renderDeck(Deck deck) {
        System.out.println("=== Solitaire Deck Test ===");
        for (Card card : deck.getCards()) {
            card.flip();
            System.out.println(card);
        }
    }
}
