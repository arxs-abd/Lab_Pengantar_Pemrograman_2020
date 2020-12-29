import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Nomor2 {
    
    public static void main (String[] args) throws FileNotFoundException{
        Scanner scan = new Scanner (System.in);
        FileWriter FileWrite = null;
        PrintWriter printWriter = null;
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            String firsFile = scan.next();
            String secondFile = scan.next();
            scan.close();
            fileReader = new FileReader(String.format("%s.txt",firsFile));
            bufferedReader = new BufferedReader(fileReader);
            FileWrite = new FileWriter(String.format("%s.txt",secondFile));
            printWriter = new PrintWriter(FileWrite);

            String test;

            int max = 0;
            while ((test = bufferedReader.readLine()) != null){
                max = test.length() > max ? test.length() : max;
            }
            fileReader = new FileReader(String.format("%s.txt",firsFile));
            bufferedReader = new BufferedReader(fileReader);

            String test1;

            while ((test1 = bufferedReader.readLine()) != null){
                printWriter.write(String.format("%" + max + "s\n.", test1));
            }
        } catch (IOException ioe) {
            System.out.println("gagal");
        } finally {
            try {
                if (FileWrite != null) {
                    System.out.println("Berhasil");
                    FileWrite.close();
                }
                if (fileReader != null){
                    fileReader.close();
                }
            } catch (IOException ioe) {
                System.out.println(ioe.getMessage());
            }
        }
    }
}
