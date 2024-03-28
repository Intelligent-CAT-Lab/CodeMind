import java.util.Scanner;
import java.math.BigInteger;

public class p03266 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        long ans = 0;

        if (k % 2 == 1) {
            ans = (long) Math.pow(n / k, 3);
        } else {
            ans = (long) Math.pow(n / k, 3) + (long) Math.pow((n + k / 2) / k, 3);
        }

        System.out.println(ans);

        scanner.close();
    }
}