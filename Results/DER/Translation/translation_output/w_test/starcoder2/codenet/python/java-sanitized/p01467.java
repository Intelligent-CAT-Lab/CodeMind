import java.util.*;

public class p01467 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int[] A = new int[input[0].length()];
        int[] B = new int[input[1].length()];
        int K = Integer.parseInt(input[2]);
        for (int i = 0; i < input[0].length(); i++) {
            A[i] = input[0].charAt(i) - '0';
        }
        for (int i = 0; i < input[1].length(); i++) {
            B[i] = input[1].charAt(i) - '0';
        }
        int[] C = new int[A.length];
        System.out.println(solve(A, B, K, A.length - 1, 0));
    }

    public static int solve(int[] A, int[] B, int K, int i, int borrow) {
        if (i == -1) {
            return Integer.parseInt(Arrays.toString(A).replaceAll("[^0-9]", ""));
        }
        if (A[i] - borrow >= B[i]) {
            C[i] = A[i] - borrow - B[i];
            return solve(C, K, i - 1, 0);
        } else {
            C[i] = A[i] - borrow + 10 - B[i];
            if (K > 0) {
                return Math.max(solve(C, K - 1, i - 1, 0), solve(C, K, i - 1, 1));
            } else {
                return solve(C, K, i - 1, 1);
            }
        }
    }
}