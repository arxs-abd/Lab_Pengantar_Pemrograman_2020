import java.io.*;
import java.util.Scanner;
class Praktikum3 {
    public static void main(String[] args) { 
        Scanner sc = new Scanner (System.in);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        FileWriter fileWriter = null;
        PrintWriter printWriter = null;

        try { 
            String destination = sc.nextLine();
            int data = sc.nextInt();
            sc.nextLine();
            String[] nama = new String [data];
            String[] nim = new String [data];
            String[] angkatan = new String [data];
            for (int i = 0; i < data; i++) {
                nama[i] = sc.nextLine();
                nim[i] = sc.nextLine();
                angkatan[i] = sc.nextLine();
               if (nama[i].length()>20){
                   System.out.println("gagal");
                   System.out.println("nama tidak boleh lebih dari 20 karakter");
                   return;
               }
               if(nama[i].contains(" ")){
                   System.out.println("gagal");
                   System.out.println("nama tidak boleh menggunakan spasi, jika terdapat spasi gunakan underscore '_' ");
                   return;
               }

            }
            sc.close();
            fileWriter = new FileWriter(destination + ".txt");
            printWriter = new PrintWriter(fileWriter);

            printWriter.println("+--------------------+-----------+---------+");
            printWriter.println("|Nama                |NIM        |Angkatan |");
            printWriter.println("+--------------------+-----------+---------+");
            for (int i = 0; i < data; i++) {
                printWriter.printf("|%-20s|%-11s|%-9s|\n", nama[i], nim[i], angkatan[i]);
            }
            printWriter.println("+--------------------+-----------+---------+");
            System.out.println("Berhasil");

        } catch (IOException ioe) {
            System.out.println("Gagal");
        } finally {
            try {
                if (bufferedReader !=  null) {
                    bufferedReader.close();      
                }
                if (fileReader !=  null) {
                    fileReader.close();
                }
                if ( printWriter != null) {
                    printWriter.close();
                }
            } catch (IOException ioe) {
                System.out.println(ioe.getMessage());
            }
        }
    }
} 