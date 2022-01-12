package stuctured;

import java.util.Scanner;

public class BankStructured {

    static Scanner input = new Scanner(System.in) ;
    // bien toàn cục: global
    static int account_number = 12345;
    static int account_balance = 0 ;
    // nhân viên 
    static String emName ;
    static double salary ;
    // khách hàng
    static String cusName ;
    static String address ;


    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        showData();
        deposits();
        showData();
        withdrawl();
        showData();
        withdrawl();
        showData();
    }
    static void showData(){
        System.out.println("Account information: ");
        System.out.println("Account number: "+account_number);
        System.out.println("ACcount balance: "+account_balance);
    }
    static void deposits (){
        System.out.print("Enter the deposits: ");
        int deposits = input.nextInt();
        account_balance += deposits;
    }
    static void withdrawl (){
        int withdrawl = 0 ;
        System.out.print("Enter the with drawl: ");
        withdrawl = input.nextInt();
        account_balance -= withdrawl ;
    }
    static void showEmployee (){

    }
    static void showCustomer(){
        
    }
}
