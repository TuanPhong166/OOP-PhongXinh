package oo;

import java.util.Scanner;

public class Student {
    // biến trạng thái
    // biến đối tượng : biến trở thành trạng thái của đối tượng

    String name ;
    String mssv ;
    String lop = "K14DCMT01" ;
    String khoa = "Cong nghe thong tin" ;
    String nganh = " Mang may tinh" ;
    double points ;
    
    Scanner input = new Scanner(System.in);

    public Student(){}

    public Student(String _name, String _mssv, double _points){
        this.name = _name ;
        this.mssv = _mssv ;
        this.points = _points ;
    }

    public Student (String _name, String _mssv, double _points, String lop , String khoa , String nganh){
       this(_name , _mssv , _points) ;
       this.lop = lop ;
       this.khoa = khoa ;
       this.nganh = nganh ;
    }


    // phuong thức object
    public void hoc(){
        System.out.println(name+" dang hoc----------");
    }

    public void thamGiaHoatDong(){
        System.out.println(name + " Khong tham gia hoat dong");
    }

    public void thi(){
        System.out.println(name + " Dang thi -----------");
    }
    public void nhap(){
        System.out.print("Enter the name: ");
        name = input.nextLine();
        System.out.print("Enter the student number: ");
        mssv = input.nextLine();
        
    }
    public void inThongTin(){

        System.out.println("Name: "+name);
        System.out.println("Mssv: "+mssv);
        System.out.println("Class: "+lop);
        System.out.println("Khoa: "+khoa);
        System.out.println("Nganh hoc: "+nganh);
        System.out.println("Diem: "+points);
        
    }


    
    
}
