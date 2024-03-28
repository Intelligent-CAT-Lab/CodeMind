import java.util.*;

public class p01467 {
    public static int solve(int[] A, int[] B, int K, int i, int borrow) {
        if (i == -1) {
            int sum = 0;
            for (int j = 0; j < A.length; j++) {
                sum = sum * 10 + A[j];
            }
            return sum;
        }
        if (A[i] - borrow >= B[i]) {
            A[i] -= borrow + B[i];
            return solve(A, B, K, i - 1, 0);
        } else {
            A[i] -= borrow + 10 - B[i];
            if (K > 0) {
                int without = solve(A, B, K - 1, i - 1, 0);
                int with = solve(A, B, K, i - 1, 1);
                return Math.max(without, with);
            } else {
                return solve(A, B, K, i - 1, 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int[] A = new int[input.length];
        int[] B = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            A[i] = Integer.parseInt(input[i]);
        }
        input = sc.nextLine().split(" ");
        for (int i = 0; i < input.length; i++) {
            B[i] = Integer.parseInt(input[i]);
        }
        int K = sc.nextInt();
        int n = Math.max(A.length, B.length);
        A = Arrays.copyOf(A, n);
        B = Arrays.copyOf(B, n);
        int[] C = new int[n];
        System.out.println(solve(A, B, K, n - 1, 0));
    }
}