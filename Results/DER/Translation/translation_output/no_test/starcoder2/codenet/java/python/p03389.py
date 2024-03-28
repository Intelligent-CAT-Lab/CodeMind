
```
A, B, C = map(int, input().split())
M = max(A, max(B, C))
if (A+B+C)%2 == M%2:
    print((3*M-(A+B+C))/2)
else:
    print(((3*M+3)-(A+B+C))/2)
```

## 3390

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;
public class p03390 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        int[] C = new int[N];
        int[] D = new int[N];
        for(int i=0; i<N; i++) {
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
            C[i] = sc.nextInt();
            D[i] = sc.nextInt();
        }
        int[] E = new int[M];
        int[] F = new int[M];
        for(int i=0; i<M; i++) {
            E[i] = sc.nextInt();
            F[i] = sc.nextInt();
        }
        for(int i=0; i<M; i++) {
            int min = 1000000000;
            for(int j=0; j<N; j++) {
                int dist = Math.abs(E[i]-A[j])+Math.abs(F[i]-B[j]);
                if(dist < min) {
                    min = dist;
                }
                dist = Math.abs(E[i]-C[j])+Math.abs(F[i]-D[j]);
                if(dist < min) {
                    min = dist;
                }
            }
            System.out.println(min);
        }
    }

}

```

python code:
```
N, M = map(int, input().split())
A = []
B = []
C = []
D = []
for i in range(N):
    a, b, c, d = map(int, input().split())
    A.append(a)
    B.append(b)
    C.append(c)
    D.append(d)
E = []
F = []
for i in range(M):
    e, f = map(int, input().split())
    E.append(e)
    F.append(f)
for i in range(M):
    min = 1000000000
    for j in range(N):
        dist = abs(E[i]-A[j])+abs(F[i]-B[j])
        if dist < min:
            min = dist
        dist = abs(E[i]-C[j])+abs(F[i]-D[j])
        if dist < min:
            min = dist
    print(min)
```

## 3391

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;
public class p03391 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        for(int i=0; i<N; i++) {
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
        }
        int[] C = new int[N];
        int[] D = new int[N];
        for(int i=0; i<N; i++) {
            C[i] = sc.nextInt();
            D[i] = sc.nextInt();
        }
        int[] E = new int[N];
        int[] F = new int[N];
        for(int i=0; i<N; i++) {
            E[i] = sc.nextInt();
            F[i] = sc.nextInt();
        }
        int[] G = new int[N];
        int[] H = new int[N];
        for(int i=0; i<N; i++) {
            G[i] = sc.nextInt();
            H[i] = sc.nextInt();
        }
        int[] I = new int[N];
        int[] J = new int[N];
        for(int i=0; i<N; i++) {
            I[i] = sc.nextInt();
            J[i] = sc.nextInt();
        }
        int[] K = new int[N];
        int[] L = new int[N];
        for(int i=0; i<N; i++) {
            K[i] = sc.nextInt();
            L[i] = sc.nextInt();
        }
        int[] M = new int[N];
        int[] O = new int[N];
        for(int i=0; i<N; i++) {
            M[i] = sc.nextInt();
            O[i] = sc.nextInt();
        }
        int[] P = new int[N];
        int[] Q = new int[N];
        for(int i=0; i<N; i++) {
            P[i] = sc.nextInt();
            Q[i] = sc.nextInt();
        }
        int[] R = new int[N];
        int[] S = new int[N];
        for(int i=0; i<N; i++) {
            R[i] = sc.nextInt();
            S[i] = sc.nextInt();
        }
        int[] T = new int[N];
        int[] U = new int[N];
        for(int i=0; i<N; i++) {
            T[i] = sc.nextInt();
            U[i] = sc.nextInt();
        }
        int[] V = new int[N];
        int[] W = new int[N];
        for(int i=0; i<N; i++) {
            V[i] = sc.nextInt();
            W[i] = sc.nextInt();
        }
        int[] X = new int[N];
        int[] Y = new int[N];
        for(int i=0; i<N; i++) {
            X[i] = sc.nextInt();
            Y[i] = sc.nextInt();
        }
        int[] Z = new int[N];
        int[] AA = new int[N];
        for(int i=0; i<N; i++) {
            Z[i] = sc.nextInt();
            AA[i] = sc.nextInt();
        }
        int[] AB = new int[N];
        int[] AC = new int[N];
        for(int i=0; i<N; i++) {
            AB[i] = sc.nextInt();
            AC[i] = sc.nextInt();
        }
        int[] AD = new int[N];
        int[] AE = new int[N];
        for(int i=0; i<N; i++) {
            AD[i] = sc.nextInt();
            AE[i] = sc.nextInt();
        }
        int[] AF = new int[N];
        int[] AG = new int[N];
        for(int i=0; i<N; i++) {
            AF[i] = sc.nextInt();
            AG[i] = sc.nextInt();
        }
        int[] AH = new int[N];
        int[] AI = new int[N];
        for
