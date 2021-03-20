package atsignJar;

<<<<<<< HEAD
public class Player extends Hand{
    String name;
    int points;


    public Player(String name){

        this.name = name;
        this.points = 100;
=======
import java.util.Scanner;

public class Player {
    private String name;
    private Hand hand = new Hand();
    private int points = 100;

    public Player (String name, Hand hand){
        this.name = name;
        this.hand = hand;
>>>>>>> 84226105d9683a7a205d0a53e1944517e16dc0b3
    }



<<<<<<< HEAD
=======








>>>>>>> 84226105d9683a7a205d0a53e1944517e16dc0b3
}
