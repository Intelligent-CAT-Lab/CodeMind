<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
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
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int K = sc.nextInt();
        K = Math.min(K, 300);
        long mod = 1000000007;
        List<Integer> a = new ArrayList<>();
        int val = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '0') {
                a.add(val);
                val = 0;
            } else {
                val++;
            }
        }
        if (val != 0) {
            a.add(val);
        }
        int m = a.size();
        K = Math.min(a.stream().mapToInt(i -> i).sum(), K);

        int[][][] dp = new int[m + 1][K + 1][K + 1];

        for (int j = 0; j <= K; j++) {
            for (int i = 0; i <= K; i++) {
                dp[m][j][i] = (j == i) ? 1 : 0;
            }
        }

        int[] b = new int[m];
        int[] c = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = a.get(i);
            c[i] = a.get(i);
        }
        for (int i = 1; i < m; i++) {
            b[i] += b[i - 1];
        }
        b[0] = 0;
        for (int i = m - 1; i >= 0; i--) {
            c[i] += c[i + 1];
        }
        for (int i = m - 1; i >= 0; i--) {
            for (int k = 0; k <= K; k++) {
                for (int j = 0; j <= k; j++) {
                    int M = Math.max(k - j, -a.get(i));
                    dp[i][j][k] = (dp[i + 1][j + M][k] + dp[i + 1][j][k + M]) % mod;
                }
            }
        }

        System.out.println(dp[0][0][0]);
    }
}
```</s>
