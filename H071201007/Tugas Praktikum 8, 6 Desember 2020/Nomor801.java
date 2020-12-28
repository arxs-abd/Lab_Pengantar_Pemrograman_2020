import java.io.*;
import java.util.Scanner;

class Nomor801 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        FileInputStream in = null;
        FileOutputStream out = null;
        String input = scan.next();
        String output = scan.next();
        try {
            in = new FileInputStream("D:\\new\\" + input + ".txt");
            out = new FileOutputStream("D:\\new\\" + output + ".txt");
            int data;
            while ((data = in.read()) != -1) {
                out.write(data);
            }
            System.out.println(" Berhasil ");
        } catch (IOException e) {
            System.out.println(" Gagal ");
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
                System.out.println(" Gagal ");
            }
        }
    }
}