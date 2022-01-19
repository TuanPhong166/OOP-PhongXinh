package oo;

public class StudentTest {

    public static void main(String[] args) {
        Student student = new Student();  
        Student student1 = new Student();
        Student student2 =  new  Student();
        

        System.out.print("\033[H\033[2J");
        System.out.flush();
        student.nhap();
        student1.nhap();
        student2.nhap();
        student.thamGiaHoatDong(); 
        student.thi();
        student.inThongTin();
          System.out.println();
        student1.hoc();
        student1.thi();
        student1.inThongTin();
        System.out.println();
        student2.thi();
        student2.thamGiaHoatDong();
        student2.hoc();
        student2.inThongTin();
        
        
        
       

    }
    
}
