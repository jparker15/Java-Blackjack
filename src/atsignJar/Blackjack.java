package atsignJar;

import java.util.Scanner;

public class Blackjack {
    Deck deck;
    Player player;
    Dealer dealer;

    Scanner scanner = new Scanner(System.in);

    public Blackjack(Deck deck, Player player, Dealer dealer){
       this.deck = deck;
       this.player = player;
       this.dealer = dealer;

    }

    public void start(){
        System.out.println("Welcome to Black Jack!");

        deck.shuffle();

        player.addCard(deck.draw());
        player.addCard(deck.draw());
        player.displayHand();


        while(true) {
            System.out.println("Hit (1) or Stand (2)");
            int a = scanner.nextInt();
            player.checkScore();

            if (a != 1) {break; }

            if(!player.checkScore()){
                break;
            }
            else{
                player.addCard(deck.draw());
                player.displayHand();
            }
        }

        dealer.addCard(deck.draw());
        dealer.addCard(deck.draw());
        dealer.displayHand();

        while(true){
            if(dealer.getScore() > 17){
                break;
            }else{
                System.out.println("Dealer:");
                dealer.addCard(deck.draw());
                dealer.displayHand();
                dealer.getScore();;
            }
        }

        checkWinner();
    }

    public void checkWinner(){
        if(player.getScore() > dealer.getScore()){
            System.out.println("Winner");
        }else if(player.getScore() == dealer.getScore()){
            System.out.println("Draw");
        }else{
            System.out.println("Lose");
        }
    }
}
