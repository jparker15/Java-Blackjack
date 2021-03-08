package atsignJar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards;
    final private int[] VALUES = {1,2,3,4,5,6,7,8,9,10,11,12,13};
    final private String[] SUITS = {"HEARTS", "DIAMONDS", "CLUBS", "SPADES"};

    public Deck(){
        cards = new ArrayList<>();

        for (var suit: SUITS){
            for (var value: VALUES){
                cards.add(new Card(suit,value));
            }
        }
    }

    public Card draw(){
        return cards.remove(cards.size() - 1);
    }

    public void shuffle(){
        Collections.shuffle(cards);
    }

    public void playAll(){
        try{
            for (int i = 0; i <= 52;i++ ){
                System.out.println(draw().displayFace());
            }
        }catch(Exception e){
            System.out.println("Deck is Empty");
        }

    }
}
