import java.util.*;

public class p01467 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] A = sc.next().split("");
        String[] B = sc.next().split("");
        int K = sc.nextInt();
        int n = A.length;
        B = new String[Math.max(0, n - B.length)] + B;
        int[] C = new int[n];
        System.out.println(solve(C, K, n - 1, 0));
    }

    public static int solve(int[] C, int K, int i, int borrow) {
        if (i == -1) {
            return Integer.parseInt(String.join("", Arrays.stream(C).mapToObj(String::valueOf).toArray(String[]::new)));
        }
        if (Integer.parseInt(A[i]) - borrow >= Integer.parseInt(B[i])) {
            C[i] = Integer.parseInt(A[i]) - borrow - Integer.parseInt(B[i]);
            return solve(C, K, i - 1, 0);
        } else {
            C[i] = Integer.parseInt(A[i]) - borrow + 10 - Integer.parseInt(B[i]);
            if (K > 0) {
                return Math.max(solve(C, K - 1, i - 1, 0), solve(C, K, i - 1, 1));
            } else {
                return solve(C, K, i - 1, 1);
            }
        }
    }
}