<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Arrays;
import java.util.Scanner;

class p03375{

    static long M;
    static long[][] S;
    static long[][] C;
    static int N;

    static long[][] complex(int N){
        long[][] res = new long[N+1][N+1];
        for(int i=0;i<=N;++i){
            res[i][0]=res[i][i]=1;
            for(int j=1;j<i;++j){
                res[i][j]=(res[i-1][j]+res[i-1][j-1])%M;
            }
        }
        return res;
    }

    static long[][] stirling(int N){
        long[][] res = new long[N+1][N+1];
        //iåãç©ºã§ãªãjã«åå²(å«ã¾ããªããã®ãåã£ã¦ãè¯ã)
        for(int i=0;i<=N;++i){
            res[i][0]=res[i][i]=1;
            for(int j=1;j<i;++j){
                res[i][j] = (res[i-1][j-1] + (long)(j+1)*(res[i-1][j]%M))%M;
            }
        }
        return res;
    }

    //a^x
    static long beki(long a, long x, long mod){
        long res=1;
        for(int i=0;i<32;++i){
            if(((x>>i)&1)==1)res=(res*a)%mod;
            a = (a*a)%mod;
        }
        return res;
    }

    static long ways(int i){
        long res = 0;
        long b1 = beki(2,N-i,M);
        long beki1 = 1;
        long beki2 = beki(2,beki(2,N-i,M-1)%(M-1),M);
        for(int j=0;j<=i;++j){
            res = (res+ways2(i,j,beki1,beki2))%M;
            beki1 = (beki1*b1)%M;
        }
        return res;
    }

    static long ways2(int i,int j,long beki1, long beki2){
        return ((S[i][j]*beki1)%M*beki2%M)%M;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        M = scan.nextLong();
        C = complex(N);
        S = stirling(N);
        long ans = 0;
        for(int i=0;i<=N;++i){
            ans = (ans + (i%2==0 ? 1:-1)*(C[N][i]*ways(i))%M + (i%2==0 ? 0:M))%M;
        }
        System.out.println(ans);
    }
}
```

### Response:
```python
import numpy as np

M = 0
S = []
C = []
N = 0

def complex_(n):
    res = np.zeros((n+1, n+1), dtype=int)
    for i in range(n+1):
        res[i][0] = res[i][i] = 1
        for j in range(1, i):
            res[i][j] = (res[i-1][j] + res[i-1][j-1]) % M
    return res

def stirling(n):
    res = np.zeros((n+1, n+1), dtype=int)
    for i in range(n+1):
        res[i][0] = res[i][i] = 1
        for j in range(1, i):
            res[i][j] = (res[i-1][j-1] + (j+1)*(res[i-1][j] % M)) % M
    return res

def beki(a, x, mod):
    res = 1
    for i in range(32):
        if ((x >> i) & 1) == 1:
            res = (res * a) % mod
        a = (a * a) % mod
    return res

def ways(i):
    res = 0
    b1 = beki(2, N-i, M)
    beki1 = 1
    beki2 = beki(2, beki(2, N-i, M-1) % (M-1), M)
    for j in range(i+1):
        res = (res + ways2(i, j, beki1, beki2)) % M
        beki1 = (beki1 * b1) % M
    return res

def ways2(i, j, beki1, beki2):
    return ((S[i][j] * beki1) % M * beki2 % M) % M

def main():
    global N, M, C, S
    N = int(input())
    M = int(input())
    C = complex_(N)
    S = stirling(N)
    ans = 0
    for i in range(N+1):
        ans = (ans + ((-1)**(i%2))*(C[N][i]*ways(i)) % M + (i%2)*M) % M
    print(ans)

main()
```
<|EOT|>
