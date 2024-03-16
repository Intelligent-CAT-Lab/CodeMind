import java.util.*;

public class p01467 {
    static int[] A, B, C;
    static int K, n;

    static int solve(int i, int borrow) {
        if (i == -1) {
            StringBuilder sb = new StringBuilder();
            for (int num : C) {
                sb.append(num);
            }
            return Integer.parseInt(sb.toString());
        }
        if (A[i] - borrow >= B[i]) {
            C[i] = A[i] - borrow - B[i];
            return solve(i - 1, 0);
        } else {
            C[i] = A[i] - borrow + 10 - B[i];
            if (K > 0) {
                return Math.max(solve(i - 1, 0), solve(i - 1, 1));
            } else {
                return solve(i - 1, 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputA = scanner.next().split("");
        String[] inputB = scanner.next().split("");
        K = scanner.nextInt();
        A = new int[inputA.length];
        B = new int[inputB.length];
        C = new int[inputA.length];
        n = inputA.length;
        for (int i = 0; i < inputA.length; i++) {
            A[i] = Integer.parseInt(inputA[i]);
        }
        for (int i = 0; i < inputB.length; i++) {
            B[i] = Integer.parseInt(inputB[i]);
        }
        B = Arrays.copyOf(B, Math.max(0, n - B.length) + B.length);
        System.out.println(solve(n - 1, 0));
    }
}