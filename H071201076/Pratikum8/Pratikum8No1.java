import java.io.*;
import java.util.Scanner;

public class Pratikum8No1 {
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        FileInputStream input = null;
        FileOutputStream output = null;
        try {
            input = new FileInputStream(read.next() + ".txt");
            output = new FileOutputStream(read.next() + ".txt");
            int file;
            while ((file = input.read()) != -1) {
                output.write(file);
            }
        } catch (IOException ioe) {
            System.out.println("Gagal");
        }
        finally {
            try {
                if (input != null) {
                    System.out.println("Berhasil");
                    input.close();
                }
                if (output != null) {
                    output.close();
                }
            } catch (IOException ioe) {
                System.out.println("Gagal");
            }
        }
    }
}