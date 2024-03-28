import java.util.*;
public class p01467 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];
        for(int i=0;i<n;i++) A[i] = sc.nextInt();
        for(int i=0;i<n;i++) B[i] = sc.nextInt();
        int[] C = new int[n];
        System.out.println(solve(A,B,C,n,k));
    }
    public static int solve(int[] A,int[] B,int[] C,int n,int k){
        if(n==0) return 0;
        if(A[n-1]-C[n-1]>=B[n-1]) C[n-1] = A[n-1]-C[n-1]-B[n-1];
        else{
            C[n-1] = A[n-1]-C[n-1]+10-B[n-1];
            if(k>0) return Math.max(solve(A,B,C,n-1,k-1),solve(A,B,C,n-1,k));
            else return solve(A,B,C,n-1,1);
        }
        return solve(A,B,C,n-1,k);
    }
}