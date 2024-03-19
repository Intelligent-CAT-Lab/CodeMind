<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0

Expected output:
-10
49 48 47 46 45 44 43 42 41 40 39 38 37 36 35 34 33 32 31 30 29 28 27 26 25 24 23 +22 21 20 19 18 17 16 15 14 13 12 11 10 9 8 7 6 5 4 3 2 1 0

```
import numpy as np
K = int(input())
N = 50
A = np.array([np.zeros(N) for _ in range(N)]).astype(int)
for i in range(N):
    for j in range(N):
        A[i,j] = 1 if j==i+1 else 0
A[N-1,0] = 1
B = [0 for _ in range(N)]
B[0] = np.identity(N).astype(int)
for i in range(1,N):
    B[i] = np.dot(B[i-1],A).astype(int)
C = [0 for _ in range(N)]
C[0] = np.identity(N).astype(int)
for i in range(1,N):
    C[i] = (C[i-1]+B[i]).astype(int)
print(N)
X = np.arange(N)
X = X[::-1].astype(int)
if K==0:
    print(*X)
else:
    r = (K-1)%N
    q = (K-1)//N
    b = [-1 for _ in range(N)]
    b[0] = N
    b = np.array(b).astype(int)
    X = np.dot(X,B[(r+1)%N])
    X += np.dot(b,q*C[N-1]+C[r])
    print(*X)
```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int N = 50;
        int[][] A = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = 1;
                if (j == i + 1) A[i][j] = 0;
            }
        }
        A[N - 1][0] = 1;
        int[][] B = new int[N][N];
        B[0] = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (j == i) B[0][i][j] = 1;
                else B[0][i][j] = 0;
            }
        }
        for (int i = 1; i < N; i++) {
            B[i] = multiply(B[i - 1], A);
        }
        int[][] C = new int[N][N];
        C[0] = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (j == i) C[0][i][j] = 1;
                else C[0][i][j] = 0;
            }
        }
        for (int i = 1; i < N; i++) {
            C[i] = add(C[i - 1], B[i]);
        }
        int[] X = new int[N];
        for (int i = 0; i < N; i++) {
            X[i] = i;
        }
        X = reverse(X);
        if (K == 0) {
            for (int i = 0; i < N; i++) {
                System.out.print(X[i] + " ");
            }
        } else {
            int r = (K - 1) % N;
            int q = (K - 1) / N;
            int[] b = new int[N];
            b[0] = N;
            for (int i = 1; i < N; i++) {
                b[i] = -1;
            }
            b = reverse(b);
            X = multiply(X, B[(r + 1) % N]);
            X = add(X, multiply(b, q * C[N - 1] + C[r]));
            for (int i = 0; i < N; i++) {
                System.out.print(X[i] + " ");
            }
        }
    }
    public static int[] reverse(int[] X) {
        int[] Y = new int[X.length];
        for (int i = 0; i < X.length; i++) {
            Y[i] = X[X.length - i - 1];
        }
        return Y;
    }
    public static int[][] multiply(int[][] A, int[][] B) {
        int[][] C = new int[A.length][B[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                for (int k = 0; k < A[0].length; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return C;
    }
    public static int[] add(int[] A, int[] B) {
        int[] C = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            C[i] = A[i] + B[i];
        }
        return C;
    }
}
```
'''
<|endoftext|>
