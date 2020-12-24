import java.util.*;
import java.io.*;

public class PPNomor2 {

   public static void main(String[] args) throws FileNotFoundException {
      Scanner iu = new Scanner (System.in);
      FileWriter filew = null;
      PrintWriter printw = null;
      FileReader filer = null;
      BufferedReader buffr = null;

      try {
         String filePertama = iu.next();                                            
         String fileKedua = iu.next();                                           
         iu.close();
         filer = new FileReader(String.format("%s.txt",filePertama));
         buffr = new BufferedReader(filer);
         filew = new FileWriter(String.format("%s.txt", fileKedua));
         printw = new PrintWriter(filew);

         String tes;

         int max = 0;
         while ((tes = buffr.readLine()) != null){
            max = tes.length() > max ? tes.length() : max;
         }
         filer = new FileReader(String.format("%s.txt",filePertama));
         buffr = new BufferedReader(fr);


         String test;

         while ((test = buffr.readLine()) != null) {
            printw.write(String.format("%"+max+"s\n", test));
         }

      } catch (IOException ioe){
         System.out.println("Gagal");
      } finally {
         try {
            if (filew != null){
               System.out.println("Berhasil");
               filew.close();
            } 
            if (filer != null){
               filer.close();
            }
         } catch (IOException ioe){
            System.out.println(ioe.getMessage());
         }
      }
   }
} 