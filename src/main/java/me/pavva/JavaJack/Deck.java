package me.pavva.JavaJack;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Deck {

    private List<Card> cards = new ArrayList<Card>(52);

    public Deck() {

        for (Suits s : Suits.values()) {
            for (Ranks r : Ranks.values()) {
                Card c = new Card(s, r);
                cards.add(c);
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(this.cards);
    }

    public Card getCard(int index) {
        return this.cards.get(index);
    }

    public void deal(Hand targetPlayer) {
        targetPlayer.addCard(this.cards.get(0));
        this.cards.remove(0);
    }

    public void reset() {
        this.cards.clear();
        
        for (Suits s : Suits.values()) {
            for (Ranks r : Ranks.values()) {
                Card c = new Card(s, r);
                cards.add(c);
            }
        }
    }
}
