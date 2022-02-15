package Buoi4;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Products {
    private String name ;
    private double price ;
    private double sale ;

    DecimalFormat decimalFormat = new DecimalFormat("#.###");   

    Scanner input = new Scanner(System.in);

    private void getThueTHuNhap(double price){
       this.price = price*0.10d ;
    }

    public Products (){}

    public Products (String _name , double _price){
        this.name = _name ;
        this.price = _price ;
        
    }

    public Products (String _name , double _price , double _sale ){
      this(_name , _price) ;
      sale = _sale ;
    }
    public void outPut(){
        System.out.println("Ten san pham: "+name);
        System.out.println("Don gia: "+price);
        System.out.println("Giam gia: "+sale);
        System.out.println("Thue nhap khau: "+ decimalFormat.format(price*0.10d));
    }

    public void input(){
        System.out.println("Nhap ten san pham: ");
        name = input.nextLine();
        System.out.println("Nhap gia san pham: ");
        price = input.nextDouble() ;
        System.out.println("NHap giam gia san pham: ");
        sale = input.nextDouble();
    }
    public String getName(){
        return this.name ;
    }

    public void setName(String name){
        this.name = name ;
    }

    public double getPrice(){
        return this.price ;
    }

    public void setPrice(double price){
      this.price = price ;
    }

    public double getSale(){
        return this.sale ;
    }

    public void setSale(double sale){
        this.sale = sale ;
    }

}
