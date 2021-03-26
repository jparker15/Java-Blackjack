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

        System.out.println("Enter Player Name:");
        String playerName = scanner.next();
        player.setName(playerName);
//        System.out.println("Enter number of chips (1 - 100,000)");
//        int chips = scanner.nextInt();
//        player.setPoints(chips);

        deck.shuffle();

        System.out.println("How much would you like to bet?");
        int bet = scanner.nextInt();
        player.setBet(bet);
        player.addCard(deck.draw());
        player.addCard(deck.draw());
        System.out.println(player.getName() + "'s Hand:");
        player.displayHand();
        player.checkScore();

        dealer.addCard((deck.draw()));
        //Hides a dealer card
        dealer.getHand().get(0).setHidden(true);
        dealer.addCard(deck.draw());
        System.out.println(dealer.name + "'s Hand:");
        dealer.displayHand();

        while(true) {
            System.out.println("Hit (1) or Stand (2)");
            int a = scanner.nextInt();

            if (a != 1) {break; }

            player.addCard(deck.draw());
            player.displayHand();

            if(!player.checkScore()){
                break;
            }
        }

        while(true){
            dealer.getHand().get(0).setHidden(false);
            if(dealer.getScore() > 17){
                dealer.displayHand();
                dealer.checkScore();
                break;
            }else {
                System.out.println("Dealer:");
                dealer.addCard(deck.draw());
                dealer.displayHand();
                dealer.checkScore();
            }

        }
        System.out.println();
        checkWinner();
    }

    public void checkWinner(){
        // Player didn't bust && dealer score is lower
        if(player.getScore() <= 21 && player.getScore() > dealer.getScore()){
            System.out.println(player.getName() + " Won!");
//            player.setPoints(player.getBet() * 2);
            System.out.println(player.getBet() * 2);
            return;
        }// Dealer bust and player did not bust
        if(dealer.getScore() > 21 && player.getScore() <= 21){
            System.out.println(player.getName() + " Won!");
            System.out.println(player.getBet() * 2);
            return;
        }// dealer and player score same
        else if(player.getScore() == dealer.getScore()){
            System.out.println("Draw");
            System.out.println("Bet returned: " + player.getBet());
            return;
        }else{
            System.out.println("-" + player.getBet());
            System.out.println("Lose");
        }
    }


}
