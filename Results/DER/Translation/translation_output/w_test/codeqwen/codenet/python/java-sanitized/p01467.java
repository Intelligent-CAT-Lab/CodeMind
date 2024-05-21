import java.util.Arrays;
import java.util.Scanner;

public class p01467 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] A = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();
        input = scanner.nextLine().split(" ");
        int[] B = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();
        int K = scanner.nextInt();
        int n = A.length;
        B = Arrays.copyOf(B, Math.max(0, n - B.length));
        int[] C = new int[n];
        System.out.println(solve(C, K, n - 1, 0));
    }

    public static int solve(int[] C, int K, int i, int borrow) {
        if (i == -1) {
            return Integer.parseInt(Arrays.stream(C).mapToObj(String::valueOf).reduce((a, b) -> a + b).orElse("0"));
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