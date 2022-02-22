package baitapvenha.Lab4;

import java.util.ArrayList;
import java.util.List;

public class SanPhamTest {
    public static void main(String[] args) {
        SanPham sp1 = new SanPham() ;
        SanPham sp2 = new SanPham() ;
       // bài 2 
        sp1.input(); 
        sp2.input();
        sp1.outPut();
        System.out.println();
        sp2.outPut();
        // bài 3 
        SanPham sp = new SanPham("Tao", 500);
        sp.outPut();
        System.out.println();
        // bài 5
        List<SanPham> list = new ArrayList<>() ;
        list.add(new SanPham("Ruou", 30));
        list.add(new SanPham("Bia", 19, 2));
        list.add(new SanPham("Heniken", 23, 3));

        for (SanPham sanPham : list) {
            sanPham.outPut();
            System.out.println();
        }
    }
}
