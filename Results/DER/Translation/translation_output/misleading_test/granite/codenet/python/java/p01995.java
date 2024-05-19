System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
acpc

Expected output:
89

```
def main():
    from bisect import bisect_left as bl
    from bisect import bisect_right as br
    s=input()
    alpha="abcdefghijklmnopqrstuvwxyz"
    l=len(s)
    alpha2={j:i for i,j in enumerate(alpha)}
    memo=[[] for _ in [0]*26]
    mod=10**9+7
    for i in range(l):
        memo[alpha2[s[i]]].append(i)
    dp=[[0]*(l+1) for _ in range(l+1)]
    dp[0][l]=1
    ans=0
    for i in range(l):
        for j in range(i+1,l+1):
            p=dp[i][j]
            if p==0:
                continue
            for k in range(26):
                x=bl(memo[k],i)
                y=br(memo[k],j-1)-1
                if x>y:
                    continue
                ans+=p
                if x<y:
                    mx,my=memo[k][x],memo[k][y]
                    dp[mx+1][my]=(dp[mx+1][my]+p)%mod
            ans=ans%mod
    ans=(ans+sum([sum([i for i in j])%mod for j in dp])+mod-1)%mod
    print(ans)
    
if __name__=='__main__':
    main()

```


Answer:
```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = s.length();
        int mod = 100000007;
        int[][] dp = new int[n][n];
        int[] alpha2 = new int[26];
        for (int i = 0; i < 26; i++) {
            alpha2[i] = -1;
        }
        for (int i = 0; i < n; i++) {
            alpha2[s.charAt(i) - 'a'] = i;
        }
        List<Integer>[] memo = new ArrayList[26];
        for (int i = 0; i < 26; i++) {
            memo[i] = new ArrayList<>();
        }
        for (int i = 0; i < n; i++) {
            memo[s.charAt(i) - 'a'].add(i);
        }
        for (int i = 0; i < n; i++) {
            dp[i][i] = 1;
        }
        for (int len = 2; len <= n; len++) {
            for (int i = 0; i < n - len + 1; i++) {
                int j = i + len - 1;
                dp[i][j] = dp[i][j - 1];
                for (int k = 0; k < 26; k++) {
                    int left = Collections.binarySearch(memo[k], i - 1);
                    int right = Collections.binarySearch(memo[k], j);
                    if (left < 0) {
                        left = -left - 1;
                    }
                    if (right < 0) {
                        right = -right - 2;
                    }
                    if (left <= right) {
                        dp[i][j] = (dp[i][j] + dp[memo[k].get(left) + 1][j]) % mod;
                    }
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                ans = (ans + dp[i][j]) % mod;
            }
        }
        ans = (ans + n - 1) % mod;
        System.out.println(ans);
    }
}
```<|endoftext|>
