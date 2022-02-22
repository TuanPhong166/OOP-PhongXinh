package baitapvenha.Lab4;


import java.util.Scanner;
import java.text.DecimalFormat;


public class SanPham {

    
    DecimalFormat decimalFormat = new DecimalFormat("#.###");   

    Scanner input = new Scanner(System.in);

    private String name ; 
    private double price ;
    private double sale ;

    public SanPham(){}

    public SanPham (String _name , double _price , double _sale){
        this.name = _name ;
        this.price = _price ;
        this.sale = _sale ;
        
    }

    public SanPham (String _name , double _price ){
      this(_name , _price, 0) ;
    }

    private double getThueNhapKhau(){
        return this.getThueNhapKhau() ;
    }
    public void outPut(){
        System.out.println("Ten san pham: "+name);
        System.out.println("Don gia: "+price);
        System.out.println("Giam gia: "+sale);
        System.out.println("Thue nhap khau: "+ decimalFormat.format(price*0.10d));
    }
    public void input(){
        System.out.print("Nhap ten san pham: ");
        name = input.nextLine();
        System.out.print("Nhap gia san pham: ");
        price = input.nextDouble() ;
        System.out.print("NHap giam gia san pham: ");
        sale = input.nextDouble();
    }

    public void setName (String  name ){
        this.name = name ;
    }

    public String getName(){
        return this.name ;
    }

    public double getPrice (){
        return this.price;
    }
    public void setPrice (double price){
        if (price > 0) {
            this.price = price ;
        } else {
            System.out.println("Gia ca khong hop le");
        }
    }

    public void setSale (double sale){
        if (sale > 0 && sale < price) {
            this.sale = sale ;
        } else {
            System.out.println("Giam gia khong hop le");
        }
    }

    public double sale (){
        return this.sale ;
    }
}
