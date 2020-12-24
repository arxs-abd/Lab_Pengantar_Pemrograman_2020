import java.io.*;
import java.util.Scanner;
public class PPNomor3 {

    public static void main(String[] args) { 
        Scanner input = new Scanner (System.in);
        FileReader fReader = null;
        BufferedReader bReader = null;
        FileWriter fWriter = null;
        PrintWriter pWriter = null;

        try { 
            String destination = input.nextLine();
            int data = input.nextInt();
            input.nextLine();
            String[] nama = new String [data];
            String[] nim = new String [data];
            String[] angkatan = new String [data];

            for (int i = 0; i < data; i++) {
                nama[i] = input.nextLine();
                nim[i] = input.nextLine();
                angkatan[i] = input.nextLine();
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
            input.close();
            fWriter = new FileWriter(destination + ".txt");
            pWriter = new PrintWriter(fWriter);

            pWriter.println("+----------------------+---------------+-----------+");
            pWriter.println("|Nama                  |NIM            |Angkatan   |");
            pWriter.println("+----------------------+---------------+-----------+");

            for (int i = 0; i < data; i++) {
                pWriter.printf("|%-20s|%-11s|%-9s|\n", nama[i], nim[i], angkatan[i]);
            }
            pWriter.println("+--------------------+-----------+---------+");
            pWriter.flush();
            System.out.println("Berhasil");
        } 
        catch (IOException ioe) {
            System.out.println("Gagal");
        } 
        finally {
            try {
                if (bReader !=  null) {
                    bReader.close();      
                }
                if (fReader !=  null) {
                    fReader.close();
                }
                if ( pWriter != null) {
                    pWriter.close();
                }
            } 
            catch (IOException ioe) {
                System.out.println(ioe.getMessage());
            }
        }
    }
}