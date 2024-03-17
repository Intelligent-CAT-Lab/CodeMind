import java.math.BigInteger;

public class p02333 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        BigInteger modulo = BigInteger.valueOf(1000000007);
        BigInteger ans = BigInteger.ZERO;
        if (k <= n) {
            for (int i = 0; i < k; i++) {
                if (i % 2 == 0) {
                    ans = ans.add(BigInteger.valueOf(k - i).pow(n).multiply(combination(k, i)));
                } else {
                    ans = ans.subtract(BigInteger.valueOf(k - i).pow(n).multiply(combination(k, i)));
                }
            }
            ans = ans.mod(modulo);
        }
        System.out.println(ans);
    }

    public static BigInteger combination(int n, int k) {
        BigInteger ans = BigInteger.ONE;
        for (int i = n; i > n - k; i--) {
            ans = ans.multiply(BigInteger.valueOf(i));
        }
        for (int i = k; i > 1; i--) {
            ans = ans.divide(BigInteger.valueOf(i));
        }
        return ans;
    }
}