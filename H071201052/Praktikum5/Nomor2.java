import java.util.*;
public class Nomor2{
    public static void main(String[] args) {
        Scanner iu = new Scanner(System.in);
        int n = iu.nextInt();
        int m = iu.nextInt();
        String serialNumber = generateSerial(n,m);
        System.out.println(serialNumber);
    }
    public static String generateSerial (int n,int m) {
        Random number = new Random();
        String str = "";
       
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int a = number.nextInt(10);
                str += a;
            }
            if(i < (n-1)){
                str+= "-";
            }
        }
        return str;
    }
} 