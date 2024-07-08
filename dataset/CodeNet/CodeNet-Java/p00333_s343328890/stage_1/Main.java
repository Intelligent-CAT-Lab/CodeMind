
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int W = scan.nextInt();
        int H = scan.nextInt();
        int C = scan.nextInt();
        int a = W;
        int b = H;
        int c;

        while (a % b != 0) {
            c = a;
            a = b;
            b = c % a;

        }
        System.out.println((W / b) * (H / b) * C);

    }

}

