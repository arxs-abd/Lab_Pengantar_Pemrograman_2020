//Nama  :Adi Indra Muliani
//Nim   :H071201095
import java.util.Scanner;
//import java.util.Arrays;
public class Soal3 {
    public static void main(String[] args) {
        Scanner user= new Scanner(System.in);
        int age = user.nextInt();
        System.out.println(myDay(age));
    } 
    public static String myDay(int age){
        int year, month, day; 
        year= age / 365;
        age= age % 365; 
        month= age /30;
        day= age % 30;

        return year + " year \n" + month + " month \n" + day + " day \n";
    } 

        
} 

