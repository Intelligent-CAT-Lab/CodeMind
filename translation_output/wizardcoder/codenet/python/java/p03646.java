Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
import java.util.*;

public class Main {
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
            b = multiply(X,b);
            b = add(b,q*C[N-1]+C[r]);
            System.out.println(Arrays.toString(b));
        }
    }
    public static int[][] multiply(int[][] A, int[][] B){
        int m = A.length;
        int n = A[0].length;
        int p = B[0].length;
        int[][] C = new int[m][p];
        for(int i=0;i<m;i++){
            for(int j=0;j<p;j++){
                for(int k=0;k<n;k++){
                    C[i][j] += A[i][k]*B[k][j];
                }
            }
        }
        return C;
    }
    public static int[] reverse(int[] A){
        int n = A.length;
        int[] B = new int[n];
        for(int i=0;i<n;i++){
            B[i] = A[n-i-1];
        }
        return B;
    }
    public static int[] add(int[] A, int[] B){
        int n = A.length;
        int[] C = new int[n];
        for(int i=0;i<n;i++){
            C[i] = A[i]+B[i];
        }
        return C;
    }
}
```<|endoftext|>
