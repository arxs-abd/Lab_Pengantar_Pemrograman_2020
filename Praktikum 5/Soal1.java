
//Nama: Siskanti
//Nim:H071201064
import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        int x = user.nextInt();
        int y = user.nextInt();
        System.out.println("FPB from " + x + " and " + y + " = " + searchFPB(x, y));
    }

    public static int searchFPB(int x, int y) {
        if (y == 0)
            return x;
        else
            return searchFPB(y, x % y);

    }
}
