import java.util.Scanner;

import javax.swing.text.AttributeSet.CharacterAttribute;

public class Nomor1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String kata = scan.nextLine();
        int jumlahChar = kata.length();
        String hex = Integer.toHexString(kata.length()*kata.length());
        kata = kata.replaceAll("\\s+", "").toUpperCase();

        System.out.print("#"+hex);
        for(int i = 0; i<kata.length()/2; i++){
            System.out.print(kata.charAt(i));
        }
        for(int i = (kata.length()/2)-2; i>=0; i--){
            System.out.print(kata.charAt(i));
        }
        switch(hex.charAt(0)){
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
                System.out.printf("%o?",jumlahChar);
                break;
            default:
                System.out.printf("%o!",jumlahChar);
        }
                
    }
}
