package baitapvenha.Shape;

public class Amoeba {
    
    private String fileAmThanh ; // Tet.hif
    private int xPoint ;
    private int yPoint ;

    
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
        System.out.println("Dang choi nhac ----"+this.fileAmThanh);
    }

    void xoayHinh(){
        System.out.println("Xoay theo " +this.xPoint+ " va"+this. yPoint );
    }

}
