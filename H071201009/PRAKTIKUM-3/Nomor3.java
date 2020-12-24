import java.util.Scanner;

public class Nomor3 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int n = obj.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            a += b;
            b = a - b;

        }
    }
}
