<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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

### Response:
```java
import java.util.*;

public class Main {
    static int mod = (int) Math.pow(10, 9) + 7;
    static ArrayList<Integer>[] memo;
    static int[][] dp;
    static String alpha = "abcdefghijklmnopqrstuvwxyz";
    static Map<Character, Integer> alpha2 = new HashMap<>();

    static int bl(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size();
        while (l < r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) < x)
                l = mid + 1;
            else
                r = mid;
        }
        return l;
    }

    static int br(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size();
        while (l < r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) <= x)
                l = mid + 1;
            else
                r = mid;
        }
        return l;
    }

    static int solve(String s) {
        int l = s.length();
        memo = new ArrayList[26];
        dp = new int[l + 1][l + 1];
        dp[0][l] = 1;
        long ans = 0;

        for (int i = 0; i < 26; i++)
            memo[i] = new ArrayList<>();

        for (int i = 0; i < l; i++)
            memo[alpha2.get(s.charAt(i))].add(i);

        for (int i = 0; i < l; i++) {
            for (int j = i + 1; j <= l; j++) {
                int p = dp[i][j];
                if (p == 0)
                    continue;
                for (int k = 0; k < 26; k++) {
                    ArrayList<Integer> arr = memo[k];
                    int x = bl(arr, i);
                    int y = br(arr, j - 1) - 1;
                    if (x > y)
                        continue;
                    ans = (ans + p) % mod;
                    if (x < y) {
                        int mx = arr.get(x), my = arr.get(y);
                        dp[mx + 1][my] = (dp[mx + 1][my] + p) % mod;
                    }
                }
            }
        }

        for (int i = 0; i <= l; i++)
            for (int j = 0; j <= l; j++)
                ans = (ans + dp[i][j]) % mod;

        ans = (ans + mod - 1) % mod;
        return (int) ans;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 26; i++)
            alpha2.put(alpha.charAt(i), i);
        System.out.println(solve(new Scanner(System.in).next()));
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the standard input, counts the number of distinct substrings that contain each letter of the alphabet at least once, and prints the result modulo 10^9+7.
<|EOT|>
