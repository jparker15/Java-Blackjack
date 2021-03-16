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
        Hand cpu = new Hand();
        myDeck.shuffle();
        startTurn(myDeck);
//        myHand.addCard(myDeck.draw());
//        myHand.addCard(myDeck.draw());
//        myHand.addCard(myDeck.draw());
//        myHand.displayHand();
//        cpu.addCard(myDeck.draw());
//        cpu.addCard(myDeck.draw());
//        cpu.addCard(myDeck.draw());
//        cpu.displayHand();

//        System.out.println("break");
//        myDeck.playAll();

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
        playerHand.startHand(deck.draw());

           while (true){
               System.out.println("Hit (1) or Stand (2)");
               int hitOrStand = scanner.nextInt();
               if(hitOrStand == 1  ){
                   playerHand.addCard(deck.draw());
                   playerHand.displayHand();
                   if(playerHand.checkScore() > 21){
                       System.out.println("Bust!");
                   }
               }
//               else{
//                   playerHand.displayHand();
                   System.out.println("Dealer Hand:");
                   dealerHand.startHand(deck.draw());
                   if(dealerHand.checkScore() < 17){
                       dealerHand.addCard(deck.draw());
                   }
                   else{
                       checkWinner(playerHand,dealerHand);
                   }

//               }
               System.out.println("Would you like to play again!? Press Yes (1) or No (2)");
               int playAgain = scanner.nextInt();
               if(playAgain != 1){
                   break;
               }
           }
//        dealerHand.startHand(deck.draw());

//        playerHand.checkScore();
//           dealerHand.checkScore();




    }

    public void checkWinner(Hand hand, Hand cpuHand){
        if(hand.checkScore()> cpuHand.checkScore()){
            System.out.println("Winner");
        }else if(hand.checkScore() == cpuHand.checkScore()){
            System.out.println("Draw");
        }
        else{
            System.out.println("Dealer Wins!");
        }
    }
}
