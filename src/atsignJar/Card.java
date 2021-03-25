package atsignJar;


public class Card {

    private String suit;
    private int value;
    private boolean isHidden = false;

    public Card (String suit, int value, boolean isHidden){
        this.suit = suit;
        this.value = value;
        this.isHidden = false;

    }

    public int getValue() {
        return value;
    }

    public void setHidden(boolean status){this.isHidden = status;}

    public String displayFace(){
        String output = "";

        if(isHidden){
            return "[Hidden]";
        }
        switch (value){
            case 1:
                output= "AC";
                break;
            case 11:
                output= "JA";
                break;
            case 12:
                output= "QU";
                break;
            case 13:
                output= "KI";
                break;
            default:
                output = value == 10 ? Integer.toString(value) : " " + value;
        }
        return output + " " + suit;
    }
}
