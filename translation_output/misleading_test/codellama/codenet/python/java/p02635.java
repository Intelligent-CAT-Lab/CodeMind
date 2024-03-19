<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

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
[/INST]

Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int K = sc.nextInt();
        sc.close();

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

        if (val != 0) {
            a[S.length() - 1] = val;
        }

        int m = a.length;
        K = Math.min(sum(a), K);

        int[][][] dp = new int[m + 1][K + 1][K + 1];

        for (int j = 0; j <= K; j++) {
            dp[m][j][j] = 1;
        }

        int[] b = new int[m];
        int[] c = new int[m];
        for (int i = 1; i < m; i++) {
            b[i] = b[i - 1] + a[i];
        }
        b[0] = 0;
        for (int i = m - 2; i >= 0; i--) {
            c[i] = c[i + 1] + a[i];
        }
        for (int i = m - 1; i >= 0; i--) {
            for (int k = Math.min(b[i], K); k >= 0; k--) {
                for (int j = Math.min(K, k + c[i]); j >= 0; j--) {
                    int M = Math.max(k - j, -a[i]);
                    dp[i][j][k] = sum(dp[i + 1][j + l][k] for l in range(max(0, M), K - j + 1)) + sum(dp[i + 1][j][k + l] for l in range(1, min(K - k, -M) + 1));
                    dp[i][j][k] %= mod;
                }
            }
        }

        System.out.println(dp[0][0][0]);
    }

    private static int sum(int[][][] dp) {
        int result = 0;
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                for (int k = 0; k < dp[i][j].length; k++) {
                    result += dp[i][j][k];
                }
            }
        }
        return result;
    }
}
```
Note that the `sum` method is a helper method that calculates the sum of all the elements in the `dp` array.

Also, note that the `dp` array is initialized with all zeros, and the `dp[m][j][k]` element is updated with the result of the calculation.

The `dp` array is used to store the results of the calculations, and the `dp[0][0][0]` element is the final result.

The `mod` variable is used to calculate the modulo of the result, and it is set to 998244353.

The `b` and `c` arrays are used to store the cumulative sum of the `a` array, and they are used in the calculations.

The `m` variable is the length of the `a` array, and it is used to calculate the `dp` array.

The `K` variable is the maximum number of operations that can be performed, and it is used to calculate the `dp` array.

The `S` variable is the input string, and it is used to calculate the `a` array.

The `val` variable is used to store the current value of the `a` array, and it is used to calculate the `a` array.

The `i` variable is used to iterate over the `a` array, and it is used to calculate the `a` array.

The `j` variable is used to iterate over the `dp` array, and it is used to calculate the `dp` array.

The `k` variable is used to iterate over the `dp` array, and it is used to calculate the `dp` array.

The `l` variable is used to iterate over the `dp` array, and it is used to calculate the `dp` array.

The `M` variable is used to store the maximum value of the `k` and `j` variables, and it is used to calculate the `dp` array.

The `result` variable is used to store the final result, and it is used to print the result.

The `System.out.println` statement is used to print the final result.</s>
