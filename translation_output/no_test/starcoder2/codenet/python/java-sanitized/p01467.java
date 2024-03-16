import java.util.*;

public class p01467 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        int K = sc.nextInt();
        int n = A.length();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = A.charAt(i) - '0';
            b[i] = B.charAt(i) - '0';
        }
        int[] c = new int[n];
        System.out.println(solve(a, b, K, n - 1, 0));
    }

    public static int solve(int[] a, int[] b, int K, int i, int borrow) {
        if (i == -1) {
            return toInt(a);
        }
        if (a[i] - borrow >= b[i]) {
            a[i] = a[i] - borrow - b[i];
            return solve(a, b, K, i - 1, 0);
        } else {
            a[i] = a[i] - borrow + 10 - b[i];
            if (K > 0) {
                return Math.max(solve(a, b, K - 1, i - 1, 0), solve(a, b, K, i - 1, 1));
            } else {
                return solve(a, b, K, i - 1, 1);
            }
        }
    }

    public static int toInt(int[] a) {
        int n = a.length;
        int res = 0;
        for (int i = 0; i < n; i++) {
            res = res * 10 + a[i];
        }
        return res;
    }
}