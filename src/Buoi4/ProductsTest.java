package Buoi4 ;

import java.util.ArrayList;

public class ProductsTest {

    static ArrayList<Products> list = new ArrayList<>(3);
    public static void main(String[] args) {
        
        Products products = new Products();
        Products products2 = new Products();
        Products products3 = new Products("Tao", 5000, 3000) ;
        list.add(new Products("Ga", 3000, 200));
        list.add(new Products("Ca", 990, 90));
        list.add(new Products("Muc ", 15000, 0)) ;
   
        
        products.input();
        products2.input();

        products.outPut();
        System.out.println();
        products2.outPut();
        System.out.println();
        products3.outPut();
        inThongTin();
    }

    static void inThongTin(){
        for (Products products : list) {
            products.outPut();
            System.out.println();
        }
    }
}
