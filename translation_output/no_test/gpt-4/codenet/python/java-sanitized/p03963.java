import java.util.Scanner;
import java.math.BigInteger;

public class p03963 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();

        BigInteger kBig = BigInteger.valueOf(k);
        BigInteger result = kBig.multiply(kBig.subtract(BigInteger.ONE).pow(n - 1));
        System.out.println(result);
    }
}