import java.util.Scanner;
import java.util.Random;

class Nomor2 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		String serialNumber = generateSerial(n, m);
		System.out.println(serialNumber);
	}
	public static String generateSerial (int n, int m) {
		Random random = new Random();
		String str = new String();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=m;j++){
				str+=random.nextInt(9);
			}
			if(i<n)
			    str+="-";
		}
		return str;
	}
}