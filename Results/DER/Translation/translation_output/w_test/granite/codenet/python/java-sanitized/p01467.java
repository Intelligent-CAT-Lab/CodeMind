import java.util.*;

public class p01467 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] A = sc.next().split("");
        String[] B = sc.next().split("");
        int K = sc.nextInt();
        int n = Math.max(A.length, B.length);
        int[] C = new int[n];
        int borrow = 0;
        int i = n - 1;
        while (i >= 0) {
            int a = Integer.parseInt(A[i]);
            int b = Integer.parseInt(B[i]);
            if (a - borrow >= b) {
                C[i] = a - borrow - b;
                borrow = 0;
            } else {
                C[i] = a - borrow + 10 - b;
                borrow = 1;
            }
            i--;
        }
        int result = 0;
        for (int j = 0; j < n; j++) {
            result = result * 10 + C[j];
        }
        System.out.println(result);
    }
}