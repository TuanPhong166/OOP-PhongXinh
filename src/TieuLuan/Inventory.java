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
        System.out.println("-----------------------------------------");
        System.out.println("|        1.>> Electric                  |");
        System.out.println("|        2.>> Crockery                  |");
        System.out.println("|        3.>> Food                      |");
        System.out.println("-----------------------------------------");
        System.out.print("- Enter the selection : ");
		int chose  = input.nextInt();
        if(chose <= 3){
        
        if(chose == 1){
            Electric currentElectric = headElectric ;
            while(currentElectric != null){
                if (currentElectric.next == null){
                    Electric inventoryNew = new Electric() ;
                    inventoryNew.id = testId(input, chose);
                    inventoryNew.add(input);
                    currentElectric.next = inventoryNew ;
                    System.out.println("Sucessfull Add");
                    break ;
                }
                currentElectric = currentElectric.next;
            }
        }
        
        if(chose == 2){
            CrockerySet currentCrockerySet = headCrockerySet ;
            while(currentCrockerySet != null){
                if(currentCrockerySet.next == null){
                    CrockerySet inventoryNew = new CrockerySet() ;
                    inventoryNew.id = testId(input, chose);
                    inventoryNew.add(input);
                    currentCrockerySet.next = inventoryNew ;
                    System.out.println("Sucessfull Add");
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
                    inventoryNew.id = testId(input, chose);
                    inventoryNew.add(input);
                    currentFood.next = inventoryNew ;
                    System.out.println("Sucessfull Add");
                    break ;
                }
                currentFood = currentFood.next;
            }
        }
        }else 
             System.out.println("You chose wrong.");

    }

    public int testId(Scanner input , int chose){ // kiểm tra xem id đã tồn tại?
        System.out.print("Please enter item id: ");
		int id = input.nextInt();

        if(chose == 1){
            Electric current = headElectric ;
            while(current != null){
               if(current.id == id){
                System.out.println("Id already exists.");
                return testId(input, chose);
               }
               current = current.next;
           }
        }
        if(chose == 2){
            CrockerySet current = headCrockerySet ;
            while(current != null){
               if(current.id == id){
                System.out.println("Id already exists.");
                return testId(input, chose);
               }
               current = current.next;
           }
        }
        if(chose == 3){
            Food current = headFood ;
            while(current != null){
               if(current.id == id){
                System.out.println("Id already exists.");
                return testId(input, chose);
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
        System.out.println("How do you want to delete?");
        System.out.println("-------------------------");
        System.out.println("|  1.>> Delete by Id    |");
        System.out.println("|  2.>> Delete by name  |");
        System.out.println("|  3.>> Delete by Price |");
        System.out.println("-------------------------");
        System.out.print("--- Your choice: ");
		
		int chose = input.nextInt();

        if (chose == 1) {
            System.out.println("1.>> Delete by Id.");
            System.out.print("---Enter item id to delete: ");
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
            System.out.println("2.>> Delete by name.");
            System.out.print("---Enter item name to delete: ");
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
                    System.out.println("--- Successful delete. ---");
                    return ;
                }
                currentElectric = currentElectric.next ;
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
            System.out.println("3.>> Delete by price.");
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
			
			Electric currentElectric = headElectric;
			CrockerySet currentCrockerySet = headCrockerySet;
			Food currentFood = headFood;
			
			while (currentElectric != null) {
				if (currentElectric.price >= start && currentElectric.price <= end)
					currentElectric.inThongTin();
				currentElectric = currentElectric.next;
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
        System.out.println("Please enter the date to enter the product you want to find (dd-MM-yyy)");
            System.out.print("From Date: ");
			input.nextLine();
			String date = input.nextLine();
			
			int run = 0;
			
			Date a;
			try {
				a = dateFormat.parse(date);
			} catch (ParseException e) {
				System.out.println("You entered the wrong date pattern (dd-MM-yyy)");
				return;
			}
			
			System.out.print("To Date: ");
			String date1 = input.nextLine();
			Date b;
			try {
				b = dateFormat.parse(date1);
			} catch (ParseException e) {
				System.out.println("You entered the wrong date pattern (dd-MM-yyy)");
				return;
			}
			
			Electric currentElectric = headElectric;
			while (currentElectric != null) {
				if (currentElectric.date.compareTo(a) >= 0 && currentElectric.date.compareTo(b) <= 0) {
					run++;
					currentElectric.inThongTin();
				}
				
				
				currentElectric = currentElectric.next;
			}
			
			if (run != 0) {
				run = 0;
				System.out.println();
			}
			
			CrockerySet currentCrockerySet = headCrockerySet;
			while (currentCrockerySet != null) {
				if (currentCrockerySet.date.compareTo(a) >= 0 && currentCrockerySet.date.compareTo(b) <= 0) {
					run++;
					currentCrockerySet.inThongTin();
				}
				
				currentCrockerySet = currentCrockerySet.next;
			}
			
			if (run != 0) {
				run = 0;
				System.out.println();
			}
			
			Food currentFood = headFood;
			while (currentFood != null) {
				if (currentFood.date.compareTo(a) >= 0 && currentFood.date.compareTo(b) <= 0) {
					run++;
					currentFood.inThongTin();
				}
				
				currentFood = currentFood.next;
			}
	}
    
    public void thongKe(Scanner input){
        int tongSLHang;
		int sumE = 0;
		int sumC = 0;
		int sumF = 0;
		
		float sumValue = 0;
		float sumValueE = 0;
		float sumValueC = 0;
		float sumValueF = 0;
		
		Electric currentElectric = headElectric;
		CrockerySet currentCrockerySet = headCrockerySet;
		Food currentFood = headFood;
		
		while (currentElectric != null) {
			sumE++;
			sumValueE += currentElectric.price;
			currentElectric = currentElectric.next;
		}
		
		while (currentCrockerySet != null) {
			sumC++;
			sumValueC += currentCrockerySet.price;
			currentCrockerySet = currentCrockerySet.next;
		}
		
		while (currentFood != null) {
			sumF++;
			sumValueF += currentFood.price;
			currentFood = currentFood.next;
		}
		
		tongSLHang = sumE + sumC + sumF; 
		sumValue = sumValueE + sumValueC + sumValueF;
		
        System.out.println("Total quantity of goods in stock is : "+tongSLHang+ " products.");
        System.out.println("Total value of inventory is: "+sumValue+" VND.\n");

        System.out.println("Electronics there are: " +sumE+" products.");
        System.out.println("Crockery there are: "+sumC+" products.");
        System.out.println("Food there are: "+sumF+" products.");
		
    }

    public void sortUpPrice(){

    }

    public void fixByType(Scanner input){
        System.out.print("Enter the id of the item you want to fix: "); 
        int id = input.nextInt();
			Electric currentElectric = headElectric;
			CrockerySet currentCrockerySet = headCrockerySet;
			Food currentFood = headFood;
			
			while (currentElectric != null) {
				if (currentElectric.id == id) {
					currentElectric.inThongTin();
					System.out.println("Please correct the information.");
					System.out.print("Product Name: ");
                    input.nextLine(); currentElectric.name = input.nextLine();
					System.out.print("ID: "); 
                    currentElectric.id = input.nextInt();
					System.out.print("Product Price: "); 
                    currentElectric.price = input.nextFloat();
                    System.out.print("Inventory quantity: "); 
                    currentCrockerySet.inventory = input.nextInt() ;
					System.out.print("Enter the date according to the form (dd-MM-yyyy): ");
					
					Date b = null;
					input.nextLine();
					String date = input.nextLine();
					try {
						b = dateFormat.parse(date);
					} catch (ParseException e) {
						e.printStackTrace();
					}
					currentElectric.date = b;
                    System.out.println("---Successful repair");
                    System.out.println("Information after change: ");
                    currentElectric.inThongTin();
					return;
				}
				currentElectric = currentElectric.next;
			}
			
			while (currentCrockerySet != null) {
				if (currentCrockerySet.id == id) {
					currentCrockerySet.inThongTin();
					System.out.println("Please correct the information.");
					System.out.print("Product Name: "); 
                    input.nextLine(); currentCrockerySet.name = input.nextLine();
					System.out.print("ID: ");	
                    currentCrockerySet.id = input.nextInt();
					System.out.print("Product Price: "); 
                    currentCrockerySet.price = input.nextFloat();
                    System.out.print("Inventory quantity: "); 
                    currentCrockerySet.inventory = input.nextInt() ;
					System.out.print("Enter the date according to the form (dd-MM-yyyy): ");
					
					Date b = null;
					input.nextLine();
					String date = input.nextLine();
					try {
						b = dateFormat.parse(date);
					} catch (ParseException e) {
						e.printStackTrace();
					}
					currentCrockerySet.date = b;
                    System.out.println("---Successful repair");
                    System.out.println("Information after change: ");
                    currentCrockerySet.inThongTin();
					return;
				}
				currentCrockerySet = currentCrockerySet.next;
			}
			
			while (currentFood != null) {
				if (currentFood.id == id) {
					currentFood.inThongTin();
					System.out.println("Please correct the information.");
					System.out.print("Product Name: "); 
                    input.nextLine(); currentFood.name = input.nextLine();
					System.out.print("ID: ");	
                    currentFood.id = input.nextInt();
					System.out.print("Product Price: "); 
                    currentFood.price = input.nextFloat();
                    System.out.print("Inventory quantity: "); 
                    currentFood.inventory = input.nextInt() ;
					System.out.print("Enter the date according to the form (dd-MM-yyyy): ");
					
					Date b = null;
					input.nextLine();
					String date = input.nextLine();
					try {
						b = dateFormat.parse(date);
					} catch (ParseException e) {
						e.printStackTrace();
					}
					currentFood.date= b;
                    System.out.println("---Successful repair");
                    System.out.println("Information after change: ");
                    currentFood.inThongTin();
					return;
				}
				currentFood = currentFood.next;
			}
    }
}
