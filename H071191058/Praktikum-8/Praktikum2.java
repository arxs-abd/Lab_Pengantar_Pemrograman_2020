import java.util.Scanner;
import java.io.*;
class Praktikum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        FileReader fr = null;
        BufferedReader br = null;
        FileWriter fWriter = null;
        PrintWriter pWriter = null; 

        try {
            String source = sc.next();
            String destination = sc.next();
            sc.close();
            fr = new FileReader(source + ".txt");
            br = new BufferedReader(fr);
            fWriter = new FileWriter(destination + ".txt");
            pWriter = new PrintWriter(fWriter);
            String read;
            int max = 0;

            while ((read = br.readLine()) != null) {
                max = read.length() > max ? read.length() : max ;
            }

            fr = new FileReader(source + ".txt");
            br = new BufferedReader(fr);

            String check;
            while ((check = br.readLine()) != null) {
                pWriter.write(String.format("%" +max+ "s\n", check));
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
                if (br != null) {
                    System.out.println("Berhasil");
                    br.close();
                }
                if (fr != null) {
                    fr.close();
                }    
            } catch (IOException ioe) {
                System.out.println(ioe.getMessage());
            }
        }

    }

} 