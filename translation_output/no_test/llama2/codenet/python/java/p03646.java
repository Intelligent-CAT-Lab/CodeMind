<s> Translate the following python code to java and enclose your solution inside ```java```:
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

### 解答

```java
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int N = 50;
        int[][] A = new int[N][N];
        for (int i = 0; i < N; i++) {
            A[i] = new int[N];
            Arrays.fill(A[i], 0);
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = 1;
            }
        }
        A[N - 1][0] = 1;
        int[][] B = new int[N][N];
        for (int i = 0; i < N; i++) {
            B[i] = new int[N];
            Arrays.fill(B[i], 0);
        }
        B[0] = new int[N];
        Arrays.fill(B[0], 1);
        for (int i = 1; i < N; i++) {
            B[i] = IntStream.of(B[i - 1]).flatMap(x -> IntStream.of(A[x])).toArray();
        }
        int[][] C = new int[N][N];
        for (int i = 0; i < N; i++) {
            C[i] = new int[N];
            Arrays.fill(C[i], 0);
        }
        C[0] = new int[N];
        Arrays.fill(C[0], 1);
        for (int i = 1; i < N; i++) {
            C[i] = IntStream.of(C[i - 1]).flatMap(x -> IntStream.of(B[x])).toArray();
        }
        int[] X = new int[N];
        Arrays.fill(X, 0);
        X = IntStream.of(X).reverse().toArray();
        if (K == 0) {
            for (int x : X) {
                System.out.print(x + " ");
            }
        } else {
            int r = (K - 1) % N;
            int q = (K - 1) / N;
            int[] b = new int[N];
            Arrays.fill(b, -1);
            b[0] = N;
            b = IntStream.of(b).toArray();
            X = IntStream.of(X).flatMap(x -> IntStream.of(B[(r + 1) % N])).toArray();
            X += IntStream.of(b).flatMap(x -> IntStream.of(q * C[N - 1] + C[r])).toArray();
            for (int x : X) {
                System.out.print(x + " ");
            }
        }
    }
}
```
</s>
