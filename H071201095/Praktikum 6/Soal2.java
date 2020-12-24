//Nama  : Adi Indra Muliani
//Nim   : H071201095
import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        String kalimat = user.nextLine();
        int kode = 0;
        String gabungan = "";

        for (int i = 0; i < kalimat.length(); i++) {
            if (i % 2 == 0) {
                gabungan += kalimat.charAt(i);
            } else {
                kode = Character.codePointAt(kalimat, i);
                gabungan += kode;
            }
            // System.out.println(gabungan);
        }
        while (gabungan.length() % 16 != 0) {
            gabungan += "?";
        }
        int pembagian = gabungan.length() / 16;
        // System.out.println(gabungan);
        String[] inimi = new String[16];

        System.out.println(gabungan);
        int k = 0;
        char[] charKu = gabungan.toCharArray();
        for (int i = 0; i < inimi.length; i++) {
            inimi[i] = "";
        }

        for (int i = 0; i < inimi.length; i++) {
            while (k < pembagian) {
                inimi[i] += charKu[k];
                k++;

                // System.out.println(inimi[i]);

            } // System.out.println(inimi[i]+" ");
            pembagian += gabungan.length() / 16;

        }
        String[][] matriks = new String[4][4];

        for (int i = 0; i < matriks.length; i++) {

            for (int j = 0; j < matriks[i].length; j++) {
                matriks[i][j] = "";
            }
        }
        k = 0;
        for (int i = 0; i < matriks.length; i++) {

            for (int j = 0; j < matriks[i].length; j++) {
                matriks[i][j] += inimi[k];
                k++;
            }
        }
        for (String[] a : matriks) {
            for (String b : a) {
                System.out.print(b + " ");
            }
            System.out.println();
        }

    }

}
