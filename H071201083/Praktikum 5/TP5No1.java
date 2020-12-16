import java.util.Scanner;
public class Tp5No1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int fpb = cariFPB(n,m);
        System.out.println("FPB dari "+n+" dan "+m+" = "+fpb);
    }
    public static int cariFPB(int a,int b){
       int r = a%b;
        while(r!=0){
            a = b;
            b = r;
            r = a%b;
        }return b;

    }
}

