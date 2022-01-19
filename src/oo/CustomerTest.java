package oo;

public class CustomerTest {
    public static void main(String[] args) {
        // biến tham chiếu đối tượng tên customer kiểu là class Customer
        Customer customer ;
        
        customer = new Customer(); // đối tượng customer sinh ra trong vùng nhớ Heap kiểu Custommer

        System.out.print("\033[H\033[2J");
        System.out.flush();


        customer.Data();

        customer.showdata();
    }
    
}
