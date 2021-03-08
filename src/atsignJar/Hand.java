package atsignJar;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    private final List<Card> cardsHeld;
    private int score;

    public Hand (){
        cardsHeld = new ArrayList<>();
    }

    public void addCard(Card card){
        cardsHeld.add(card);
//        System.out.println(card.displayFace());
        score = 0;
        for(Card addedCard: cardsHeld){
            System.out.println(addedCard.displayFace());
            if(addedCard.getValue() > 10){
                score += 10;
            }
            else{
                score += addedCard.getValue();
            }
        }
        if(score > 21){
            System.out.println("BUST!\n Score:" + score);
        }else{
            System.out.println("Score:" + score);
        }

    }

    public void displayHand(){
        for(Card card: cardsHeld){
            System.out.println(card.displayFace());
        }
    }


}
