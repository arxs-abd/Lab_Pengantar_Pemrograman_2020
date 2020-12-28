import java.util.Scanner;

class Nomor2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Masukkan X :");
        int x = obj.nextInt();
        System.out.print("Masukkan Y :");
        int y = obj.nextInt();

        for (int i = 1; i <= y; i++) {
            if (i % x == 0) {
                System.out.println(i + " ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
