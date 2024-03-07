import java.util.Scanner;
import java.math.BigInteger;

public class p03266 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        BigInteger ans = BigInteger.ZERO;
        if (k % 2 == 1) {
            ans = BigInteger.valueOf(n / k).pow(3);
        } else {
            ans = BigInteger.valueOf(n / k).pow(3) + BigInteger.valueOf((n + k / 2) / k).pow(3);
        }
        System.out.println(ans);
    }
}