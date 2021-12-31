package TieuLuan;


import java.util.Scanner;

public class MainManage {
    static Scanner input = new Scanner(System.in);
    public static Inventory inventory = new Inventory();
        public static void main(String[] args) {

        
        Electric headE = new Electric(1,"Fridge", 5300, 9, "12/01/2019") ; 
        CrockerySet headCS = new CrockerySet(2, "Plate", 250, 15, "01/02/2020"); 
        Food headF = new Food(3, "Apple", 45,500, "02/09/2021") ; 

        Electric electric1 = new Electric(4, "Televison", 5999,120,"13/07/2020"); 
        headE.next = electric1;
        CrockerySet crockerySet1 = new CrockerySet(5, "Bowl", 220, 23, "02/03/2019") ;
        headCS.next = crockerySet1 ;
        Food food1 = new Food(6, "Crab", 3500,30, "14/07/2020");
        headF.next = food1 ;

        
        Electric electric2 = new Electric(7, "Laptop", 1290, 6 , "15/07/2019");
        electric1.next = electric2;
        CrockerySet crockerySet2 = new CrockerySet(8, "Pots", 180 ,58, "03/04/2021") ;
        crockerySet1.next = crockerySet2 ;
        Food food2 = new Food(9, "Pizza", 80, 123 , "16/07/2020");
        food1.next = food2 ;

        Electric electric3 = new Electric(10, "Earphone", 100, 13, "16/07/2021");
        electric2.next = electric3;
        CrockerySet crockerySet3 = new CrockerySet(11, "Teapot", 780 , 31 , "10/11/2021") ;
        crockerySet2.next = crockerySet3 ;
        Food food3 = new Food(12, "Loster", 237 , 32, "29/12/2021");
        food2.next = food3 ;

        Electric electric4 = new Electric(13 , "Pin", 10, 80, "14/06/2020");
        electric3.next = electric4;
        CrockerySet crockerySet4 = new CrockerySet(14, "Glass", 340, 10 , "22/08/2020") ;
        crockerySet3.next = crockerySet4 ;
        Food food4 = new Food(15, "Fish", 50, 13 ,"30/12/2021");
        food3.next = food4 ;

        Electric electric5 = new Electric(16 , "Telephone", 1500 , 4 , "20/11/2021");
        electric4.next = electric5;
        CrockerySet crockerySet5 = new CrockerySet(17, "Ceramics", 130,90, "16/06/2020") ;
        crockerySet4.next = crockerySet5 ;
        Food food5 = new Food(18, "Chicken", 76 , 50 , "20/12/2021");
        food4.next = food5 ;

        Electric electric6 = new Electric(19 , "Fan", 390, 45, "21/11/2019");
        electric5.next = electric6;
        CrockerySet crockerySet6 = new CrockerySet(20, "Porcelain table", 450,12, "17/06/2019") ;
        crockerySet5.next = crockerySet6 ;
        Food food6 = new Food(21, "Tomato", 9, 34, "29/12/2021");
        food5.next = food6 ;

        inventory.headCrockerySet = headCS ;
        inventory.headElectric = headE ;
        inventory.headFood = headF ;
        clearScreen();
        int key ;
        do{
        System.out.println();
        System.out.println("--------------- MENU ---------------");
        System.out.println("|  1.>> Update Goods.              |");
        System.out.println("|  2.>> Search Goods.              |");
        System.out.println("|  3,>> Arrange goods              |"); 
        System.out.println("|  4.>> Statistical Goods.         |");
        System.out.println("|  5.>> Print product list.        |");
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
                menuSort();
                break;
            case 4:
                menuThongKe();
                break ;
            case 5:
                inventory.inThongTin();
                break; 
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
        System.out.println("|   3.>> Fix goods.                   |"); 
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
                System.out.println("3.>> Fix goods.");
                System.out.println("----------------------");
                System.out.println("|  1.>> Fix by id    |");
                System.out.println("|  2.>> Fix by price |");
                System.out.println("|  0.>> Back to menu |");
                System.out.println("---------------------");
                key = input.nextInt();
                switch (key) {
                    case 1:
                        System.out.println("1.>> Fix by Id.");
                        inventory.fixById(input);
                        break;
                    case 2:
                        System.out.println("2.>> Fix by price.");
                        inventory.fixByPrice(input);
                        break ;
                    case 0:
                        break ;
                    default:
                       System.out.println("Looks like you made the wrong choice.");
                       System.out.println("Please choose again.");
                        break;
                }
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
            System.out.println("--------------   SEARCH MENU  -------------- ");
            System.out.println("|     1.>> Search by type of goods.         |");
            System.out.println("|     2.>> Search by price of goods.        |");
            System.out.println("|     3.>> Search for goods by date entered. |");
            System.out.println("|     0.>> Back to menu                     |");
            System.out.println("---------------------------------------------");
            System.out.print("- Enter the selection : ");
            key = input.nextInt();
            System.out.println();

            switch (key) {
                case 1:
                    System.out.println("1.>>Search by type of goods.");
                    inventory.searchByType(input);
                    break;
                case 2:
                    System.out.println("2.>>Search by price of goods.");
                    inventory.searchByPrice(input);
                    break;
                case 3:
                    System.out.println("3.>>Search for goods by date entered.");
                    inventory.searchByDate(input);
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
        System.out.println("4.>> Statistical Goods. ");
        inventory.thongKe(input);
    }
   
    
   
}
