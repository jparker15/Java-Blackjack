package atsignJar;

public class Blackjack {

    public static void main(String[] args) {
       new Blackjack();
    }

    public Blackjack(){
        Deck myDeck = new Deck();
        Hand myHand = new Hand();

//        myDeck.shuffle();
////        myDeck.playAll();
//
////        myHand.addCard(myDeck.draw());
////        myHand.addCard(myDeck.draw());
//        myHand.addCard(myDeck.draw());
//        myHand.addCard(myDeck.draw());
////        myHand.displayHand();
////        myHand.getHandValue();
    }

    public void welcome (){
        System.out.println("Welcome to Black Jack!");
    }

    public void startTurn(){
        welcome();

    }
}
