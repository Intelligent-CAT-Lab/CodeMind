<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
acpc

Expected output:
5


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
Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    static int mod = (int)Math.pow(10, 9) + 7;
    static ArrayList<Integer>[] memo;
    static int[][] dp;
    static String s;
    static int l;

    static int bl(ArrayList<Integer> arr, int x) {
        int low = 0, high = arr.size();
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) < x) low = mid + 1;
            else high = mid;
        }
        return low;
    }

    static int br(ArrayList<Integer> arr, int x) {
        int low = 0, high = arr.size();
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) <= x) low = mid + 1;
            else high = mid;
        }
        return low;
    }

    static int solve() {
        dp = new int[l + 1][l + 1];
        dp[0][l] = 1;
        int ans = 0;
        for (int i = 0; i < l; i++) {
            for (int j = i + 1; j <= l; j++) {
                int p = dp[i][j];
                if (p == 0) continue;
                for (int k = 0; k < 26; k++) {
                    int x = bl(memo[k], i);
                    int y = br(memo[k], j - 1) - 1;
                    if (x > y) continue;
                    ans = (ans + p) % mod;
                    if (x < y) {
                        int mx = memo[k].get(x), my = memo[k].get(y);
                        dp[mx + 1][my] = (dp[mx + 1][my] + p) % mod;
                    }
                }
            }
        }
        for (int i = 0; i <= l; i++) {
            for (int j = 0; j <= l; j++) {
                ans = (ans + dp[i][j]) % mod;
            }
        }
        ans = (ans + mod - 1) % mod;
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        s = scanner.next();
        l = s.length();
        memo = new ArrayList[26];
        for (int i = 0; i < 26; i++) {
            memo[i] = new ArrayList<>();
        }
        for (int i = 0; i < l; i++) {
            memo[s.charAt(i) - 'a'].add(i);
        }
        System.out.println(solve());
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the input, and then it calculates the number of distinct substrings that contain all the letters of the alphabet. The result is printed to the standard output.
<|EOT|>
