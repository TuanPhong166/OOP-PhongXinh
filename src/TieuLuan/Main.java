package TieuLuan;

import java.util.Date;
import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);
    public static Inventory inventory = new Inventory();

    public static void main(String[] args) {
        Date a = new Date();

        Electric headE = new Electric(1,"Tủ lạnh", 2, a) ;
        CrockerySet headCS = new CrockerySet(2, "Đĩa ", 5, a);
        Food headF = new Food(3, "Táo", 4, a) ;

        Electric electric1 = new Electric(4, "Tivi", 10, a);
        headE.next = electric1;
        CrockerySet crockerySet1 = new CrockerySet(5, "Chén", 11, a) ;
        headCS.next = crockerySet1 ;
        Food food1 = new Food(6, "Cua", 2, a);
        headF.next = food1 ;

        
        Electric electric2 = new Electric(4, "Tivi", 10, a);
        electric1.next = electric2;
        CrockerySet crockerySet2 = new CrockerySet(5, "Chén", 11, a) ;
        crockerySet1.next = crockerySet2 ;
        Food food2 = new Food(6, "Cua", 2, a);
        food1.next = food2 ;

        Electric electric3 = new Electric(4, "Tivi", 10, a);
        electric2.next = electric3;
        CrockerySet crockerySet3 = new CrockerySet(5, "Chén", 11, a) ;
        crockerySet2.next = crockerySet3 ;
        Food food3 = new Food(6, "Cua", 2, a);
        food2.next = food3 ;

        Electric electric4 = new Electric(4, "Tivi", 10, a);
        electric3.next = electric4;
        CrockerySet crockerySet4 = new CrockerySet(5, "Chén", 11, a) ;
        crockerySet3.next = crockerySet4 ;
        Food food4 = new Food(6, "Cua", 2, a);
        food3.next = food4 ;





        inventory.headCrockerySet = headCS ;
        inventory.headElectric = headE ;
        inventory.headFood = headF ;
        clearScreen();
        int key ;
        do{
        System.out.println("--------------- MENU ---------------");
        System.out.println("|  1.>> Chỉnh sửa hàng hóa.        |");
        System.out.println("|  2.>> Tìm kiếm hàng hóa.         |");
        System.out.println("|  3,>> Sắp xếp hàng hóa           |");
        System.out.println("|  3.>> Thống kê hàng hóa.         |");
        System.out.println("|  0.>> Thoát khỏi chương trình.   |");
        System.out.println("------------------------------------");
        System.out.print("- Nhập và sự lựa chọn : ");
        key = input.nextInt();

        switch (key) {
            case 1:
                menuchinhsua();
                break;
            case 0 :
                System.out.println("Thoát khỏi chương trình.");
                System.out.println("Cảm ơn vì đã sử dụng chương trình!!");
                break ;
            default:
                System.out.println("Có vẻ bạn chọn không đúng. Vui lòng chọn lại!!");
                break;
        }
        }while( key != 0);
    }
    
    static void menuchinhsua(){
        int key ;
        do{
        System.out.println();
        System.out.println("----------- MENU CHỈNH SỬA ----------- ");
        System.out.println("|   1.>> Thêm hàng hóa.               |");
        System.out.println("|   2.>> Xóa hàng hóa.                |");
        System.out.println("|   3.>> Sửa hàng hóa.                |");
        System.out.println("|   4.>> In danh sách.                |");
        System.out.println("|   5.>> Quay về menu                 |");
        System.out.println("---------------------------------------");
        System.out.print("- Nhập và sự lựa chọn : ");
        key = input.nextInt();

        switch (key) {
            case 1:
                System.out.println("1.>> Thêm hàng hóa.");
                inventory.add(input);
                break;
            case 4:
                System.out.println("4.>> In danh sách hàng hóa");
                outPut(inventory);
                break ;
            default:
                System.out.println("Có vẻ bạn chọn không đúng. Vui lòng chọn lại!!");
                break;
        }
        }while( key != 5);

    }
    public static void clearScreen() { // HÀM XÓA MÀN HÌNH
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
   
    public static void outPut(Inventory inventory){
        inventory.inThongTin();
    }
}
