import java.util.Scanner;

public class Pratikum6No2 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String kalimat = read.nextLine();
        String kalimat2 = "";
        for (int i = 0; i <= kalimat.length()-1; i++) {
            if (i%2 == 0) {
                char karakter = kalimat.charAt(i);
                kalimat2 += karakter;
            } else if (i%2 != 0) {
                int angka = kalimat.codePointAt(i);
                kalimat2 += angka;
            }
        } while (kalimat2.length()%16 != 0) {
            kalimat2 += "?";
        }
        String[][] matrix = new String[4][4];
        int n = 0;
        int split = kalimat2.length()/16;
        int batas = split;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = "";
                for (int k = n; k < split; k++) {
                    matrix[i][j] += kalimat2.charAt(k);
                }
                n = split;
                split += batas;
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}