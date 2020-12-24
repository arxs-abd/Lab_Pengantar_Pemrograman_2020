import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

class Nomor3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        FileWriter dataWriter = null;
        PrintWriter printWriter = null;

        try{

            System.out.print("Nama File = ");
            String data = scan.nextLine() + ".txt";
            String nama;
            ArrayList<String> name = new ArrayList<>();
            ArrayList<String> nim = new ArrayList<>();
            ArrayList<String> ang = new ArrayList<>();

            System.out.print("Input Jumlah Asistensi  = ");
            int numberAssistance = scan.nextInt();
            scan.nextLine();

            int i;
            for (i = 0; i < numberAssistance; i++) {
                System.out.print("NAMA = ");
                nama = scan.nextLine();
                nama = nama.replace(" ", "_");
                name.add(nama);

                System.out.print("NIM = ");
                nim.add(scan.nextLine());

                System.out.print("ANGKATAN = ");
                ang.add(scan.nextLine());
            }
            dataWriter = new FileWriter (data);
            printWriter = new PrintWriter(dataWriter);

            printWriter.printf("+----------------------+--------------------+-----------+\n");
            printWriter.printf("|NAMA                  |NIM                 |ANGKATAN   |\n");
            printWriter.printf("+----------------------+--------------------+-----------+\n");
            int j;
            for (j = 0; j < numberAssistance; j++) {    
                printWriter.printf("| %-20s | %-18s | %-8s  |\n", name.get(j), nim.get(j), ang.get(j));
            }
            printWriter.printf("+----------------------+--------------------+-----------+\n");
            System.out.println("BERHASIL");
        } catch (IOException ioe){
            System.out.println("GAGAL");

        } finally {

            try {
                if (printWriter != null) {
                    printWriter.close();
                } 
                if (dataWriter != null) {
                    dataWriter.close();
                }
            } catch (IOException ioe) {
                System.out.println(ioe.getMessage());
            }
        }
    }
}  