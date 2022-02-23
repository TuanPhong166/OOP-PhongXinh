package buoi6;

public class StudentTest {
    public static void main(String[] args) {
        Student sv1 = new Student(1, "Nguyen Tri Tuan Phong", 7, 8) ;
        Student sv2 = new Student(2, "Mac Thi Thanh Huong", 9, 7) ;
        Student sv3 = new Student() ;
        sv3.setNumber(3);
        sv3.setName("Hac Bach Cong Tu");
        sv3.setDiemLT(4);
        sv3.setDiemTH(2);

        System.out.println(sv1.toString());
        System.out.println(sv2.toString());
        System.out.println(sv3.toString());
    }
}
