package atsignJar;

public class Main {

    public static void main(String[] args) {
	// write your code here
        new Blackjack(new Deck(), new Player("Jar"), new Dealer()).start();

    }
}
