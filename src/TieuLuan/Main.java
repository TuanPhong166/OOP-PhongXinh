package TieuLuan;


import java.util.Date;
import java.util.Scanner;

public class Main {
    /* VÌ LÝ DO MÁY TÍNH HƯ ĐỘT NGỘT LỖI FONT TIẾNG VIỆT KHÔNG CÒN CÀI UTF8 ĐƯỢC 
     NÊN EM CHUYỂN SANG TIẾNG ANH ĐỂ HOÀN THÀNH BÀI TIỂU LUẬN
     MONG THẦY THÔNG CẢM. EM CẢM ƠN*/
    static Scanner input = new Scanner(System.in);
    public static Inventory inventory = new Inventory();
    
    public static void main(String[] args) {

        Date a = new Date();

        Electric headE = new Electric(1,"Fridge", 140000, a) ;
        CrockerySet headCS = new CrockerySet(2, "Plate", 25000, a);
        Food headF = new Food(3, "Apple", 45000, a) ;

        Electric electric1 = new Electric(4, "Televison", 5999999, a);
        headE.next = electric1;
        CrockerySet crockerySet1 = new CrockerySet(5, "Bowl", 22500, a) ;
        headCS.next = crockerySet1 ;
        Food food1 = new Food(6, "Crab", 350000, a);
        headF.next = food1 ;

        
        Electric electric2 = new Electric(7, "Laptop", 12999000, a);
        electric1.next = electric2;
        CrockerySet crockerySet2 = new CrockerySet(8, "Pots", 11, a) ;
        crockerySet1.next = crockerySet2 ;
        Food food2 = new Food(9, "Pizza", 129000, a);
        food1.next = food2 ;

        Electric electric3 = new Electric(10, "Earphone", 10, a);
        electric2.next = electric3;
        CrockerySet crockerySet3 = new CrockerySet(11, "Teapot", 11, a) ;
        crockerySet2.next = crockerySet3 ;
        Food food3 = new Food(12, "Loster", 2, a);
        food2.next = food3 ;

        Electric electric4 = new Electric(13 , "Pin", 10, a);
        electric3.next = electric4;
        CrockerySet crockerySet4 = new CrockerySet(14, "Glass", 11, a) ;
        crockerySet3.next = crockerySet4 ;
        Food food4 = new Food(15, "Fish", 2, a);
        food3.next = food4 ;

        Electric electric5 = new Electric(16 , "Telephone", 10, a);
        electric4.next = electric5;
        CrockerySet crockerySet5 = new CrockerySet(17, "Ceramics", 11, a) ;
        crockerySet4.next = crockerySet5 ;
        Food food5 = new Food(18, "Chicken", 2, a);
        food4.next = food5 ;

        Electric electric6 = new Electric(19 , "Fan", 3200000, a);
        electric5.next = electric6;
        CrockerySet crockerySet6 = new CrockerySet(20, "Porcelain table", 120000, a) ;
        crockerySet5.next = crockerySet6 ;
        Food food6 = new Food(21, "Tomato", 9000, a);
        food5.next = food6 ;

        inventory.headCrockerySet = headCS ;
        inventory.headElectric = headE ;
        inventory.headFood = headF ;
        clearScreen();
        int key ;
        do{
        System.out.println("--------------- MENU ---------------");
        System.out.println("|  1.>> Update Goods.              |");
        System.out.println("|  2.>> Search Goods.              |");
        System.out.println("|  3,>> Sắp xếp hàng hóa           |"); // chưa làm
        System.out.println("|  4.>> Statistical Goods.         |");
        System.out.println("|  0.>> Exit the program.          |");
        System.out.println("------------------------------------");
        System.err.print("- Enter the selection : ");
        key = input.nextInt();
        System.out.println();

        switch (key) {
            case 1:
                menuchinhsua();
                break;
            case 2:
                menuSreach();;
                break;
            case 3:
            case 4:
                menuThongKe();
                break ;
                
            case 0 :
                System.out.println("Exit the program.");
                System.out.println("Thank you for using the program!!");
                break ;
            default:
                System.out.println("Looks like you made the wrong choice.");
                System.out.println("Please choose again.");
                break;
        }
        }while( key != 0);
    }
    
    static void menuchinhsua(){
        int key ;
        do{
        System.out.println();
        System.out.println("------ ----- GOODS UPDATE  ----------- ");
        System.out.println("|   1.>> Add goods.                   |");
        System.out.println("|   2.>> Delete goods.                |");
        System.out.println("|   3.>> Fix goods.                   |"); // chưa làm
        System.out.println("|   4.>> Print product list.          |");
        System.out.println("|   0.>> Back to menu                 |");
        System.out.println("---------------------------------------");
        System.out.print("- Enter the selection : ");
        key = input.nextInt();

        switch (key) {
            case 1:
                System.out.println("1.>> Add goods.");
                inventory.add(input);
                break;
            case 2:
                System.out.println("2.>> Delete goods.");
                inventory.delecte(input);
                break ;
            case 3: 
                System.out.println("3.>> Fix goods."); // chưa làm
                inventory.delecte(input);
                break ;
            case 4:
                System.out.println("4.>> Print product list.");
                inventory.inThongTin();
                break ;
            case 0: 
                break;
            default:
                System.out.println("Looks like you made the wrong choice.");
                System.out.println("Please choose again.");
                break;
        }
        }while( key != 0);

    }
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    static void menuSreach(){
        int key ;
        do{
            System.out.println();
            System.out.println("-----------   SEARCH MENU  ----------- ");
            System.out.println("|   1.>> Theo loại hàng hóa.          |");
            System.out.println("|   2.>> Theo giá hàng hóa.           |");
            System.out.println("|   3.>> Theo ngày nhập               |");
            System.out.println("|   0.>> Quay về menu                 |");
            System.out.println("---------------------------------------");
            System.out.print("- Enter the selection : ");
            key = input.nextInt();
            System.out.println();

            switch (key) {
                case 1:
                    System.out.println("Search by type of goods.");
                    inventory.timHangTheoLoai(input);
                    break;
                case 2:
                    System.out.println("Search by price of goods.");
                    inventory.timHangTheoGia(input);
                    break;
                case 3:
                    System.out.println("Search for goods by date entered.");
                    inventory.timHangtheoNgay(input);
                case 0:
                    break ;
                default:
                    System.out.println("Looks like you made the wrong choice.");
                    System.out.println("Please choose again.");
                    break;
            }
        }while ( key != 0);
    }

    static void menuThongKe(){
        inventory.thongKe(input);
    }
   
   
}
