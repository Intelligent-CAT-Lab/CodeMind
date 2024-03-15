
```
N = int(input())
for h in range(1, 3501):
    for n in range(1, 3501):
        if 4 * h * n - N * n - N * h != 0 and (N * h * n) % (4 * h * n - N * n - N * h) == 0 and (N * h * n) / (4 * h * n - N * n - N * h) > 0:
            print(h, n, int((N * h * n) / (4 * h * n - N * n - N * h)))
            exit()
```

## 03590

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;

public class p03590 {
    
    public static void main(String[] args) {
        new p03590().solve();
    }
    
    void solve(){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] A=new int[N];
        for(int i=0;i<N;i++) {
            A[i]=sc.nextInt();
        }
        int[] B=new int[N];
        for(int i=0;i<N;i++) {
            B[i]=sc.nextInt();
        }
        int[] C=new int[N];
        for(int i=0;i<N;i++) {
            C[i]=sc.nextInt();
        }
        int[] D=new int[N];
        for(int i=0;i<N;i++) {
            D[i]=sc.nextInt();
        }
        int[] E=new int[N];
        for(int i=0;i<N;i++) {
            E[i]=sc.nextInt();
        }
        int[] F=new int[N];
        for(int i=0;i<N;i++) {
            F[i]=sc.nextInt();
        }
        int[] G=new int[N];
        for(int i=0;i<N;i++) {
            G[i]=sc.nextInt();
        }
        int[] H=new int[N];
        for(int i=0;i<N;i++) {
            H[i]=sc.nextInt();
        }
        int[] I=new int[N];
        for(int i=0;i<N;i++) {
            I[i]=sc.nextInt();
        }
        int[] J=new int[N];
        for(int i=0;i<N;i++) {
            J[i]=sc.nextInt();
        }
        int[] K=new int[N];
        for(int i=0;i<N;i++) {
            K[i]=sc.nextInt();
        }
        int[] L=new int[N];
        for(int i=0;i<N;i++) {
            L[i]=sc.nextInt();
        }
        int[] M=new int[N];
        for(int i=0;i<N;i++) {
            M[i]=sc.nextInt();
        }
        int[] O=new int[N];
        for(int i=0;i<N;i++) {
            O[i]=sc.nextInt();
        }
        int[] P=new int[N];
        for(int i=0;i<N;i++) {
            P[i]=sc.nextInt();
        }
        int[] Q=new int[N];
        for(int i=0;i<N;i++) {
            Q[i]=sc.nextInt();
        }
        int[] R=new int[N];
        for(int i=0;i<N;i++) {
            R[i]=sc.nextInt();
        }
        int[] S=new int[N];
        for(int i=0;i<N;i++) {
            S[i]=sc.nextInt();
        }
        int[] T=new int[N];
        for(int i=0;i<N;i++) {
            T[i]=sc.nextInt();
        }
        int[] U=new int[N];
        for(int i=0;i<N;i++) {
            U[i]=sc.nextInt();
        }
        int[] V=new int[N];
        for(int i=0;i<N;i++) {
            V[i]=sc.nextInt();
        }
        int[] W=new int[N];
        for(int i=0;i<N;i++) {
            W[i]=sc.nextInt();
        }
        int[] X=new int[N];
        for(int i=0;i<N;i++) {
            X[i]=sc.nextInt();
        }
        int[] Y=new int[N];
        for(int i=0;i<N;i++) {
            Y[i]=sc.nextInt();
        }
        int[] Z=new int[N];
        for(int i=0;i<N;i++) {
            Z[i]=sc.nextInt();
        }
        int[] AA=new int[N];
        for(int i=0;i<N;i++) {
            AA[i]=sc.nextInt();
        }
        int[] AB=new int[N];
        for(int i=0;i<N;i++) {
            AB[i]=sc.nextInt();
        }
        int[] AC=new int[N];
        for(int i=0;i<N;i++) {
            AC[i]=sc.nextInt();
        }
        int[] AD=new int[N];
        for(int i=0;i<N;i++) {
            AD[i]=sc.nextInt();
        }
        int[] AE=new int[N];
        for(int i=0;i<N;i++) {
            AE[i]=sc.nextInt();
        }
        int[] AF=new int[N];
        for(int i=0;i<N;i++) {
            AF[i]=sc.nextInt();
        }
        int[] AG=new int[N];
        for(int i=0;i<N;i++) {
            AG[i]=sc.nextInt();
        }
        int[] AH=new int[N];
        for(int i=0;i<N;i++) {
            AH[i]=sc.nextInt();
        }
        int[] AI=new int[N];
        for(int i=0;i<N;i++) {
            AI[i]=sc.nextInt();
        }
        int[] AJ=new int[N];
        for(int i=0;i<N;i++) {
            AJ[i]=sc.nextInt();
        }
        int[] AK=new int[N];
        for(int i=0;i<N;i++) {
            AK[i]=sc.nextInt();
        }
        int[] AL=new int[N];
        for(int i=0;i<N;i++) {
            
