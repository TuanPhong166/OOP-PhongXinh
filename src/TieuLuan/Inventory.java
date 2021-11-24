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
		int chose  = input.nextInt();
        if(chose <= 3){
        
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
        }else 
             System.out.println("Bạn chọn sai r");

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

    public void delecte(Scanner input){
        System.out.println("Muốn xóa theo cách nào");
		System.out.print("1) Theo Id	2) Theo tên	3) Theo giá ----> Lựa chọn: ");
		
		int chose = input.nextInt();

        if (chose == 1) {
            System.out.print("Hãy nhập Id hàng cần xóa: ");
			int idCanXoa = input.nextInt();

            if (headElectric.id == idCanXoa) {
                headElectric = headElectric.next ;
                return ;
            }

            if (headCrockerySet.id == idCanXoa) {
                headCrockerySet = headCrockerySet.next ;
                return;
            }

            if (headFood.id == idCanXoa) {
                headFood = headFood.next ;
                return;
            }

            Electric curentElectric = headElectric ;
            CrockerySet currentCrockerySet = headCrockerySet ;
            Food currentFood = headFood ;

            while ( curentElectric.next != null){
                if (curentElectric.next.id == idCanXoa) {
                    curentElectric.next = curentElectric.next.next;
                    return;
                }
                curentElectric = curentElectric.next ;
            }

            while ( currentCrockerySet.next != null){
                if (currentCrockerySet.next.id == idCanXoa) {
                    currentCrockerySet.next = currentCrockerySet.next.next;
                    return;
                }
                currentCrockerySet = currentCrockerySet.next ;
            }

            while ( currentFood.next != null){
                if (currentFood.next.id == idCanXoa) {
                    currentFood.next = currentFood.next.next;
                    return;
                }
                currentFood = currentFood.next ;
            }
            System.out.println("Đã xóa thành công");
        }

        if (chose == 2 ) {
            System.out.print("Hãy nhập tên hàng cần xóa: ");
			input.nextLine();
			String tenCanXoa = input.nextLine();

            if (headElectric.name.equalsIgnoreCase(tenCanXoa)) {
                headElectric = headElectric.next;
                return;
            }

            if (headCrockerySet.name.equalsIgnoreCase(tenCanXoa)) {
                headCrockerySet = headCrockerySet.next;
                return;
            }

            if (headFood.name.equalsIgnoreCase(tenCanXoa)) {
                headFood = headFood.next;
                return;
            }

            Electric currentElectric = headElectric ;
            CrockerySet currentCrockerySet = headCrockerySet;
            Food currentFood = headFood ;

            while (currentElectric.next != null) {
                if (currentElectric.next.name.equalsIgnoreCase(tenCanXoa)) {
                    currentElectric.next =currentElectric.next.next ;
                    return ;
                }
                currentElectric = currentElectric.next ;
            }

            while (currentCrockerySet.next != null) {
                if (currentCrockerySet.next.name.equalsIgnoreCase(tenCanXoa)) {
                    currentCrockerySet.next =currentCrockerySet.next.next ;
                    return ;
                }
                currentCrockerySet = currentCrockerySet.next ;
            }

            while (currentFood.next != null) {
                if (currentFood.next.name.equalsIgnoreCase(tenCanXoa)) {
                    currentFood.next =currentFood.next.next ;
                    return ;
                }
                currentFood = currentFood.next ;
            }
            System.out.println("Đã xóa thành công.");
        }
           
        if (chose == 3) {
            
        }
    }

}
