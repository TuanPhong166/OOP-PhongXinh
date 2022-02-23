package baitapvenha.game;

public class Player {
    private int number = 0 ;

    public void setNumber(int  number){
        this.number = number ;
    }

    public int getNumber(){
        return this.number ;
    }
    public void guess(){
        number = (int) (Math.random()*10) ;
        System.out.println("I'm guessing "+ number);
    }

}