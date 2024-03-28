import java.util.Scanner;

public class p01467 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int[] A = new int[input.length];
        int[] B = new int[input.length];
        int K = Integer.parseInt(input[input.length - 1]);
        for (int i = 0; i < input.length - 1; i++) {
            A[i] = Integer.parseInt(input[i]);
            B[i] = Integer.parseInt(input[i + 1]);
        }
        int[] C = new int[A.length];
        System.out.println(solve(C, K, A.length - 1, 0));
    }

    public static int solve(int[] C, int K, int i, int borrow) {
        if (i == -1) {
            return Integer.parseInt(String.join("", C));
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