<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
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
                A[i][j] = 1;
                if(j==i+1) A[i][j] = 0;
            }
        }
        A[N-1][0] = 1;
        int[][] B = new int[N][N];
        B[0] = new int[N][N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                B[i][j] = 0;
            }
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(j==i) B[i][j] = 1;
            }
        }
        for(int i=1;i<N;i++){
            B[i] = multiply(B[i-1],A);
        }
        int[][] C = new int[N][N];
        C[0] = new int[N][N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                C[i][j] = 0;
            }
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(j==i) C[i][j] = 1;
            }
        }
        for(int i=1;i<N;i++){
            C[i] = add(C[i-1],B[i]);
        }
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
            b = multiply(b,C[N-1]);
            b = add(b,q*C[N-1]+C[r]);
            X = multiply(X,B[(r+1)%N]);
            X = add(X,b);
            for(int i=0;i<N;i++){
                System.out.print(X[i]+" ");
            }
        }
    }
    public static int[] reverse(int[] X){
        int[] Y = new int[X.length];
        for(int i=0;i<X.length;i++){
            Y[i] = X[X.length-1-i];
        }
        return Y;
    }
    public static int[] multiply(int[] X,int[][] Y){
        int[] Z = new int[X.length];
        for(int i=0;i<X.length;i++){
            for(int j=0;j<X.length;j++){
                Z[i] += X[j]*Y[j][i];
            }
        }
        return Z;
    }
    public static int[] add(int[] X,int[] Y){
        int[] Z = new int[X.length];
        for(int i=0;i<X.length;i++){
            Z[i] = X[i]+Y[i];
        }
        return Z;
    }
}
```
<|endoftext|>
