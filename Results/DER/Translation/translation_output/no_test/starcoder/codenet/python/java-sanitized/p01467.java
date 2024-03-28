import java.util.*;
public class p01467 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        int[] A = new int[s.length];
        int[] B = new int[s.length];
        int K = sc.nextInt();
        for(int i = 0; i < s.length; i++) {
            A[i] = Integer.parseInt(s[i]);
        }
        s = sc.nextLine().split(" ");
        for(int i = 0; i < s.length; i++) {
            B[i] = Integer.parseInt(s[i]);
        }
        int[] C = new int[A.length];
        System.out.println(solve(A,B,C,K,A.length-1,0));
    }
    public static int solve(int[] A, int[] B, int[] C, int K, int i, int borrow) {
        if(i == -1) {
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < C.length; j++) {
                sb.append(C[j]);
            }
            return Integer.parseInt(sb.toString());
        }
        if(A[i] - borrow >= B[i]) {
            C[i] = A[i] - borrow - B[i];
            return solve(A,B,C,K,i-1,0);
        } else {
            C[i] = A[i] - borrow + 10 - B[i];
            if(K > 0) {
                return Math.max(solve(A,B,C,K-1,i-1,0),solve(A,B,C,K,i-1,1));
            } else {
                return solve(A,B,C,K,i-1,1);
            }
        }
    }
}