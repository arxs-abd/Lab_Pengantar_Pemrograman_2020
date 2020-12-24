import java.util.*;
class Nomor1{
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        
            System.out.println("Program ini menentukan FPB");
            System.out.println("BIARKAN SAYA BEKERJA");
            System.out.println("masukkan angka awal");
            int N = n.nextInt();
            System.out.println("masukkan angka kedua");
            int M = n.nextInt();

            System.out.println("FPB dari " + N + " dan " + M +" adalah " + FPB ( N ,M));
        }
          static int FPB(int angka1,int angka2){
                 do{
                     int n = angka2;
                     angka2 = angka1 % angka2;
                     angka1 = n;
                 }while (angka2 != 0);
           
                 return angka1;
            
          }
          
    }