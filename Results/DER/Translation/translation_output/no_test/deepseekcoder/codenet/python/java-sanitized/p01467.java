import java.util.*;

public class p01467 {
    static int[] A, B, C;
    static int K;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] a = scanner.next().split("");
        String[] b = scanner.next().split("");
        K = scanner.nextInt();

        A = new int[a.length];
        B = new int[b.length];
        C = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            A[i] = Integer.parseInt(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            B[i] = Integer.parseInt(b[i]);
        }

        System.out.println(solve(C.length - 1, 0, 0));
    }

    static int solve(int i, int borrow, int k) {
        if (i == -1) {
            return Integer.parseInt(Arrays.toString(C).replaceAll("[\\[\\], ]", ""));
        }
        if (A[i] - borrow >=  B[i]) {
            C[i] = A[i] - borrow - B[i];
            return solve(i - 1, 0, k);
        } else {
            C[i] = A[i] - borrow + 10 - B[i];
            if (K > k) {
                return Math.max(solve(i - 1, 1, k), solve(i - 1, 0, k + 1));
            } else {
                return solve(i - 1, 1, k);
            }
        }
    }
}