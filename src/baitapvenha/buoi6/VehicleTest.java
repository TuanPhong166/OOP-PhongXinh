package baitapvenha.buoi6;

import java.util.Scanner;

public class VehicleTest {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Vehicle v[]= null;//mang chua xe
        int a,n=0;
        boolean flag = true;
        do{
            System.out.println();
            System.out.println("Ban muon lam gi!!!");            
            System.out.println("1.>> Tao cac doi tuong xe va nhap thong tin.");
            System.out.println("2.>> Xuat ban ke khai tien thue truoc ba cua cac xe.");
            System.out.println("  >> Nhap so bat ki de thoat.");
            System.out.println("---- Ban muon thuc hien chuc nang: ") ;
            a =input.nextInt();

            switch (a){
                case 1:
                    System.out.print("Nhap so luong xe ban muon khai bao thue: ");
                    n=input.nextInt();
                    //khai báo mảng v[] để chứa số lượng xe
                    v= new Vehicle[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("Xe thu " + (i+1));
                        v[i] = new Vehicle();
                        v[i].nhapXe(v[i]);
                    }
                    break;
                case 2:
                    System.out.printf("%10s %20s %4s %10s %10s %8s ","Ma xe","Chu xe","Dung tich","Tri gia","Mo ta","Thue");
                    System.out.println();
                    for (int i = 0; i < n; i++) {
                        v[i].inThue();
                        System.out.println();
                    }
                    break;
                default:
                    System.out.println("bye");
                    flag=false;
                    break;
            }
        }while (flag);
    }
}
