package TieuLuan;

import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class CrockerySet {

    int id  ;
    String name  ;
    float price ;
    Date date ;
    int inventory ;
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy"); 

    CrockerySet next ;

    CrockerySet(){}

    CrockerySet(int _id , String _name , float _price ,int _inventory , Date _date){
        id = _id ;
        name = _name ;
        price = _price ;
        inventory = _inventory ;
        date = _date;
    }

    CrockerySet(int _id , String _name , float _price , int _inventory, String ngay){
        id = _id ;
        name = _name ;
        price = _price ;
        inventory=_inventory ;
        try {
            date = simpleDateFormat.parse(ngay);

        } catch (Exception e) {
        }
        Date a = date;
    }

    public void inThongTin(){
        System.out.println("---");
        System.out.println("Commodities: CrockerySet"+". Product's name : "+name+". ID : "+id+". Price : "+price+". Inventory: "+inventory+". Input Day : "+date);
    }

    public void nhapThongTin(Scanner input){
        input.nextLine();
        System.out.print("Nhập tên sản phẩm : ");
        name = input.nextLine();
        System.out.print("Nhập vào giá sản phẩm : ");
        price = input.nextFloat();
        System.out.print("Nhập vào số lượng tồn kho : ");
        inventory = input.nextInt();
        date = new Date();
        
    }

    public String GetName() {
		System.out.println(name);
		return name;
	}
    
 
}