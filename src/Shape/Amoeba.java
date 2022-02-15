package Shape;

public class Amoeba {

        String fileAmThanh ; // Tet.hif
    
        Amoeba(){}
    
        Amoeba(String _fileAmThanh){
            this.fileAmThanh = _fileAmThanh ;
        }
    
        void choiNhac(){
            System.out.println("Dang choi nhac ----"+fileAmThanh);
        }
    
        void xoayHinh(){
            System.out.println("Đã xoay theo điểm bạn chọn");
        }
    
    
}
