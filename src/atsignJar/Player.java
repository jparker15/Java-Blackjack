package atsignJar;

public class Player extends Hand {
    private String name;
    private int points;
    private int bet;


//    public Player(String name, int points) {
//        this.setName(name);
//        this.setPoints(points);
//    }

    public Player(){

    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getBet() {
        return bet;
    }

    public void setBet(int bet) {
        this.bet = bet;
    }
}
