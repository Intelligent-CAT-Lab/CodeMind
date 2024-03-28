import java.util.*;

public class p03646 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int N = 50;
        int[][] A = new int[N][N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                A[i][j] = (j==i+1)?1:0;
            }
        }
        A[N-1][0] = 1;
        int[][] B = new int[N][N];
        B[0] = new int[N][N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                B[i][j] = (i==j)?1:0;
            }
        }
        for(int i=1;i<N;i++){
            B[i] = multiply(B[i-1],A);
        }
        int[][] C = new int[N][N];
        C[0] = new int[N][N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                C[i][j] = (i==j)?1:0;
            }
        }
        for(int i=1;i<N;i++){
            C[i] = add(C[i-1],B[i]);
        }
        System.out.println(N);
        int[] X = new int[N];
        for(int i=0;i<N;i++){
            X[i] = i;
        }
        X = reverse(X);
        if(K==0){
            for(int i=0;i<N;i++){
                System.out.print(X[i]+" ");
            }
        }else{
            int r = (K-1)%N;
            int q = (K-1)/N;
            int[] b = new int[N];
            b[0] = N;
            for(int i=1;i<N;i++){
                b[i] = -1;
            }
            X = multiply(X,B[(r+1)%N]);
            X = add(X,multiply(b,q*C[N-1]+C[r]));
            for(int i=0;i<N;i++){
                System.out.print(X[i]+" ");
            }
        }
    }
    public static int[][] multiply(int[][] A, int[][] B){
        int[][] C = new int[A.length][B[0].length];
        for(int i=0;i<A.length;i++){
            for(int j=0;j<B[0].length;j++){
                for(int k=0;k<B.length;k++){
                    C[i][j] += A[i][k]*B[k][j];
                }
            }
        }
        return C;
    }
    public static int[] add(int[] A, int[] B){
        int[] C = new int[A.length];
        for(int i=0;i<A.length;i++){
            C[i] = A[i]+B[i];
        }
        return C;
    }
    public static int[] reverse(int[] A){
        int[] B = new int[A.length];
        for(int i=0;i<A.length;i++){
            B[i] = A[A.length-1-i];
        }
        return B;
    }
}