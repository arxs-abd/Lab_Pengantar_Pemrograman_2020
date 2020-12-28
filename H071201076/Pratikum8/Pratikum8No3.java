import java.io.*;
import java.util.Scanner;

public class Pratikum8No3 {
    public static void main(String[] args) { 
        Scanner read = new Scanner (System.in);
        FileReader fRead = null;
        BufferedReader bRead = null;
        FileWriter fWriter = null;
        PrintWriter pWriter = null;
        try { 
            String destination = read.nextLine();
            int data = read.nextInt();
            read.nextLine();
            String[] nama = new String [data];
            String[] nim = new String [data];
            String[] angkatan = new String [data];
            for (int i = 0; i < data; i++) {
                nama[i] = read.nextLine();
                nim[i] = read.nextLine();
                angkatan[i] = read.nextLine();
               if (nama[i].length() > 20){
                   System.out.println("Gagal");
                   System.out.println("panjang nama tidak boleh lebih dari 20 karakter");
                   return;
               }
               if(nama[i].contains(" ")){
                   System.out.println("Gagal");
                   System.out.println("jika terdapat spasi gunakan underscore '_' ");
                   return;
               }
            }
            read.close();
            fWriter = new FileWriter(destination + ".txt");
            pWriter = new PrintWriter(fWriter);
            pWriter.println("+--------------------+-----------+---------+");
            pWriter.println("|Nama                |NIM        |Angkatan |");
            pWriter.println("+--------------------+-----------+---------+");
            for (int i = 0; i < data; i++) {
                pWriter.printf("|%-20s|%-11s|%-9s|\n", nama[i], nim[i], angkatan[i]);
            }
            pWriter.println("+--------------------+-----------+---------+");
            System.out.println("Berhasil");

        } catch (IOException ioe) {
            System.out.println("Gagal");
        } finally {
            try {
                if (bRead !=  null) {
                    bRead.close();      
                }
                if (fRead !=  null) {
                    fRead.close();
                }
                if ( pWriter != null) {
                    pWriter.close();
                }
            } catch (IOException ioe) {
                System.out.println(ioe.getMessage());
            }
        }
    }
}