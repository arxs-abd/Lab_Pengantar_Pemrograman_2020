import java.util.Scanner;

class Nomor2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int b = obj.nextInt();
        int c = obj.nextInt();
        int sum = 0;
        int[][] matriks_a = new int[a][b];
        int[][] matriks_b = new int[b][c];
        int[][] matriks_c = new int[a][c];

        for (int i = 0; i < matriks_a.length; i++) {
            for (int j = 0; j < matriks_a[i].length; j++) {
                matriks_a[i][j] = obj.nextInt();
            }
        }
        for (int i = 0; i < matriks_b.length; i++) {
            for (int j = 0; j < matriks_b[i].length; j++) {
                matriks_b[i][j] = obj.nextInt();
            }
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < c; j++) {
                for (int k = 0; k < b; k++) {
                    sum = sum + matriks_a[i][k] * matriks_b[k][j];
                }
                matriks_c[i][j] = sum;
                sum = 0;
                System.out.print(matriks_c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
