import java.util.Scanner;

public class p01467 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int K = Integer.parseInt(input[2]);

        int result = solve(A, B, K, A.length() - 1, 0);
        System.out.println(result);
    }

    public static int solve(int A, int B, int K, int i, int borrow) {
        if (i == -1) {
            return Integer.parseInt(String.valueOf(A));
        }
        int[] C = new int[i + 1];
        if (A.charAt(i) - '0' - borrow >= B.charAt(i) - '0') {
            C[i] = A.charAt(i) - '0' - borrow - (B.charAt(i) - '0');
            return solve(C, K, i - 1, 0);
        } else {
            C[i] = A.charAt(i) - '0' - borrow + 10 - (B.charAt(i) - '0');
            if (K > 0) {
                return Math.max(solve(C, K - 1, i - 1, 0), solve(C, K, i - 1, 1));
            } else {
                return solve(C, K, i - 1, 1);
            }
        }
    }
}