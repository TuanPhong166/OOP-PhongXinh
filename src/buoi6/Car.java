package buoi6;

public class Car {
    private String carColor ;
    private double carPrice = 0.0 ;
    
    public void setCarColor(String carColor){
        this.carColor = carColor ;
    }

    public void setCarPrice(double carPrice){
        this.carPrice = carPrice ;
    }
    public String getCarColor(){
        return this.carColor ;
    }

    public double getCarPrice(){
        return this.carPrice ;
    }
}
