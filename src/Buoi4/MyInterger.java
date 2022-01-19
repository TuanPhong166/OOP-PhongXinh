package Buoi4;

public class MyInterger {
    private int value ;
    public boolean greatThan (MyInterger other){
        return (this.value > other.value);
    }

    public boolean lessThan(MyInterger other){
        return (other.greatThan(this)) ;
    }

    public MyInterger increment(){
        value++
    }
}
