package buoi6;

public class Hinh {
    private String fileAmThanh ; // Tet.hif
    
    public Hinh(){}

    public Hinh(String _fileAmThanh){
        this.fileAmThanh = _fileAmThanh ;
    }

    public void setFile(String fileAmThanh){
        this.fileAmThanh =fileAmThanh;
    }

    public String getFile (){
        return this.fileAmThanh ;
    }



    void choiNhac(){
        System.out.println("Dang choi nhac ----"+this.fileAmThanh);
    }

    void xoayHinh(){
        System.out.println("Đã xoay 360--");
    }
}
