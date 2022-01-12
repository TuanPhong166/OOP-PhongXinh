package oo;

public class Account {

    // data
    int account_number = 12345;
    int account_balance = 0 ;

    //fuction 
    public void showData(){
        System.out.println("Account information: ");
        System.out.println("Account number: "+account_number);
        System.out.println("ACcount balance: "+account_balance);
    }

    public void withdrawl (int withdrawl){
        account_balance -= withdrawl ;
    }
    
    public void deposits(int deposits){
        account_balance += deposits ;
    }
}
