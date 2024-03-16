import java.util.Scanner;
import java.math.BigInteger;

public class p02333 {

    public static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public static BigInteger combination(int i, int j) {
        return factorial(i).divide(factorial(i - j)).divide(factorial(j));
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] parts = scanner.nextLine().split(" ");
        int n = Integer.parseInt(parts[0]);
        int k = Integer.parseInt(parts[1]);
        BigInteger modulo = BigInteger.valueOf(10).pow(9).add(BigInteger.valueOf(7));
        BigInteger ans = BigInteger.ZERO;

        if (k <= n) {
            for (int i = 0; i < k; i++) {
                BigInteger term = BigInteger.valueOf(k - i).pow(n).multiply(combination(k, i));
                if (i % 2 == 0) {
                    ans = ans.add(term);
                } else {
                    ans = ans.subtract(term);
                }
            }
            ans = ans.mod(modulo);
        }

        System.out.println(ans);
        scanner.close();
    }
}