import java.util.Scanner;
public class PPNomor2{
  
    public static void main(String[] args) {
    Scanner iu = new Scanner(System.in);
    String kalimat = iu.nextLine();
    String kalimatBaru ="";
    for(int i=0;i<kalimat.length();i++){
      if(i%2==0){
        kalimatBaru += (kalimat.charAt(i));
      }
      else{
        kalimatBaru += (int)(kalimat.charAt(i));
      }
    
    }
    int attack =0;
    for(int i=0;i<4;i++){
      for (int j =0;j<4 ;j++) {
        for (int k=0;k<Math.ceil((double)kalimatBaru.length()/16);k++) {
          if(attack<kalimatBaru.length()){
            System.out.print(kalimatBaru.charAt(attack));
            attack++;
          }
          else{
            System.out.print("?");
          }

        }
        System.out.print(" ");
      }
      System.out.println();
    }
  }


}