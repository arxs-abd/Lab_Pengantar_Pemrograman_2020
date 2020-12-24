import java.util.Scanner;
public class Nomor3 {
  
    public static void main(String[] args) {
        Scanner iu = new Scanner(System.in);
        System.out.println("Masukkan Usia seseorang (dalam hari) : ");
        int usia = iu.nextInt();
        if (usia < 365 ) {
          System.out.println("usia anda belum cukup 1 tahun");
        }
        else {
        myDay(usia);
        }
    }
    
    public static void myDay(int usia) {
        int tahun = usia / 365;
        System.out.println(tahun + " tahun");
        int bulan = (usia % 365) / 30;
        System.out.println(bulan + " bulan");
        int hari = (usia % 365) % 30;
        System.out.println(hari + " hari");

    }
  
}