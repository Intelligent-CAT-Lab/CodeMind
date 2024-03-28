import java.util.*;

public class p01467 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] A = scanner.nextLine().split(" ");
        String[] B = scanner.nextLine().split(" ");
        int K = scanner.nextInt();
        scanner.nextLine();

        int[] a = new int[A.length];
        int[] b = new int[B.length];
        int[] c = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            a[i] = Integer.parseInt(A[i]);
        }

        for (int i = 0; i < B.length; i++) {
            b[i] = Integer.parseInt(B[i]);
        }

        int n = a.length;
        b = Arrays.copyOf(b, Math.max(0, n - b.length));
        c = new int[n];

        System.out.println(solve(c, K, n - 1, 0, a, b));
    }

    public static int solve(int[] C, int K, int i, int borrow, int[] A, int[] B) {
        if (i == -1) {
            return Integer.parseInt(Arrays.toString(C).replaceAll("[\\[\\],]", ""));
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