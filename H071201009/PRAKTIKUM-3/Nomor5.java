import java.util.Scanner;
class Nomor5 {
public static void main(String[] args) {
Scanner obj   = new Scanner(System.in);

while (obj.hasNext()) {
    float m   = obj.nextFloat();
    int jam   = 0;
    int menit = 0;
    int detik = 0;
    int detikSementara = (int) (m * 240);
    if ( m >= 0 && m < 360) {
        while (detikSementara > 0) {
            if (detikSementara - 3600 >= 0 ) {
                detikSementara -= 3600;
                jam++;
            } else if (detikSementara - 60 >= 0) {
                detikSementara -= 60;
                menit++;
            } else {
                detikSementara -= 1;
                detik++;
            }
        }
        jam += 6;
        if (jam > 24) 
            jam -= 24;
            if (jam <= 10) {
                System.out.println("Selamat pagi");
                System.out.printf("%02d : %02d : %02d", jam,  menit, detik);
            } else if (jam <= 14) {
                System.out.println("Selamat siang");
                System.out.printf("%02d : %02d : %02d", jam,  menit, detik);
            } else if (jam <= 18) {
                System.out.println("Selamat sore");
                System.out.printf("%02d : %02d : %02d", jam,  menit, detik);
            } else {
                System.out.println("Selamat malam");
                System.out.printf("%02d : %02d : %02d", jam,  menit, detik);
            }
        }else {
        System.out.println("Masukkan nilai yang benar");
        System.out.println("Nilai yang benar : 0 <= m <= 360 ");
    } 
    }

}
}    

