
//Nama:Siskanti
//Nim:H071201064
import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        int jumlah1, jumlah2, hexa2;
        String tanpaSpasi, word, hexa, oktal;
        word = user.nextLine();
        tanpaSpasi = word.replaceAll("\\s+", ""); // hilangkan spasi
        jumlah1 = word.length();
        jumlah2 = tanpaSpasi.length();

        hexa2 = word.length() * word.length();
        hexa = String.format("%x", hexa2); // ubah ke hexa
        oktal = String.format("%o", jumlah1); // ubah ke oktal

        System.out.print("#" + hexa); // print hexa

        for (int i = 0; i < jumlah2 / 2; i++) { // print setengah karakter
            word = tanpaSpasi.toUpperCase();
            System.out.print(word.charAt(i));
        }

        for (int j = (jumlah2 / 2) - 2; j >= 0; j--) { // kebalikan dari setengah karakter
            word = tanpaSpasi.toUpperCase();
            System.out.print(word.charAt(j));
        }
        System.out.print(oktal); // print oktal
        if (Character.isDigit(hexa.charAt(0))) { // jika karakter awal hexa digit maka pakai ! jika tidak pakai ?
            System.out.println("!");

        } else {
            System.out.println("?");
        }

    }
}