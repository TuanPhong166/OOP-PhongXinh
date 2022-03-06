package buoi6;


public class HinhTest {
    public static void main(String[] args) {
        HinhTamGiac htg =  new HinhTamGiac() ;
        HinhTron ht = new HinhTron() ;
        HinhVuong hv = new HinhVuong() ;
        htg.setFile("AAAAA");
        ht.setFile("BBBB");
        hv.setFile("ZZZZ");

        htg.choiNhac();
        htg.xoayHinh(); 
        System.out.println( );
        hv.choiNhac();
        hv.xoayHinh();
        System.out.println();
        ht.choiNhac();
        hv.xoayHinh();
        Aboema aboema = new Aboema() ;
        aboema.setFile("AM.HIF");
        aboema.setX(2);
        aboema.setY(3);
        aboema.choiNhac();
        aboema.xoayHinh();
    }
    
}
