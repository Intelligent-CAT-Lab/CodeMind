
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int c1 = scan.nextInt();
        int c5 = scan.nextInt();
        int c10 = scan.nextInt();
        int c50 = scan.nextInt();
        int c100 = scan.nextInt();
        int c500 = scan.nextInt();
        if ((c1 * 1 + c5 * 5 + c10 * 10 + c50 * 50 + c100 * 100 + c500 * 500) >= 1000) {

            System.out.println("1");

        } else {
            System.out.println("0");
        }

    }
}

