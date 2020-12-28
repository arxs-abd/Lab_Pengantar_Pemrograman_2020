import java.io.*;
import java.util.Scanner;

public class Nomor803 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        FileWriter fileWriter = null;
        PrintWriter printWriter = null;

        try {
            System.out.print(" Masukkan Nama File : ");
            String fileName = scan.nextLine() + ".txt";
            System.out.print(" Jumlah Data Asisten yang ingin ditampilkan : ");
            int jumlahAsisten = scan.nextInt();
            String[] listNama = new String[jumlahAsisten];
            String[] listNim = new String[jumlahAsisten];
            int[] listAngkatan = new int[jumlahAsisten];

            for (int i = 0; i < jumlahAsisten; i++) {
                scan.nextLine();
                System.out.print("Nama = ");
                listNama[i] = scan.nextLine();
                System.out.print("NIM = ");
                listNim[i] = scan.next();
                System.out.print("Angkatan = ");
                listAngkatan[i] = scan.nextInt();
            }

            fileWriter = new FileWriter(fileName);
            printWriter = new PrintWriter(fileWriter);
            int panjang = 0;
            for (int i = 0; i < listNama.length; i++) {
                if (listNama[i].length() > panjang)
                    panjang = listNama[i].length();
            }
            printWriter.printf("+%s+===========+===========+\n", tampilan (panjang));
            panjang -= 4;
            printWriter.printf("|NAMA%" + panjang + "s|NIM         |ANGKATAN  |\n", " ");
            panjang += 4;
            printWriter.printf("+%s+===========+===========+\n", tampilan (panjang));
            for (int j = 0; j < jumlahAsisten; j++) {
                panjang -= listNama[j].length();
                printWriter.printf("|%s", listNama[j]);
                for (int x = 0; x < panjang; x++) {
                    printWriter.print(" ");
                }
                printWriter.printf("| %-10s | %-8s |\n", listNim[j], listAngkatan[j]);
                panjang += listNama[j].length();
            }
            printWriter.printf("+%s+===========+===========+\n", tampilan (panjang));

        } catch (IOException ioe) {
            System.out.println("Gagal");
            scan.nextLine();
        } finally {
            try {
                if (printWriter != null) {
                    System.out.println("Berhasil");
                    printWriter.close();
                }
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static String tampilan (int a) {
        String str = "";
        for (int i = 0; i < a; i++) {
            str += ":";
        }
        return str;
    }
}