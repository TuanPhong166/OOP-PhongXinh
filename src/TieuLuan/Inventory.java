package TieuLuan;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class Inventory {

    CrockerySet headCrockerySet ;
    Food headFood;
    Electric headElectric;

    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

    Inventory(){}

    Inventory(Electric _headElectric ,CrockerySet _headCrockerySet, Food _headFood){
        headElectric = _headElectric ;
        headCrockerySet = _headCrockerySet ;
        headFood = _headFood ;
    }
    
    public void add(Scanner input){
        System.out.println("What kind of goods would you like to add?");
		System.out.print("1) Electric	2) Crockery	3) Food ");
        System.out.print("- Enter the selection : ");
		int chose  = input.nextInt();
        if(chose <= 3){
        
        if(chose == 1){
            Electric currentElectriclectric = headElectric ;
            while(currentElectriclectric != null){
                if (currentElectriclectric.next == null){
                    Electric inventoryNew = new Electric() ;
                    inventoryNew.id = NhapId(input, chose);
                    inventoryNew.nhapThongTin(input);
                    currentElectriclectric.next = inventoryNew ;
                    break ;
                }
                currentElectriclectric = currentElectriclectric.next;
            }
        }
        
        if(chose == 2){
            CrockerySet currentCrockerySet = headCrockerySet ;
            while(currentCrockerySet != null){
                if(currentCrockerySet.next == null){
                    CrockerySet inventoryNew = new CrockerySet() ;
                    inventoryNew.id = NhapId(input, chose);
                    inventoryNew.nhapThongTin(input);
                    currentCrockerySet.next = inventoryNew ;
                    break ;
                }
                currentCrockerySet = currentCrockerySet.next;
            }
        }

        if(chose == 3){
            Food currentFood = headFood ;
            while(currentFood != null){
                if(currentFood.next == null){
                    Food inventoryNew = new Food() ;
                    inventoryNew.id = NhapId(input, chose);
                    inventoryNew.nhapThongTin(input);
                    currentFood.next = inventoryNew ;
                    break ;
                }
                currentFood = currentFood.next;
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
        Electric currentElectriclectric = headElectric ;

        while(currentElectriclectric != null){
            currentElectriclectric.inThongTin();
            currentElectriclectric=currentElectriclectric.next;
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
                    System.out.println("Successful delete.");
                    return;
                }
                curentElectric = curentElectric.next ;
            }

            while ( currentCrockerySet.next != null){
                if (currentCrockerySet.next.id == idCanXoa) {
                    currentCrockerySet.next = currentCrockerySet.next.next;
                    System.out.println("Successful delete.");
                    return;
                }
                currentCrockerySet = currentCrockerySet.next ;
            }

            while ( currentFood.next != null){
                if (currentFood.next.id == idCanXoa) {
                    currentFood.next = currentFood.next.next;
                    System.out.println("Successful delete.");
                    return;
                }
                currentFood = currentFood.next ;
            }
            System.out.println("--- No find id.");
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

            Electric currentElectriclectric = headElectric ;
            CrockerySet currentCrockerySet = headCrockerySet;
            Food currentFood = headFood ;

            while (currentElectriclectric.next != null) {
                if (currentElectriclectric.next.name.equalsIgnoreCase(tenCanXoa)) {
                    currentElectriclectric.next =currentElectriclectric.next.next ;
                    System.out.println("Successful delete.");
                    return ;
                }
                currentElectriclectric = currentElectriclectric.next ;
            }

            while (currentCrockerySet.next != null) {
                if (currentCrockerySet.next.name.equalsIgnoreCase(tenCanXoa)) {
                    currentCrockerySet.next =currentCrockerySet.next.next ;
                    System.out.println("Successful delete.");
                    return ; 
                }
                currentCrockerySet = currentCrockerySet.next ;
            }

            while (currentFood.next != null) {
                if (currentFood.next.name.equalsIgnoreCase(tenCanXoa)) {
                    currentFood.next =currentFood.next.next ;
                    System.out.println("Successful delete.");
                    return ;
                }
                currentFood = currentFood.next ;
            }
            System.out.println("--- No find name.");
        }
           
        if (chose == 3) {
            System.out.print("Hãy nhập gia hàng cần xóa: ");
			int giaCanXoa = input.nextInt();

            if (headElectric.price == giaCanXoa) {
                headElectric = headElectric.next ;
                return ;
            }

            if (headCrockerySet.price == giaCanXoa) {
                headCrockerySet = headCrockerySet.next ;
                return;
            }

            if (headFood.price == giaCanXoa) {
                headFood = headFood.next ;
                return;
            }

            Electric curentElectric = headElectric ;
            CrockerySet currentCrockerySet = headCrockerySet ;
            Food currentFood = headFood ;

            while ( curentElectric.next != null){
                if (curentElectric.next.price == giaCanXoa) {
                    curentElectric.next = curentElectric.next.next;
                    System.out.println("Successful delete.");
                    return;
                }
                curentElectric = curentElectric.next ;
            }

            while ( currentCrockerySet.next != null){
                if (currentCrockerySet.next.price == giaCanXoa) {
                    currentCrockerySet.next = currentCrockerySet.next.next;
                    System.out.println("Successful delete.");
                    return;
                }
                currentCrockerySet = currentCrockerySet.next ;
            }

            while ( currentFood.next != null){
                if (currentFood.next.price == giaCanXoa) {
                    currentFood.next = currentFood.next.next;
                    System.out.println("Successful delete.");
                    return;
                }
                currentFood = currentFood.next ;
            }
            System.out.println("--- No find price.");
        }
    }
    
    public void timHangTheoLoai(Scanner input){
        System.out.println("\nHãy nhập Loại hàng bạn muốn tìm");
        System.out.print("1) Điện máy	2) Sành sứ	3) Thực phẩm ----> Lựa chọn: ");
        int loaiHang = input.nextInt();

        if (loaiHang == 1) {
            Electric cur = headElectric;
            while (cur != null) {
                cur.inThongTin();
                cur = cur.next;
            }
        }else if (loaiHang == 2) {
            CrockerySet cur = headCrockerySet;
            while (cur != null) {
                cur.inThongTin();
                cur = cur.next;
            }
        }else if (loaiHang == 3) {
            Food cur = headFood;
            while (cur != null) {
                cur.inThongTin();
                cur = cur.next;
            }
        }
    }

    public void timHangTheoGia(Scanner input){
        System.out.print("Hãy nhập khoảng giá của hàng bạn muốn tìm\nTừ: ");
			float start = input.nextFloat();
			System.out.print("Đến: ");
			float end = input.nextFloat();
			
			Electric currentElectriclectric = headElectric;
			CrockerySet currentCrockerySet = headCrockerySet;
			Food currentFood = headFood;
			
			while (currentElectriclectric != null) {
				if (currentElectriclectric.price >= start && currentElectriclectric.price <= end)
					currentElectriclectric.inThongTin();
				currentElectriclectric = currentElectriclectric.next;
			}
			System.out.println();
			
			while (currentCrockerySet != null) {
				if (currentCrockerySet.price >= start && currentCrockerySet.price <= end)
					currentCrockerySet.inThongTin();
				currentCrockerySet = currentCrockerySet.next;
			}
			System.out.println();
			
			while (currentFood != null) {
				if (currentFood.price >= start && currentFood.price <= end)
					currentFood.inThongTin();
				currentFood = currentFood.next;
			}
    }

    public void timHangtheoNgay(Scanner input){
        System.out.println("Hãy nhập khoảng ngày nhập kho sản phẩm bạn muốn tìm (dd-MM-yyyy)\nTừ ngày: ");
			input.nextLine();
			String date = input.nextLine();
			
			int count = 0;
			
			Date startDate;
			try {
				startDate = dateFormat.parse(date);
			} catch (ParseException e) {
				System.err.println("Bạn đã nhập sai mẫu ngày hãy chọn (Tìm hàng ở Menu và thao tác lại)");
				return;
			}
			
			System.out.println("Đến ngày: ");
			String date1 = input.nextLine();
			Date endDate;
			try {
				endDate = dateFormat.parse(date1);
			} catch (ParseException e) {
				System.err.println("Bạn đã nhập sai mẫu ngày hãy chọn (Tìm hàng ở Menu và thao tác lại)");
				return;
			}
			
			Electric curDM = headElectric;
			while (curDM != null) {
				if (curDM.date.compareTo(startDate) >= 0 && curDM.date.compareTo(endDate) <= 0) {
					count++;
					curDM.inThongTin();
				}
				
				
				curDM = curDM.next;
			}
			
			if (count != 0) {
				count = 0;
				System.out.println();
			}
			
			CrockerySet curSS = headCrockerySet;
			while (curSS != null) {
				if (curSS.date.compareTo(startDate) >= 0 && curSS.date.compareTo(endDate) <= 0) {
					count++;
					curSS.inThongTin();
				}
				
				curSS = curSS.next;
			}
			
			if (count != 0) {
				count = 0;
				System.out.println();
			}
			
			Food curTP = headFood;
			while (curTP != null) {
				if (curTP.date.compareTo(startDate) >= 0 && curTP.date.compareTo(endDate) <= 0) {
					count++;
					curTP.inThongTin();
				}
				
				curTP = curTP.next;
			}
	}
    
    public void thongKe(Scanner input){
        int tongSLHang;
		int tongSLDienMay = 0;
		int tongSLSanhSu = 0;
		int tongSLThucPham = 0;
		
		float tongGiaTri = 0;
		float tongGiaTriDienMay = 0;
		float tongGiaTriSanhSu = 0;
		float tongGiaTriThucPham = 0;
		
		Electric currentElectric = headElectric;
		CrockerySet currentCrockerySet = headCrockerySet;
		Food currentFood = headFood;
		
		while (currentElectric != null) {
			tongSLDienMay++;
			tongGiaTriDienMay += currentElectric.price;
			currentElectric = currentElectric.next;
		}
		
		while (currentCrockerySet != null) {
			tongSLSanhSu++;
			tongGiaTriSanhSu += currentCrockerySet.price;
			currentCrockerySet = currentCrockerySet.next;
		}
		
		while (currentFood != null) {
			tongSLThucPham++;
			tongGiaTriThucPham += currentFood.price;
			currentFood = currentFood.next;
		}
		
		tongSLHang = tongSLDienMay + tongSLSanhSu + tongSLThucPham; 
		tongGiaTri = tongGiaTriDienMay + tongGiaTriSanhSu + tongGiaTriThucPham;
		
        System.out.println("Total quantity of goods in stock is : "+tongSLHang+ " products.");
        System.out.println("Total value of inventory is: "+tongGiaTri+" VND.\n");

        System.out.println("Electronics there are: " +tongSLDienMay+" products.");
        System.out.println("Crockery there are: "+tongSLSanhSu+" products.");
        System.out.println("Food there are: "+tongSLThucPham+" products.");
		
    }

    public void sortUpPrice(){

    }
}
