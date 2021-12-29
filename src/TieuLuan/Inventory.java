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
                    System.out.println("--- Successful delete.---");
                    return;
                }
                curentElectric = curentElectric.next ;
            }

            while ( currentCrockerySet.next != null){
                if (currentCrockerySet.next.id == idCanXoa) {
                    currentCrockerySet.next = currentCrockerySet.next.next;
                    System.out.println("--- Successful delete. ---");
                    return;
                }
                currentCrockerySet = currentCrockerySet.next ;
            }

            while ( currentFood.next != null){
                if (currentFood.next.id == idCanXoa) {
                    currentFood.next = currentFood.next.next;
                    System.out.println("--- Successful delete. ---");
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
                    System.out.println("--- Successful delete. ---");
                    return ;
                }
                currentElectriclectric = currentElectriclectric.next ;
            }

            while (currentCrockerySet.next != null) {
                if (currentCrockerySet.next.name.equalsIgnoreCase(tenCanXoa)) {
                    currentCrockerySet.next =currentCrockerySet.next.next ;
                    System.out.println("--- Successful delete. ---");
                    return ; 
                }
                currentCrockerySet = currentCrockerySet.next ;
            }

            while (currentFood.next != null) {
                if (currentFood.next.name.equalsIgnoreCase(tenCanXoa)) {
                    currentFood.next =currentFood.next.next ;
                    System.out.println("--- Successful delete. ----");
                    return ;
                }
                currentFood = currentFood.next ;
            }
            System.out.println("--- No find name.");
        }
           
        if (chose == 3) {
            System.out.print("---Enter the price of the item to be deleted: ");
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
                    System.out.println("--- Successful delete.---");
                    return;
                }
                curentElectric = curentElectric.next ;
            }

            while ( currentCrockerySet.next != null){
                if (currentCrockerySet.next.price == giaCanXoa) {
                    currentCrockerySet.next = currentCrockerySet.next.next;
                    System.out.println("--- Successful delete. ---");
                    return;
                }
                currentCrockerySet = currentCrockerySet.next ;
            }

            while ( currentFood.next != null){
                if (currentFood.next.price == giaCanXoa) {
                    currentFood.next = currentFood.next.next;
                    System.out.println("--- Successful delete.---");
                    return;
                }
                currentFood = currentFood.next ;
            }
            System.out.println("--- No find price.");
        }
    }
    
    public void searchByType(Scanner input){
        System.out.println("--- Enter the type of item you want to find: ");
        System.out.println("    1.>> Electric");
        System.out.println("    2.>> CrokerySet");
        System.out.println("    3.>> Food.");
        System.out.print("--- Your choice: ");
    
        int loaiHang = input.nextInt();

        if (loaiHang == 1) {
            Electric currentElectric = headElectric;
            while (currentElectric != null) {
                currentElectric.inThongTin();
                currentElectric = currentElectric.next;
            }
        }else if (loaiHang == 2) {
            CrockerySet currentCrockerySet = headCrockerySet;
            while (currentCrockerySet != null) {
                currentCrockerySet.inThongTin();
                currentCrockerySet = currentCrockerySet.next;
            }
        }else if (loaiHang == 3) {
            Food currentFood = headFood;
            while (currentFood != null) {
                currentFood.inThongTin();
                currentFood = currentFood.next;
            }
        }
    }

    public void searchByPrice(Scanner input){
            System.out.println("Enter the price range of the item you want to find");
            System.out.print("From: ");
			float start = input.nextFloat();
			System.out.print("To: ");
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

    public void searchByDate(Scanner input){
        System.out.println("Hãy nhập khoảng ngày nhập kho sản phẩm bạn muốn tìm (dd-MM-yyyy)\nTừ ngày: ");
			input.nextLine();
			String date = input.nextLine();
			
			int count = 0;
			
			Date a;
			try {
				a = dateFormat.parse(date);
			} catch (ParseException e) {
				System.err.println("Bạn đã nhập sai mẫu ngày hãy chọn (Tìm hàng ở Menu và thao tác lại)");
				return;
			}
			
			System.out.println("Đến ngày: ");
			String date1 = input.nextLine();
			Date b;
			try {
				b = dateFormat.parse(date1);
			} catch (ParseException e) {
				System.err.println("Bạn đã nhập sai mẫu ngày hãy chọn (Tìm hàng ở Menu và thao tác lại)");
				return;
			}
			
			Electric currentElectric = headElectric;
			while (currentElectric != null) {
				if (currentElectric.date.compareTo(a) >= 0 && currentElectric.date.compareTo(b) <= 0) {
					count++;
					currentElectric.inThongTin();
				}
				
				
				currentElectric = currentElectric.next;
			}
			
			if (count != 0) {
				count = 0;
				System.out.println();
			}
			
			CrockerySet currentCrockerySet = headCrockerySet;
			while (currentCrockerySet != null) {
				if (currentCrockerySet.date.compareTo(a) >= 0 && currentCrockerySet.date.compareTo(b) <= 0) {
					count++;
					currentCrockerySet.inThongTin();
				}
				
				currentCrockerySet = currentCrockerySet.next;
			}
			
			if (count != 0) {
				count = 0;
				System.out.println();
			}
			
			Food currentFood = headFood;
			while (currentFood != null) {
				if (currentFood.date.compareTo(a) >= 0 && currentFood.date.compareTo(b) <= 0) {
					count++;
					currentFood.inThongTin();
				}
				
				currentFood = currentFood.next;
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

    public void fixByType(Scanner input){
        System.out.print("Hãy nhập id hàng bạn cần sửa: "); 
        int id = input.nextInt();
			Electric currentElectric = headElectric;
			CrockerySet currentCrockerySet = headCrockerySet;
			Food currentFood = headFood;
			
			while (currentElectric != null) {
				if (currentElectric.id == id) {
					currentElectric.inThongTin();
					System.out.println("Hãy sửa lại thông tin");
					System.out.print("Tên hàng: "); input.nextLine(); currentElectric.name = input.nextLine();
					System.out.print("ID hàng: ");	currentElectric.id = input.nextInt();
					System.out.print("Giá hàng: "); currentElectric.price = input.nextFloat();
					System.out.print("Ngày nhập hàng theo mẫu (dd-MM-yyyy):");
					
					Date b = null;
					input.nextLine();
					String date = input.nextLine();
					try {
						b = dateFormat.parse(date);
					} catch (ParseException e) {
						e.printStackTrace();
					}
					currentElectric.date = b;
					return;
				}
				currentElectric = currentElectric.next;
			}
			
			while (currentCrockerySet != null) {
				if (currentCrockerySet.id == id) {
					currentCrockerySet.inThongTin();
					System.out.println("Hãy sửa lại thông tin");
					System.out.print("Tên hàng: "); input.nextLine(); currentCrockerySet.name = input.nextLine();
					System.out.print("ID hàng: ");	currentCrockerySet.id = input.nextInt();
					System.out.print("Giá hàng: "); currentCrockerySet.price = input.nextFloat();
					System.out.print("Ngày nhập hàng theo mẫu (dd-MM-yyyy):");
					
					Date b = null;
					input.nextLine();
					String date = input.nextLine();
					try {
						b = dateFormat.parse(date);
					} catch (ParseException e) {
						e.printStackTrace();
					}
					currentCrockerySet.date = b;
					return;
				}
				currentCrockerySet = currentCrockerySet.next;
			}
			
			while (currentFood != null) {
				if (currentFood.id == id) {
					currentFood.inThongTin();
					System.out.println("Hãy sửa lại thông tin");
					System.out.print("Tên hàng: "); input.nextLine(); currentFood.name = input.nextLine();
					System.out.print("ID hàng: ");	currentFood.id = input.nextInt();
					System.out.print("Giá hàng: "); currentFood.price = input.nextFloat();
					System.out.print("Ngày nhập hàng theo mẫu: ");
					
					Date b = null;
					input.nextLine();
					String date = input.nextLine();
					try {
						b = dateFormat.parse(date);
					} catch (ParseException e) {
						e.printStackTrace();
					}
					currentFood.date= b;
					return;
				}
				currentFood = currentFood.next;
			}
    }
}
