package TieuLuan;

import java.util.Scanner;

public class Inventory {

    CrockerySet headCrockerySet ;
    Food headFood;
    Electric headElectric;

    Inventory(){}

    Inventory(Electric _headElectric ,CrockerySet _headCrockerySet, Food _headFood){
        headElectric = _headElectric ;
        headCrockerySet = _headCrockerySet ;
        headFood = _headFood ;
    }
    
    public void add(Scanner input){
        System.out.println("Bạn muốn thêm loại hàng nào?");
		System.out.print("1) Điện máy	2) Sành Sứ	3) Thực Phẩm ----> Lựa chọn: ");
		// loaiHang = chose 
		int chose  = input.nextInt();

        
        if(chose == 1){
            Electric current = headElectric ;
            while(current != null){
                if (current.next == null){
                    Electric inventoryNew = new Electric() ;
                    inventoryNew.id = NhapId(input, chose);
                    inventoryNew.nhapThongTin(input);
                    current.next = inventoryNew ;
                    break ;
                }
                current = current.next;
            }
        }
        
        if(chose == 2){
            CrockerySet current = headCrockerySet ;
            while(current != null){
                if(current.next == null){
                    CrockerySet inventoryNew = new CrockerySet() ;
                    inventoryNew.id = NhapId(input, chose);
                    inventoryNew.nhapThongTin(input);
                    current.next = inventoryNew ;
                    break ;
                }
                current = current.next;
            }
        }

        if(chose == 3){
            Food current = headFood ;
            while(current != null){
                if(current.next == null){
                    Food inventoryNew = new Food() ;
                    inventoryNew.id = NhapId(input, chose);
                    inventoryNew.nhapThongTin(input);
                    current.next = inventoryNew ;
                    break ;
                }
                current = current.next;
            }
        }

    }

    public int NhapId(Scanner input , int chose){
        System.out.print("Hãy nhập ID hàng: ");
		int id = input.nextInt();

        if(chose == 1){
            Electric current = headElectric ;
            while(current != null){
               if(current.id == id){
                System.out.println("Id này đã tồn tại");
                return NhapId(input, chose);
               }
               current = current.next;
           }
        }
        if(chose == 2){
            CrockerySet current = headCrockerySet ;
            while(current != null){
               if(current.id == id){
                System.out.println("Id này đã tồn tại");
                return NhapId(input, chose);
               }
               current = current.next;
           }
        }
        if(chose == 3){
            Food current = headFood ;
            while(current != null){
               if(current.id == id){
                System.out.println("Id này đã tồn tại");
                return NhapId(input, chose);
               }
               current = current.next;
           }
        }
        return id ;
    }

    public void inThongTin(){
        CrockerySet currentCrockerySet = headCrockerySet;
        Food currentFood = headFood ;
        Electric currentElectric = headElectric ;

        while(currentElectric != null){
            currentElectric.inThongTin();
            currentElectric=currentElectric.next;
        }

        System.out.println();

        while(currentCrockerySet != null ){
            currentCrockerySet.inThongTin();
            currentCrockerySet =currentCrockerySet.next;
        }

        System.out.println();

        while(currentFood != null){
            currentFood.inThongTin();
            currentFood = currentFood.next ;
        }

    }

}
