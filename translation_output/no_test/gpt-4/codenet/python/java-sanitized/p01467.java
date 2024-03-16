import java.util.Scanner;
import java.util.Arrays;

public class p01467 {

    private static int[] A, B, C;
    private static int K;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputA = scanner.next().split("");
        String[] inputB = scanner.next().split("");
        K = scanner.nextInt();
        A = new int[inputA.length];
        B = new int[inputA.length];  // Ensuring B is the same length as A
        C = new int[A.length];
        
        for (int i = 0; i < inputA.length; i++) {
            A[i] = Integer.parseInt(inputA[i]);
        }

        Arrays.fill(B, 0);  // Filling B array with zeros to match the length of A
        for (int i = 0; i < inputB.length; i++) {
            B[B.length - inputB.length + i] = Integer.parseInt(inputB[i]);  // Aligning B end with A end
        }
        
        System.out.println(solve(A.length - 1, 0));
        scanner.close();
    }

    private static int solve(int i, int borrow) {
        if (i == -1) {
            StringBuilder result = new StringBuilder();
            for (int value : C) {
                result.append(value);
            }
            return Integer.parseInt(result.toString());
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
}