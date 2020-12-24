import java.util.Scanner;
public class Nomor2 {

    public static void main(String[] args) {
        Scanner iu = new Scanner(System.in);
        int i = iu.nextInt();
        int j = iu.nextInt();
        int k = iu.nextInt();
        int [][] matriksA = new int [i][j];
        int [][] matriksB = new int [j][k];
        
        System.out.println("input matriks A :");
        for(int a= 0; a < i; a++) {
            for(int b = 0; b < j; b++) {
                matriksA [a][b] = iu.nextInt(); 
            }
        }
        System.out.println("input matriks B :");
        for(int b = 0; b < j; b++) {
            for(int c = 0; c < k; c++) {
                matriksB  [b][c] = iu.nextInt();
            }
        }
        System.out.println();

        //matriks a dikali matriks b
        for (int a = 0; a < i; a++) {
            for(int c = 0; c < k; c++) {
                int hasil = 0;
                for(int b = 0; b < j; b++) {
                    hasil = hasil + matriksA[a][b] * matriksB[b][c];  
                }
                System.out.print(hasil + " ");
            }
            System.out.println();
        }   
    
    }
} 