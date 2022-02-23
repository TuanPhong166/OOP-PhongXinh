package buoi6;

public class HinhChuNhat {
    private double width ;
    private double length ;


    public void setWidth(double width){
        this.width = width ;
    }

    public double getWidth(){
        return this.width ;
    }
    
    public void setLength(double length){
        this.length = length ;
    }

    public double getLength(){
        return this.length ;
    }

    public double acreage(){
        return this.length*this.width ;
    }

    public double perimeter(){
        return (this.length+this.width)*2 ;
    }


    public String toString(){

        String str = "Length: "+this.length ;
        str = str + " Width: "+this.width ;
        str = str + " Acreage: "+this.acreage() ;
        str = str + " Perimeter: "+this.perimeter();
        return str;
    }

     
}
