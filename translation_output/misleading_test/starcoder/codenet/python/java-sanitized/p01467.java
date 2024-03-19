import java.util.*;
public class p01467 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];
        int k = sc.nextInt();
        for(int i=0;i<n;i++) A[i] = sc.nextInt();
        for(int i=0;i<n;i++) B[i] = sc.nextInt();
        System.out.println(solve(A,B,k));
    }
    public static int solve(int[] A,int[] B,int k){
        int n = A.length;
        int[] C = new int[n];
        return solve(A,B,C,k,n-1,0);
    }
    public static int solve(int[] A,int[] B,int[] C,int k,int i,int borrow){
        if(i == -1) return toInt(C);
        if(A[i] - borrow >= B[i]) {
            C[i] = A[i] - borrow - B[i];
            return solve(A,B,C,k,i-1,0);
        } else {
            C[i] = A[i] - borrow + 10 - B[i];
            if(k > 0) return Math.max(solve(A,B,C,k-1,i-1,0),solve(A,B,C,k,i-1,1));
            else return solve(A,B,C,k,i-1,1);
        }
    }
    public static int toInt(int[] A) {
        int ans = 0;
        for(int i=0;i<A.length;i++) ans = ans * 10 + A[i];
        return ans;
    }
}