package Buoi4;

public class Cow {
    //attribute 
    double weight ;
    int age ;
     
    // hàm tọa mặc định
    Cow(){
        weight = 11.2 ;
    }

    Cow(double w){
        weight = w ;
    }

    void moo(){
        System.out.println("Be be......");
    }
}
