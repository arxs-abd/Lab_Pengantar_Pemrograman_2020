import java.util.Scanner;
public class Nomor3 {

    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);
        int day = scan.nextInt();
        System.out.println(myDay (day));
    }
    public static String myDay (int day){
        int tahun = day/365;
        int bulan = day%365/30;
        day = day%365%30;
        String str = tahun+ "tahun\n" + bulan + "bulan\n" + day + "hari";
        return str;
    }
}