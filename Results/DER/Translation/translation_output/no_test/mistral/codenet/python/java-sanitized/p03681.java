import java.math.BigInteger;
import java.util.Scanner;

public class p03681 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger N = new BigInteger(scanner.nextLine());
        BigInteger M = new BigInteger(scanner.nextLine());
        BigInteger diff = N.subtract(M);
        if (diff.compareTo(BigInteger.ONE) > 0) {
            System.out.println(0);
        } else if (diff.compareTo(BigInteger.ZERO) == 0) {
            System.out.println(factorial(N).multiply(factorial(M)).multiply(BigInteger.valueOf(2)).mod(BigInteger.valueOf(1000000007)));
        } else {
            System.out.println(factorial(N).multiply(factorial(M)).mod(BigInteger.valueOf(1000000007)));
        }
    }

    public static BigInteger factorial(BigInteger n) {
        BigInteger result = BigInteger.ONE;
        for (BigInteger i = BigInteger.ONE; i.compareTo(n) <= 0; i = i.add(BigInteger.ONE)) {
            result = result.multiply(i);
        }
        return result;
    }
}