package oo;

public class AccountTestDrive {
    public static void main(String[] args) {
        Account account = new Account();
        System.out.print("\033[H\033[2J");
        System.out.flush();

        account.showData();
        account.deposits(500);
        account.showData();

        account.withdrawl(400);
        account.showData();
       
    }
}
