package atsignJar;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    private final List<Card> cardsHeld;
    private int score;

    public Hand (){
        cardsHeld = new ArrayList<>();
    }

    public void startHand(Card card){
        addCard(card);
        displayHand();
    }

    public int addCard(Card card){
        cardsHeld.add(card);
        score = 0;
        for(Card addedCard: cardsHeld){
            if(addedCard.getValue() > 10){
                score += 10;
            }
            else{
                score += addedCard.getValue();
            }
        }
        return score;
    }

    public void displayHand(){
        for(Card card: cardsHeld){
            System.out.println(card.displayFace());
        }
//        checkScore();
    }

    public int checkScore(){
        if(score > 21){
            System.out.println("BUST!\n Score:" + score);

        }else if (score == 21){
            System.out.println("BLACKJACK!" + score);

        }else{
            System.out.println("Score:" + score);
        }
        return score;
    }


}
