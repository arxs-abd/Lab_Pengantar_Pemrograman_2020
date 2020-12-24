import java.util.Scanner;

public class Nomor2 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();

        for(int i = 1;i<=y;i++)
        {
            if(i%x!=0)
                System.out.print(i+" ");
            else
            System.out.println(i);
        }
    }    
}
