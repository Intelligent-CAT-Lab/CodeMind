import java.util.Scanner;

public class p01467 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] A = new int[input[0].length()];
        int[] B = new int[input[1].length()];
        int K = Integer.parseInt(input[2]);
        for (int i = 0; i < input[0].length(); i++) {
            A[i] = Character.getNumericValue(input[0].charAt(i));
        }
        for (int i = 0; i < input[1].length(); i++) {
            B[i] = Character.getNumericValue(input[1].charAt(i));
        }
        B = padZeros(B, Math.max(0, A.length - B.length));
        int n = A.length;
        int[] C = new int[n];
        System.out.println(solve(C, K, n - 1, 0, A, B));
    }
    
    private static int solve(int[] C, int K, int i, int borrow, int[] A, int[] B) {
        if (i == -1) {
            return Integer.parseInt(arrayToString(C));
        }
        if (A[i] - borrow >= B[i]) {
            C[i] = A[i] - borrow - B[i];
            return solve(C, K, i - 1, 0, A, B);
        } else {
            C[i] = A[i] - borrow + 10 - B[i];
            if (K > 0) {
                return Math.max(solve(C, K - 1, i - 1, 0, A, B), solve(C, K, i - 1, 1, A, B));
            } else {
                return solve(C, K, i - 1, 1, A, B);
            }
        }
    }
    
    private static int[] padZeros(int[] input, int numZeros) {
        int[] result = new int[input.length + numZeros];
        for (int i = 0; i < input.length; i++) {
            result[i + numZeros] = input[i];
        }
        return result;
    }
    
    private static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int num : array) {
            sb.append(num);
        }
        return sb.toString();
    }
}