import java.util.Scanner;
public class Nomor1 {

    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);
        int bilangan1 = scan.nextInt();
        int bilangan2 = scan.nextInt();
        System.out.printf("FPB dari %d dan %d = %d", bilangan1, bilangan2, cariFPB(bilangan1,bilangan2));
    }
    public static int cariFPB (int x,int y){
        int z = 0;
        for (int i = 1; i <= (x<y?y:x); i++){
            if (x % i == 0 && y % i ==0);
                z = i;
            
        }
        return z;
    }
}