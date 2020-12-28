import java.io.*;
import java.util.Scanner;

public class Pratikum8No2 {
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        FileReader fRead = null;
        BufferedReader bRead = null;
        FileWriter fWriter = null;
        PrintWriter pWriter = null; 
        try {
            String sumber = read.next();
            String tujuan = read.next();
            read.close();
            fRead = new FileReader(sumber + ".txt");
            bRead = new BufferedReader(fRead);
            fWriter = new FileWriter(tujuan + ".txt");
            pWriter = new PrintWriter(fWriter);
            String read;
            int max = 0;
            while ((read = bRead.readLine()) != null) {
                max = read.length() > max ? read.length() : max ;
            }
            fRead = new FileReader(sumber + ".txt");
            bRead = new BufferedReader(fRead);
            String check;
            while ((check = bRead.readLine()) != null) {
                pWriter.write(String.format("%" + max + "s\n", check));
            }
        } catch (IOException ioe) {
            System.out.println("Gagal");
        } finally {
            try {
                if (fWriter != null) {
                    fWriter.close();
                }
                if (pWriter != null) {
                    pWriter.close();
                }
                if (bRead != null) {
                    System.out.println("Berhasil");
                    bRead.close();
                }
                if (fRead != null) {
                    fRead.close();
                }    
            } catch (IOException ioe) {
                System.out.println(ioe.getMessage());
            }
        }
    }
}