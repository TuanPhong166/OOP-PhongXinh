package oo;

import java.util.Scanner;

public class Customer {
    
    Scanner input = new Scanner(System.in);
    // data
    String cusName ;
    String address ;
     

    // fuction 
    public void Data(){
        System.out.println("- Enter the number employee: ");
              System.out.println(" Enter the name: ");
              cusName = input.nextLine();
              System.out.println("Enter the address: ");
              address = input.nextLine();
    }
    
    public void showdata(){
        System.out.println("Employee information: ");
        System.out.println("Name: "+cusName);
        System.out.println("Address: "+address);
    }
}
