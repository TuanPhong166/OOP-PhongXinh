package Shape;

public class HinhVuong {
    String fileAmThanh ;

    HinhVuong(){}

    HinhVuong(String _fileAmThanh){
        this.fileAmThanh = _fileAmThanh ;
    }

    void choiNhac(){
        System.out.println("Dang choi nhac hinh Vuong"+fileAmThanh);
    }

    void xoayHinh(){
        System.out.println("Da xoay hinh vuong");
    }
}
