package TieuLuan;

import java.util.Date;
import java.util.Scanner;

public class CrockerySet {

    int id  ;
    String name  ;
    float price ;
    Date date ;

    CrockerySet next ;

    CrockerySet(){}

    CrockerySet(int _id , String _name , float _price , Date _date){
        id = _id ;
        name = _name ;
        price = _price ;
        date = _date;
    }

    public void inThongTin(){
        System.out.println("Commodities : CrockerySet"+". Product's name : "+name+". ID : "+id+". Price : "+price+". Input Day : "+date);
    }

    public void nhapThongTin(Scanner input){
        input.nextLine();
        System.out.println("Nhập tên sản phẩm : ");
        name = input.nextLine();
        System.out.println("Nhập vào giá sản phẩm : ");
        price = input.nextFloat();
        date = new Date();
        
    }

    public String GetName() {
		System.out.println(name);
		return name;
	}

    
}