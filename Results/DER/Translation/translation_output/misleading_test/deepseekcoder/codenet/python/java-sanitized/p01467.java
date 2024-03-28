import java.util.*;

public class p01467 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] A = scanner.next().split(" ");
        String[] B = scanner.next().split(" ");
        int K = scanner.nextInt();
        int n = A.length;
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(A[i]);
            b[i] = Integer.parseInt(B[i]);
        }
        System.out.println(solve(c, K, n - 1, 0, a, b));
    }

    public static int solve(int[] C, int K, int i, int borrow, int[] A, int[] B) {
        if (i == -1) {
            return Integer.parseInt(Arrays.toString(C).replace("[", "").replace("]", "").replace(" ", ""));
        }
        if (A[i] - borrow >= B[i]) {
            C[i] = A[i] - borrow - B[i];
            return solve(C, K, i - 1, 0, A, B);
        } else {
            C[i] = A[i] - borrow + 10 - B[i];
            if (K > 0) {
                return Math.max(solve(C, K - 1, i - 1, 0, A, B), solve(C, K, i - 1, 1, A, B));
            } else {
                return solve(C, K, i - 1, 1, A, B);
            }
        }
    }
}