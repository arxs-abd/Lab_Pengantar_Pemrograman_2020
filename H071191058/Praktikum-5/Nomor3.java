import java.util.Scanner;
class Nomor3{
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Program ini menentukan berapa tahun & bulan & hari");
        System.out.println("Masukkan angka anda & BIARKAN SAYA BEKERJA !!!");
        int ehem = n.nextInt();

        myDay(ehem);
    }
    public static void myDay(int a){
        int tahun = a / 365;
        a = a % 365;
        int bulan = a / 30;
        a = a % 30;

        System.out.println(tahun + " Tahun");
        System.out.println(bulan + " Bulan");
        System.out.println(a + " Hari");
    }
}