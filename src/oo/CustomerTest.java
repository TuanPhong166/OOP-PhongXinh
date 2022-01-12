package oo;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();
        System.out.print("\033[H\033[2J");
        System.out.flush();


        customer.Data();

        customer.showdata();
    }
    
}
