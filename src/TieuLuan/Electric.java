package TieuLuan;

import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class Electric {

    int id  ;
    String name  ;
    float price ; // giá
    Date date ; // ngày nhập kho
    int inventory;

    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy"); 

    Electric next ;
    

    Electric(){}

    Electric(int _id , String _name , float _price , int _inventory ,Date _date){
        id = _id ;
        name = _name ;
        price = _price ;
        inventory = _inventory ;
        date = _date;
    }
    Electric(int _id , String _name , float _price , int _inventory, String ngay){
        id = _id ;
        name = _name ;
        price = _price ;
        inventory =_inventory ;
        try {
            date = simpleDateFormat.parse(ngay);

        } catch (Exception e) {
        }
        Date a = date;
    }
    public void inThongTin(){
        System.out.println("---");
        System.out.println("Commodities : Electric"+". Product's name : "+name+". ID : "+id+". Price : "+price+". Inventory: "+inventory+". Input Day : "+date);
    }

    public void add(Scanner input){
        input.nextLine();
        System.out.print("Enter product name : ");
        name = input.nextLine();
        System.out.print("Enter product price : ");
        price = input.nextFloat();
        System.out.print("Enter inventory quantity : ");
        inventory = input.nextInt();
        date = new Date();
        
    }

    
}
