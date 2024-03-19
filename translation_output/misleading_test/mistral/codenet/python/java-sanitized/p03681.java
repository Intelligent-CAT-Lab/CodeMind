import java.math.BigInteger;

public class p03681 {
    private static final BigInteger MAX = BigInteger.valueOf(1000000007);
    private static final int N, M;
    private static final BigInteger diff;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();
        diff = BigInteger.valueOf(N - M);
        if (diff.compareTo(BigInteger.ONE) > 0) {
            System.out.println(0);
        } else if (diff.compareTo(BigInteger.ZERO) == 0) {
            System.out.println(factorial(N).multiply(factorial(M)).multiply(BigInteger.valueOf(2)).mod(MAX));
        } else {
            System.out.println(factorial(N).multiply(factorial(M)).mod(MAX));
        }
    }

    private static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}