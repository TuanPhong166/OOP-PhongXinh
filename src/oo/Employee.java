package oo;

import java.util.Scanner;

public class Employee {

     // data
     String emName ;
     double salary ;
 
     static Scanner input = new Scanner(System.in);
 
     //fuction
     public void data (){
         System.out.println("- Enter the number employee: ");
              System.out.println(" Enter the name: ");
              emName = input.nextLine();
              System.out.println("Enter the salary in a day: ");
              salary = input.nextDouble();
              salary = salary*30 ;
     }
 
     public void showData(){
         System.out.println("Employee information: ");
         System.out.println("Name: "+emName);
         System.out.println("Salary: "+salary);
     }
    
}
