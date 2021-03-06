package atsignJar;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    private List<Card> cardsHeld;
    private int score = 0;


    public Hand (){
        cardsHeld = new ArrayList<>();
    }

    public void addCard(Card card){
        cardsHeld.add(card);
//        System.out.println(card.displayFace());
        System.out.println(score);
    }

    public void displayHand(){
        for (Card card:cardsHeld) {
            System.out.println(card.displayFace());
        }
    }

    public void getHandValue(){

        for (Card card:cardsHeld){
           if(card.getValue() > 10){
               score += 10;
           }else{
               score += card.getValue();
           }

        }
        System.out.println(score);
    }

}
