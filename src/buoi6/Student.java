package buoi6;

public class Student {
    private int number ;
    private String name ;
    private float diemLT ;
    private float diemTH ;

    public Student(){}
    
    public Student(int number , String name , float diemLT , float diemTH){
        this.number = number ;
        this.name = name  ;
        this.diemLT = diemLT ;
        this.diemTH = diemTH ;
    }

    public void setNumber (int number ){
        this.number = number ;
    }

    public int getNumber (){
        return this.number ;
    }

    public void setName (String name ){
        this.name = name ;
    }
    public String getName(){
        return this.name ;
    }

    public void setDiemLT (float diemLT){
        this.diemLT = diemLT ;
    }

    public float getDiemLT (float diemLT){
        return this.diemLT ;
    }

    public void setDiemTH (float diemTH){
        this.diemTH = diemTH ;
    }
    
    public float getDiemTH(){
        return this.diemTH ;
    }

    public double diemTb(){
        return (this.diemLT+this.diemTH)/2 ;
    }
    public String toString(){
        String str = "MSSV: "+this.number+ ". Ho Ten: "+this.name ;
        str = str + ". Diem Ly Thuyet: " +this.diemLT +". Diem Thuc Hanh: "+ this.diemTH ;
        str = str + ". Diem Trung Binh: "+this.diemTb();
        return str ;
    }
}
