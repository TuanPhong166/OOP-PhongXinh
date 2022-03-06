package buoi6;

public class Aboema  extends Hinh {
    private int xPoint ;
    private int yPoint ;    

    public void setX(int xPoint){
        this.xPoint = xPoint ;
    }

    public int getX(){
        return this.xPoint;
    }

    public void setY(int yPoint){
        this.yPoint = yPoint ;
    }

    public int getY(){
        return this.yPoint ;
    }

    @Override
    public void choiNhac(){
       System.out.println("Choi nhac  "+ this.getFile());
    }

    @Override
    public void xoayHinh(){
       System.out.println("Xoay theo diem "+this.xPoint +" va "+yPoint);
    }
}
