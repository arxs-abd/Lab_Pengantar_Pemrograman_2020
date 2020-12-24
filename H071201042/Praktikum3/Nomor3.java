import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Nomor3 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner (System.in);
        int n,a = 0, b = 1, next;
        n = scan.nextInt();
        if(n>=2)
        {
            System.out.print(a + "" + b);
            for (int count = 2; count < n; count++)
            {
                next = a + b;
                System.out.print(""+ next);
                a = b;
                b = next;
            } 
        }
        else if(n==1)
            System.out.print(a);
        

    }
}
