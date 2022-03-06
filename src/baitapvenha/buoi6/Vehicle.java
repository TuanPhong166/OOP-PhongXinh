package baitapvenha.buoi6;

import java.util.Scanner;

public class Vehicle {

    Scanner input = new Scanner(System.in);
    
    private int dungTich;
    private double triGia;
    private String chuXe,moTa , loaiXe;
 
    public Vehicle(String loaiXe, int dungTich, double triGia, String chuXe, String moTa) {
        this.loaiXe = loaiXe;
        this.dungTich = dungTich;
        this.triGia = triGia;
        this.chuXe = chuXe;
        this.moTa = moTa;
    }
    public Vehicle(){
 
    }
    public String getLoaiXe() {
        return loaiXe;
    }
 
    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }
 
    public int getDungTich() {
        return dungTich;
    }
 
    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }
 
    public double getTriGia() {
        return triGia;
    }
 
    public void setTriGia(double triGia) {
        this.triGia = triGia;
    }
 
    public String getChuXe() {
        return chuXe;
    }
 
    public void setChuXe(String chuXe) {
        this.chuXe = chuXe;
    }
 
    public String getMoTa() {
        return moTa;
    }
 
    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
 
    public double tinhThue(){
        double thue;
        if(dungTich<100) thue=triGia*0.01;
        else if (dungTich >= 100 && dungTich<=200) thue = triGia * 0.03;
        else thue = triGia * 0.05;
        return thue;
    }
 
    @Override
    public String toString() {
        return loaiXe + "-"+chuXe + "-"+dungTich + "-"+triGia + "-"+moTa;
}
    void inThue(){
        System.out.printf("%10s %20s %4d %10.2f %10s %8.5f ",loaiXe,chuXe,dungTich,triGia,moTa,tinhThue());
    }

    void nhapXe(Vehicle xe){
        System.out.print("Nhap loai xe: ");
        xe.setLoaiXe(input.nextLine());
        System.out.print("Nhap ten chu xe: ");
        xe.setChuXe(input.nextLine());
        System.out.print("Nhap dung tich xe: ");
        xe.setDungTich(input.nextInt());
        System.out.print("Nhap tri gia xe: ");
        xe.setTriGia(input.nextDouble());
        input.nextLine();
        System.out.print("Mo ta: ");
        xe.setMoTa(input.nextLine());
    }

}
