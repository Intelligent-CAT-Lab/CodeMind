import java.util.Scanner;

public class p01467 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        
        int[] A = new int[input[0].length()];
        int[] B = new int[input[1].length()];
        
        for (int i = 0; i < A.length; i++) {
            A[i] = input[0].charAt(i) - '0';
        }
        for (int i = 0; i < B.length; i++) {
            B[i] = input[1].charAt(i) - '0';
        }
        
        int K = Integer.parseInt(input[2]);
        int n = A.length;
        B = prependZeros(B, n);
        int[] C = new int[n];
        
        System.out.println(solve(C, A, B, K, n - 1, 0));
    }
    
    private static int[] prependZeros(int[] B, int length) {
        if (B.length < length) {
            int[] newB = new int[length];
            int offset = length - B.length;
            for (int i = offset; i < length; i++) {
                newB[i] = B[i - offset];
            }
            return newB;
        }
        return B;
    }
    
    private static int solve(int[] C, int[] A, int[] B, int K, int i, int borrow) {
        if (i == -1) {
            return arrayToInt(C);
        }
        if (A[i] - borrow >= B[i]) {
            C[i] = A[i] - borrow - B[i];
            return solve(C, A, B, K, i - 1, 0);
        } else {
            C[i] = A[i] - borrow + 10 - B[i];
            if (K > 0) {
                return Math.max(solve(copyArray(C), A, B, K - 1, i - 1, 0),
                                solve(C, A, B, K, i - 1, 1));
            } else {
                return solve(C, A, B, K, i - 1, 1);
            }
        }
    }
    
    private static int[] copyArray(int[] C) {
        int[] newC = new int[C.length];
        System.arraycopy(C, 0, newC, 0, C.length);
        return newC;
    }
    
    private static int arrayToInt(int[] C) {
        StringBuilder sb = new StringBuilder();
        for (int digit : C) {
            sb.append(digit);
        }
        return Integer.parseInt(sb.toString());
    }
}