import java.util.Scanner;

public class Tugas3No5 {
    public static void main(String[] args) {

    Scanner bob=new Scanner(System.in);

    int jam = 0;
    int detik = 0;
    int menit = 0;

    System.out.println("Masukkan Derajat ");
    while(bob.hasNextFloat()){
        float waktu = bob.nextFloat();

        if(waktu >= 0 && waktu < 360){
            float derajat = waktu * 240;
            int x = (int)derajat;

            jam = (x / 3600) + 6;

            if(jam > 23){
            jam -= 24;
            }
            else{
                jam += 0;
                }
            menit = (x%3600) / 60;
            
            detik = (x % 3600 ) % 60;
            
            
             if(x >= 0 && x < 14400){
            System.out.println("Selamat Pagi");
            }
             else if( x >= 14400 && x < 32400){
            System.out.println("Selamat Siang");
            }
            else if(x >= 32400 && x <46800){
            System.out.println("Selamat Sore");
            }
            else if(x >= 46800 && x <79200){
            System.out.println("Selamat Malam");
            }
            else{
            System.out.println("Subuh");
                }
            }
            else{
            System.out.println("Inputan Tidak Valid");
            }
            System.out.printf("%02d:%02d:%02d\n",jam,menit,detik);

        }
        
    }
} 