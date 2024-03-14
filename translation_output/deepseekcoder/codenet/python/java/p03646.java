<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int N = 50;
        int[][] A = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = (j == i + 1) ? 1 : 0;
            }
        }
        A[N - 1][0] = 1;
        int[][] B = new int[N][N];
        B[0] = new int[N];
        for (int i = 0; i < N; i++) {
            B[i] = matrixMultiply(B[i - 1], A)[0];
        }
        int[][] C = new int[N][N];
        C[0] = new int[N];
        for (int i = 0; i < N; i++) {
            C[i] = matrixAdd(C[i - 1], B[i])[0];
        }
        System.out.println(N);
        int[] X = new int[N];
        for (int i = 0; i < N; i++) {
            X[i] = i;
        }
        if (K == 0) {
            for (int i = N - 1; i >= 0; i--) {
                System.out.print(X[i] + " ");
            }
        } else {
            int r = (K - 1) % N;
            int q = (K - 1) / N;
            int[] b = new int[N];
            b[0] = N;
            X = matrixMultiply(X, B[(r + 1) % N])[0];
            X = matrixAdd(X, matrixMultiply(b, q * C[N - 1] + C[r])[0]);
            for (int i = N - 1; i >= 0; i--) {
                System.out.print(X[i] + " ");
            }
        }
    }

    private static int[][] matrixMultiply(int[][] a, int[][] b) {
        int n = a.length;
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }

    private static int[][] matrixAdd(int[][] a, int[][] b) {
        int n = a.length;
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }
}
```

This Java code does the same thing as the Python code. It creates a 50x50 matrix A where each row is a permutation of the numbers 0 through 49, with the last row shifted one position to the left. It then calculates the matrices B and C using matrix multiplication and addition. Finally, it prints out the elements of the matrix X, which is either the reverse of the numbers 0 through 49 or a permutation of these numbers depending on the value of K.
<|EOT|>
