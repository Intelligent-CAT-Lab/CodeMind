System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0101 1

Expected output:
4


```
S,K=input().split()
K=int(K)
K=min(K,300)
mod=998244353
a=[]
val=0
for i in range(len(S)):
    if S[i]=="0":
        a.append(val)
        val=0
    else:
        val+=1

if val!=0:
    a.append(val)
m=len(a)
K=min(sum(a),K)

dp=[[[0 for i in range(K+1)] for j in range(K+1)] for k in range(m+1)]

for j in range(K+1):
    dp[m][j][j]=1

b=[a[i] for i in range(m)]
c=[a[i] for i in range(m)]
for i in range(1,m):
    b[i]+=b[i-1]
b=[0]+b
for i in range(m-2,-1,-1):
    c[i]+=c[i+1]
for i in range(m-1,-1,-1):
    for k in range(min(b[i],K)+1):
        for j in range(min(K,k+c[i])+1):
            M=max(k-j,-a[i])
            dp[i][j][k]=sum(dp[i+1][j+l][k] for l in range(max(0,M),K-j+1))+sum(dp[i+1][j][k+l] for l in range(1,min(K-k,-M)+1))
            dp[i][j][k]%=mod

print(dp[0][0][0])
```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int K = sc.nextInt();
        K = Math.min(K, 300);
        int mod = 998244353;
        int[] a = new int[S.length()];
        int val = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '0') {
                a[i] = val;
                val = 0;
            } else {
                val++;
            }
        }
        if (val!= 0) {
            a[S.length()] = val;
        }
        int m = a.length;
        K = Math.min(Arrays.stream(a).sum(), K);
        int[][][] dp = new int[m + 1][K + 1][K + 1];
        for (int j = 0; j <= K; j++) {
            dp[m][j][j] = 1;
        }
        int[] b = Arrays.copyOf(a, m);
        int[] c = Arrays.copyOf(a, m);
        for (int i = 1; i < m; i++) {
            b[i] += b[i - 1];
        }
        b[0] = 0;
        for (int i = m - 2; i >= 0; i--) {
            c[i] += c[i + 1];
        }
        for (int i = m - 1; i >= 0; i--) {
            for (int k = 0; k <= Math.min(b[i], K); k++) {
                for (int j = 0; j <= Math.min(K, k + c[i]); j++) {
                    int M = Math.max(k - j, -a[i]);
                    dp[i][j][k] = (int) (((long) dp[i + 1][j + M][k] + dp[i + 1][j][k + M]) % mod);
                }
            }
        }
        System.out.println(dp[0][0][0]);
    }
}
```<|endoftext|>
