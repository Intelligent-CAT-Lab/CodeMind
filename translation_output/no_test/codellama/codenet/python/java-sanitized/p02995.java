import java.util.Scanner;
import java.math.BigInteger;

public class p02995 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        sc.close();

        BigInteger lcm = BigInteger.valueOf(c).multiply(BigInteger.valueOf(d)).divide(BigInteger.valueOf(c).gcd(BigInteger.valueOf(d)));
        BigInteger result = BigInteger.valueOf(b).subtract(BigInteger.valueOf(a)).add(BigInteger.ONE).subtract(BigInteger.valueOf(b).divide(BigInteger.valueOf(c)).subtract(BigInteger.valueOf(a).divide(BigInteger.valueOf(c))).subtract(BigInteger.valueOf(b).divide(BigInteger.valueOf(d)).subtract(BigInteger.valueOf(a).divide(BigInteger.valueOf(d))).subtract(BigInteger.valueOf(b).divide(lcm).subtract(BigInteger.valueOf(a).divide(lcm)))));

        System.out.println(result);
    }
}