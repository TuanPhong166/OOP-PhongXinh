package baitapvenha.Shape;

public class Amoeba {
    
    private String fileAmThanh ; // Tet.hif
    
    public Amoeba(){}

    public Amoeba(String _fileAmThanh){
        this.fileAmThanh = _fileAmThanh ;
    }

    public void setFile(String fileAmThanh){
        this.fileAmThanh =fileAmThanh;
    }

    public String getFile (){
        return this.fileAmThanh ;
    }



    void choiNhac(){
        System.out.println("Dang choi nhac ----"+fileAmThanh);
    }

    void xoayHinh(){
        System.out.println("Đã xoay theo điểm bạn chọn");
    }

}
