import java.util.Scanner;
import java.math.BigInteger;

public class p02333 {

    public static BigInteger combination(int i, int j) {
        BigInteger result = factorial(i).divide(factorial(i - j)).divide(factorial(j));
        return result;
    }

    public static BigInteger factorial(int number) {
        BigInteger result = BigInteger.ONE;
        for (int factor = 2; factor <= number; factor++) {
            result = result.multiply(BigInteger.valueOf(factor));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        scanner.close();

        BigInteger modulo = BigInteger.valueOf(1000000007);
        BigInteger ans = BigInteger.ZERO;

        if (k <= n) {
            for (int i = 0; i < k; i++) {
                BigInteger temp = BigInteger.valueOf(k - i).pow(n).multiply(combination(k, i));
                if (i % 2 == 0) {
                    ans = ans.add(temp);
                } else {
                    ans = ans.subtract(temp);
                }
            }
            ans = ans.mod(modulo);
        }

        System.out.println(ans);
    }
}