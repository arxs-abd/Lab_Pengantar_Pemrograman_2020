import java.util.Scanner;
import java.io.*;

public class Nomor802{
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        FileWriter fileWriter = null;
        PrintWriter printWriter = null;
        FileReader fileReader = null;
        BufferedReader buffReader = null;

        try {
            String filePertama = scan.next();
            String fileKedua = scan.next();
            scan.close();
            fileReader = new FileReader(String.format("%s.txt", filePertama));
            buffReader = new BufferedReader(fileReader);
            fileWriter = new FileWriter(String.format("%s.txt", fileKedua));
            printWriter = new PrintWriter(fileWriter);

            String text;

            int max = 0;
            while ((text = buffReader.readLine()) != null) {
                max = text.length() > max ? text.length() : max;
            }
            fileReader = new FileReader(String.format("%s.txt", filePertama));
            buffReader = new BufferedReader(fileReader);

            String test1;

            while ((test1 = buffReader.readLine()) != null) {
                printWriter.write(String.format("%" + max + "s\n", test1));
            }

        } catch (IOException e) {
            System.out.println(" Gagal ");
        } finally {
            try {
                if (fileWriter != null) {
                    System.out.println(" Berhasil ");
                    fileWriter.close();
                }
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}