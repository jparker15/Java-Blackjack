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

        System.out.println("Enter number of chips (1 - 100,000)");

        int chips = scanner.nextInt();
        player.setPoints(chips);
        deck.shuffle();

        while (true){
            gameLoop();
            checkWinner();
            System.out.println("Would you like to play again?");
            String answer = scanner.next();
            if(!answer.toLowerCase().contains("y")){
                break;
            }
        }


    }

    public void gameLoop (){
        int bet;
        while (true){
            System.out.println("How much would you like to bet?");
            bet = scanner.nextInt();
            if(bet < player.getPoints()){break;
            }
            System.out.println("Please place a smaller bet");

        }
        player.setBet(bet);

        player.addCard(deck.draw());
        player.addCard(deck.draw());
        System.out.println(player.getName() + "'s Hand:");
        player.displayHand();
        player.checkScore();

        dealer.addCard((deck.draw()));
        dealer.addCard(deck.draw());
        //Hides a dealer card
        dealer.getHand().get(1).setHidden(true);
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
            dealer.getHand().get(1).setHidden(false);
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
    }

    public void checkWinner(){
        int winBet = (player.getBet() * 2);
        // Player didn't bust && dealer score is lower
        if(player.getScore() <= 21 && player.getScore() > dealer.getScore()){
            System.out.println(player.getName() + " Won!");
            System.out.println(winBet);
            player.setPoints(player.getPoints() + winBet);
            System.out.println(player.getPoints());
            return;
        }// Dealer bust and player did not bust
        if(dealer.getScore() > 21 && player.getScore() <= 21){
            System.out.println(player.getName() + " Won!");
            System.out.println(winBet);
            player.setPoints(player.getPoints() + winBet);
            System.out.println(player.getPoints());

            return;
        }// dealer and player score same
        else if(player.getScore() == dealer.getScore()){
            System.out.println("Draw");
            System.out.println("Bet returned: " + player.getBet());
            System.out.println(player.getPoints());

            return;
        }else{
            System.out.println("-" + player.getBet());
            System.out.println("Lose");
            player.setPoints(player.getPoints() - player.getBet());
        }
        System.out.println(player.getPoints());
    }


}
