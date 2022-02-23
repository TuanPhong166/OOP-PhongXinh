package buoi6;

public class CarTest {
    public static void main(String[] args) {
        Car car  = new Car() ;
        car.setCarColor("Yellow");
        car.setCarPrice(5000);
        System.out.println("Mau xe: "+car.getCarColor());
        System.out.println("Gia xe: "+car.getCarPrice());
    }
}
