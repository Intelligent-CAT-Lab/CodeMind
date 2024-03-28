import java.util.Scanner;
import java.math.BigInteger;

public class p03796 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        BigInteger result = factorial(n);
        System.out.println(result.mod(BigInteger.valueOf(1000000007)));
    }

    private static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}