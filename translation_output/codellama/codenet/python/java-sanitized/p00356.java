import java.util.Scanner;
import java.math.BigInteger;

public class p00356 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        BigInteger gcd = a.gcd(b);
        BigInteger result = a.add(b).subtract(gcd).add(BigInteger.ONE);
        System.out.println(result);
    }
}