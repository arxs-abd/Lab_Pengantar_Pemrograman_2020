import java.util.Scanner;

class Nomor4 {
    public static void main(String[] args) {
        Scanner obj   = new Scanner(System.in);
        System.out.print("Masukkan Harga :");
        int harga     = obj.nextInt();
        System.out.print("Masukkan uang :");
        int uang      = obj.nextInt();
        int kembalian = uang - harga;
        int seratus   = 0;
        int limaPuluh = 0;
        int duaPuluh  = 0;
        int sepuluh   = 0;
        int limaRibu  = 0;
        int duaRibu   = 0;
        int seribu    = 0;


        while (kembalian > 0) {

            if (kembalian - 100000 >= 0) {
                kembalian -= 100000;
                seratus++;

            } else if (kembalian - 50000 >= 0) {
                kembalian -= 50000;
                limaPuluh++;

            } else if (kembalian - 20000 >= 0) {
                kembalian -= 20000;
                duaPuluh++;

            } else if (kembalian - 10000 >= 0) {
                kembalian -= 10000;
                sepuluh++;

            } else if (kembalian - 5000 >= 0) {
                kembalian -= 5000;
                limaRibu++;

            } else if (kembalian - 2000 >= 0) {
                kembalian -= 2000;
                duaRibu++;
 
            } else {
                kembalian -= 1000;
                seribu++;
            }
        }
            System.out.println(seratus   + " uang Rp. 100.000");
            System.out.println(limaPuluh + " uang Rp. 50.000 ");
            System.out.println(duaPuluh  + " uang Rp. 20.000 ");
            System.out.println(sepuluh   + " uang Rp. 10.000 ");
            System.out.println(limaRibu  + " uang Rp. 5.000  ");
            System.out.println(duaRibu   + " uang Rp. 2.000  ");
            System.out.println(seribu    + " uang Rp. 1.000  ");

        
    }
}
