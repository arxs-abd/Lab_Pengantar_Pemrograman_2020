import java.util.Scanner;
public class Nomor1{
    
    public static void main(String[] args) {
        Scanner iu= new Scanner(System.in);
        System.out.println("input panjang array :");
        int n= iu.nextInt();
        int[] data= new int[n];
      
        for(int i = 0; i < n ; i++){
            data [i]=iu.nextInt();
        }
        System.out.println();

        for(int i = 0; i < n; i++) {
            for(int j = i; j < n ; j++) {
                if(data[i] % data[j] != 0 && data[j] % data[i] != 0)
                System.out.println(data[i] + " " + data[j]);
            }
        }
    }
}