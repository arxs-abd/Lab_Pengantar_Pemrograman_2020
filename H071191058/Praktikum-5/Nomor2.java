import java.util.Scanner;
import java.util.Random;
class Nomor2{
    public static void main(String[] args) {
        System.out.println("Program ini Mencari Berapa banyak Bilangan yg dinput secara random");
        Scanner X = new Scanner(System.in);
        System.out.println("Masukan angka Berapa banyak berulang");
        int n = X.nextInt();
        System.out.println("Masukan berapa Isinya");
        int m = X.nextInt();
        System.out.println("selamat anda mendapatkan jawabannya");
        String Nomor = Angkainputan(n, m);
        System.out.println(Nomor);

    }
    static String Angkainputan(int n, int m){
        String Y = "";
        Random angka = new Random();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int z = angka.nextInt(10);
                Y = Y + z;
            }
            if (i < (n-1)){
                Y = Y + "-";
            }
        }
        return Y;
        
    }
}