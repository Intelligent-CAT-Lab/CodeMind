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
        
        int n = input[0].length();
        if (n > input[1].length()) {
            int[] temp = new int[n - input[1].length()];
            B = concatenateArrays(temp, B);
        }
        
        int[] C = new int[n];
        
        System.out.println(solve(C, A, B, K, n - 1, 0));
    }
    
    public static int solve(int[] C, int[] A, int[] B, int K, int i, int borrow) {
        if (i == -1) {
            StringBuilder sb = new StringBuilder();
            for (int num : C) {
                sb.append(num);
            }
            return Integer.parseInt(sb.toString());
        }
        
        if (A[i] - borrow >= B[i]) {
            C[i] = A[i] - borrow - B[i];
             return solve(C, A, B, K, i - 1, 0);
        } else {
             C[i] = A[i] - borrow + 10 - B[i];
             if (K > 0) {
                 return Math.max(solve(C, A, B, K - 1, i - 1, 0), solve(C, A, B, K, i - 1, 1));
             } else {
                 return solve(C, A, B, K, i - 1, 1);
             }
        }
    }
    
    public static int[] concatenateArrays(int[] arr1, int[] arr2) {
        int[] result = new int[arr