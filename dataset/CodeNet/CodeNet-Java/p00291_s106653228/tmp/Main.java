
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int c1 = scan.nextInt();
System.out.println("[INST]9;c1;scan.nextInt();"+c1);
        int c5 = scan.nextInt();
System.out.println("[INST]10;c5;scan.nextInt();"+c5);
        int c10 = scan.nextInt();
System.out.println("[INST]11;c10;scan.nextInt();"+c10);
        int c50 = scan.nextInt();
System.out.println("[INST]12;c50;scan.nextInt();"+c50);
        int c100 = scan.nextInt();
System.out.println("[INST]13;c100;scan.nextInt();"+c100);
        int c500 = scan.nextInt();
System.out.println("[INST]14;c500;scan.nextInt();"+c500);
        if ((c1 * 1 + c5 * 5 + c10 * 10 + c50 * 50 + c100 * 100 + c500 * 500) >= 1000) {

            System.out.println("1");

        } else {
            System.out.println("0");
        }

    }
}

