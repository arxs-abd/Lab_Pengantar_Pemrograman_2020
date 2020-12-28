import java.util.Scanner;
class Nomor3 {
    public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    int x = obj.nextInt();

   myDay(x);
    }
    public static void myDay (int x) {
        int tahun = x / 365;
        int bulan = (x % 365) / 30;
        int hari = (x % 365) % 30;
        System.out.printf(" %d tahun\n %d bulan\n %d hari\n", tahun,bulan,hari);
    }
}