
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int W = scan.nextInt();
System.out.println("[INST]9;W;scan.nextInt();"+W);
        int H = scan.nextInt();
System.out.println("[INST]10;H;scan.nextInt();"+H);
        int C = scan.nextInt();
System.out.println("[INST]11;C;scan.nextInt();"+C);
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

