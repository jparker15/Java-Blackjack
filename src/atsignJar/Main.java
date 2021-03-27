package atsignJar;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        new Blackjack(new Deck(), new Player(), new Dealer()).start();

    }
}
