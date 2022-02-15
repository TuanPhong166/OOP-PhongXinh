package Shape;

public class ShapeTest {
    public static void main(String[] args) {
        HinhTamGiac hinhTamGiac = new HinhTamGiac() ;
        HinhTron hinhTron = new HinhTron() ;
        HinhVuong hinhVuong = new HinhVuong() ;

        hinhTamGiac.xoayHinh();
        hinhTamGiac.choiNhac();
        System.out.println();
        hinhTron.xoayHinh();
        hinhTron.choiNhac();
        System.out.println();
        hinhVuong.xoayHinh();
        hinhVuong.choiNhac();
    }
}
