package Buoi4;

public class MyIntegerTest {
    public static void main(String[] args) {
        MyInterger counter = new MyInterger(3);
        counter.increment().increment() ;
        System.out.println(counter.value);
    }
}
