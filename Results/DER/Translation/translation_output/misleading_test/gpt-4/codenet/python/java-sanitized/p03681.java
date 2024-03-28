import java.util.Scanner;
import java.math.BigInteger;

public class p03681 {
    public static void main(String[] args) {
        final long MAX = (long) Math.pow(10, 9) + 7;
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int diff = N - M;

        if (Math.abs(diff) > 1) {
            System.out.println(0);
        } else if (diff == 0) {
            System.out.println(factorial(N).multiply(factorial(M)).multiply(BigInteger.valueOf(2)).mod(BigInteger.valueOf(MAX)));
        } else {
            System.out.println(factorial(N).multiply(factorial(M)).mod(BigInteger.valueOf(MAX)));
        }
    }

    public static BigInteger factorial(int number) {
        BigInteger result = BigInteger.ONE;
        for (int factor = 2; factor <= number; factor++) {
            result = result.multiply(BigInteger.valueOf(factor));
        }
        return result;
    }
}