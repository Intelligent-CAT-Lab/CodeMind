import java.util.Scanner;

public class p01467 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int[] A = toIntArray(input[0]);
        int[] B = toIntArray(input[1]);
        int K = Integer.parseInt(input[2]);

        int n = A.length;
        B = extendArray(B, n);
        int[] C = new int[n];

        System.out.println(solve(C, K, n - 1, 0));
        sc.close();
    }

    private static int[] extendArray(int[] B, int newLength) {
        int[] extended = new int[newLength];
        int fillLength = newLength - B.length;
        for (int i = 0; i < fillLength; i++) {
            extended[i] = 0;
        }
        System.arraycopy(B, 0, extended, fillLength, B.length);
        return extended;
    }

    private static int[] toIntArray(String s) {
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = Character.getNumericValue(s.charAt(i));
        }
        return arr;
    }

    private static int solve(int[] C, int K, int i, int borrow) {
        if (i == -1) {
            return Integer.parseInt(arrToString(C));
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

    private static String arrToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i : arr) {
            sb.append(i);
        }
        return sb.toString();
    }

    //