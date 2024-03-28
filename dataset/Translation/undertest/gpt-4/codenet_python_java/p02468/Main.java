import java.util.Scanner;
import java.math.BigInteger;

public class p02468 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        scanner.close();

        BigInteger mod = new BigInteger("1000000007");
        BigInteger bm = BigInteger.valueOf(m);
        BigInteger result = bm.modPow(BigInteger.valueOf(n), mod);

        System.out.println(result);
    }
}