package atsignJar;

public class Blackjack {

    public Blackjack(){
        Deck myDeck = new Deck();
        Hand myHand = new Hand();

        myDeck.shuffle();
        myDeck.draw();
        myHand.addCard(myDeck.draw());
        myHand.addCard(myDeck.draw());
        myHand.addCard(myDeck.draw());
        myHand.displayHand();
        myHand.getHandValue();
    }
}
