package nonstructure;

import java.util.Scanner;

public class BankNonStructure {

     static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // date
        int account_number = 12345;
        int account_balance = 0 ;

        // operation: thao tác lên dữ liệu
        //deposit
        //số tiền gửi nhập từ bàn phím.
        
        System.out.print("Enter the deposits: ");
        int deposits = input.nextInt();
        account_balance += deposits;
        // show data 
        System.out.println("Account information: ");
        System.out.println("Account number: "+account_number);
        System.out.println("ACcount balance: "+account_balance);
        // with drawl: rut tiền 
        int withdrawl = 0 ;
        System.out.print("Enter the with drawl: ");
        withdrawl = input.nextInt();
        account_balance -= withdrawl ;
        // show data
        System.out.println("Account information: ");
        System.out.println("Account number: "+account_number);
        System.out.println("ACcount balance: "+account_balance);
    }
    
}
