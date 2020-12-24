import java.util.Scanner;
public class Nomor4 {
    
    public static void main(String[] args){
        try {
            Scanner scan = new Scanner(System.in);
            int seratus = 0, limapuluh = 0, duapuluh = 0, sepuluh = 0, limaribu = 0, duaribu = 0, seribu = 0;
            int harga = scan.nextInt();
            int uang = scan.nextInt();
            if (harga<uang){
                int kembalian = uang-harga;
                while (kembalian > 0 ){
                    if (kembalian - 100000 >= 0){
                        kembalian -= 100000;
                        seratus++;
                    }else if (kembalian - 50000 >= 0){
                        kembalian -= 50000;
                        limapuluh++;
                    }else if (kembalian - 20000 >= 0){
                        kembalian -= 20000;
                        duapuluh++;
                    }else if (kembalian - 10000 >= 0 ){
                        kembalian -= 10000;
                        sepuluh++;
                    }else if (kembalian - 5000 >= 0){
                        kembalian -= 5000;
                        limaribu++;
                    }else if (kembalian - 2000 >= 0){
                        kembalian -= 2000;
                        duaribu++;
                    }else if (kembalian - 1000 >= 0){
                        kembalian -= 1000;
                        seribu++;
                    }
                }
                System.out.println(seratus+" uang Rp.100.000");
                System.out.println(limapuluh+" uang Rp.50.000");
                System.out.println(duapuluh+" uang Rp.20.000");
                System.out.println(sepuluh+" uang Rp.10.000");
                System.out.println(limaribu+" uang Rp.5.000");
                System.out.println(duaribu+" uang Rp.2.000");
                System.out.println(seribu+" uang Rp.1.000");
            } else 
                System.out.println("uang anda tidak cukup untuk membayar"); 
        } catch (Exception e){
            System.out.println("mahon masukkan data yang benar");
        }
    }
}
