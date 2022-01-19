package oo;

public class StudentTestDrive {

    public static void main(String[] args) {
        Student phong = new Student("Phong", "2005110008", 4.5) ;

        Student vy = new Student("Vy", "00138" , 10 );
    
        Student linh = new Student("Linh", "2823920" , 7) ;

        phong.thi();
        phong.hoc(); 
        phong.inThongTin();
        System.out.println();

        vy.thamGiaHoatDong();
        vy.inThongTin();
        System.out.println();

        linh.hoc();
        linh.inThongTin();
    
    }
    
}
