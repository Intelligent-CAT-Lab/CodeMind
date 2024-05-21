import java.util.*;

public class p02335 {
    static long MOD = (long)Math.pow(10,9)+7;
    public static long P(int n, int r) {
        return factorial(n) / factorial(n - r);
    }
    public static long C(int n, int r) {
        return P(n, r) / factorial(r);
    }
    public static long H(int n, int r) {
        return C(n + r - 1, r);
    }
    public static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long result = 0;
        if (n < k) {
            result = 0;
        } else if (n > k) {
            result = C(k, n) % MOD;
        } else {
            result = 1;
        }
        System.out.println(result);
    }
}