
//Nama:Siskanti
//Nim:H071201064
import java.util.Scanner;
import java.util.Random;

public class Soal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        String serialNumber = generateSerial(n, m);
        System.out.println(serialNumber);

    }

    public static String generateSerial(int n, int m) {
        Random rand = new Random();
        String str = "";
        int p = 10;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                str += rand.nextInt(p);

            }
            if (i < n) {
                str += " - ";
            }
        }

        return str;
    }
}
