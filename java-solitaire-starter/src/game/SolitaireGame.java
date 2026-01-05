
package game;

import model.Deck;
import ui.ConsoleRenderer;

public class SolitaireGame {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();

        ConsoleRenderer renderer = new ConsoleRenderer();
        renderer.renderDeck(deck);
    }
}
