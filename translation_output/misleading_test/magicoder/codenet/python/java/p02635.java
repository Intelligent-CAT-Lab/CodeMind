<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0101 1

Expected output:
89

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

@@ Response
Here is the Java version of the provided Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        int K = scanner.nextInt();
        K = Math.min(K, 300);
        int mod = 998244353;
        ArrayList<Integer> a = new ArrayList<>();
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
        K = Math.min(a.stream().mapToInt(Integer::intValue).sum(), K);

        int[][][] dp = new int[m + 1][K + 1][K + 1];
        for (int j = 0; j <= K; j++) {
            dp[m][j][j] = 1;
        }

        ArrayList<Integer> b = new ArrayList<>(a);
        ArrayList<Integer> c = new ArrayList<>(a);
        for (int i = 1; i < m; i++) {
            b.set(i, b.get(i) + b.get(i - 1));
        }
        b.add(0, 0);
        for (int i = m - 2; i >= 0; i--) {
            c.set(i, c.get(i) + c.get(i + 1));
        }
        for (int i = m - 1; i >= 0; i--) {
            for (int k = 0; k <= Math.min(b.get(i), K); k++) {
                for (int j = 0; j <= Math.min(K, k + c.get(i)); j++) {
                    int M = Math.max(k - j, -a.get(i));
                    for (int l = Math.max(0, M); l <= K - j; l++) {
                        dp[i][j][k] += dp[i + 1][j + l][k];
                    }
                    for (int l = 1; l <= Math.min(K - k, -M); l++) {
                        dp[i][j][k] += dp[i + 1][j][k + l];
                    }
                    dp[i][j][k] %= mod;
                }
            }
        }

        System.out.println(dp[0][0][0]);
    }
}
```

This Java code does the same thing as the Python code. It reads a string and an integer from the standard input, processes the string to get the list `a`, and then calculates the result according to the provided algorithm. The result is then printed to the standard output.<｜end▁of▁sentence｜>
