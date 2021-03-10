package atsignJar;

import java.util.Scanner;

public class Blackjack {

    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
       new Blackjack();
    }

    public Blackjack(){
        Deck myDeck = new Deck();
        Hand myHand = new Hand();
        myDeck.shuffle();
//        startTurn(myDeck);
        myHand.addCard(myDeck.draw());
        myHand.addCard(myDeck.draw());
        myHand.addCard(myDeck.draw());
        myHand.displayHand();
        System.out.println("break");
        myDeck.playAll();

    }

    public void welcome (){
        System.out.println("Welcome to Black Jack!");

    }

    public void startTurn(Deck deck){
        welcome();
//        deck.playAll();
        Hand playerHand = new Hand();
        Hand dealerHand = new Hand();
        playerHand.startHand(deck.draw());
           while (true){
               System.out.println("Hit (1) or Stand (2)");
               int hitOrStand = scanner.nextInt();
               if(hitOrStand == 1  ){
                   playerHand.addCard(deck.draw());
                   playerHand.displayHand();
                   if(playerHand.checkScore() > 21){
                       break;
                   }
               }
               else{
//                   playerHand.displayHand();
                   break;
               }
           }
        dealerHand.startHand(deck.draw());

        playerHand.checkScore();
           dealerHand.checkScore();




    }
}
