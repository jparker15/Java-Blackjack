package atsignJar;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    private final List<Card> cardsHeld;
    private int score;

    public Hand (){
        cardsHeld = new ArrayList<>();
    }

    public List<Card> getHand(){
        return cardsHeld;
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
            System.out.println (card.displayFace() + "");
        }
    }

    public boolean checkScore(){
        if(score > 21){
            System.out.println("BUST!\nScore:" + score);
            return false;

        }else if (score == 21){
            System.out.println("BLACKJACK!" + score);
            return false;

        }else{
            System.out.println("Score:" + score);
            return true;
        }

    }

    public int getScore(){
        return score;
    }

    public void clear(){
        cardsHeld.clear();
    }


}
