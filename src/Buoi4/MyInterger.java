package Buoi4;

public class MyInterger {
    private int value ;
    
    public MyInterger(int initialValue){
        value = initialValue ;
    }

    public MyInterger(){
        this(0) ;
    }

    public MyInterger(MyInterger other){
        this(other.value);
    }
    
    public boolean greatThan (MyInterger other){
        return (this.value > other.value);
    }

    public boolean lessThan(MyInterger other){
        return (other.greatThan(this)) ;
    }

    public MyInterger increment(){
        value++;
        return this ;
    }
}
