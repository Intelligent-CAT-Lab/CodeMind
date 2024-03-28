
```java
import java.util.*;
import java.io.*;

public class Main {
    static int mod = 1000000007;
    static int[][][] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);
        dp = new int[n+1][n+1][k+2*(n+1)];
        dp[0][0][0] = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                for (int l = 0; l <= k; l++) {
                    dp[i+1][j+1][l+2*(j+1)] += dp[i][j][l];
                    dp[i+1][j+1][l+2*(j+1)] %= mod;
                    dp[i+1][j][l+2*j] += dp[i][j][l]*(j*2+1);
                    dp[i+1][j][l+2*j] %= mod;
                    if (j != 0) {
                        dp[i+1][j-1][l+(j-1)*2] += dp[i][j][l]*j*j;
                        dp[i+1][j-1][l+(j-1)*2] %= mod;
                    }
                }
            }
        }
        System.out.println(dp[n][0][k]%mod);
    }
}
```


```

java code:
```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);
        int[] a = new int[n];
        s = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(s[i]);
        }
        Arrays.sort(a);
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int l = 0;
            int r = i;
            while (l < r) {
                int mid = (l+r)/2;
                if (a[i] - a[mid] <= k) {
                    r = mid;
                } else {
                    l = mid+1;
                }
            }
            ans += i-l;
        }
        System.out.println(ans);
    }
}
```
/solutions/leetcode/1248. Count Number of Nice Subarrays - lee215.md
# [1248. Count Number of Nice Subarrays](https://leetcode.com/problems/count-number-of-nice-subarrays/)

[contest](https://leetcode.com/contest/weekly-contest-163)
[submission](https://leetcode.com/submissions/detail/301080006/)

```
class Solution:
    def numberOfSubarrays(self, nums: List[int], k: int) -> int:
        n = len(nums)
        ans = 0
        for i in range(n):
            l = 0
            r = i
            while l < r:
                mid = (l+r)//2
                if nums[i] - nums[mid] <= k:
                    r = mid
                else:
                    l = mid+1
            ans += i-l
        return ans/solutions/leetcode/1249. Minimum Remove to Make Valid Parentheses - lee215.md
# [1249. Minimum Remove to Make Valid Parentheses](https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/)

[contest](https://leetcode.com/contest/weekly-contest-163)
[submission](https://leetcode.com/submissions/detail/301080006/)

```
class Solution:
    def minRemoveToMakeValid(self, s: str) -> str:
        n = len(s)
        stack = []
        for i in range(n):
            if s[i] == '(':
                stack.append(i)
            elif s[i] == ')':
                if stack:
                    stack.pop()
                else:
                    s = s[:i] + s[i+1:]
                    i -= 1
                    n -= 1
        while stack:
            i = stack.pop()
            s = s[:i] + s[i+1:]
            n -= 1
        return s

```

java code:
```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = s.length();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else if (s.charAt(i) == ')') {
                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    s = s.substring(0, i) + s.substring(i+1);
                    i--;
                    n--;
                }
            }
        }
        while (!stack.isEmpty()) {
            int i = stack.pop();
            s = s.substring(0, i) + s.substring(i+1);
            n--;
        }
        System.out.println(s);
    }
}
```
/solutions/leetcode/1250. Check If It Is a Good Array - lee215.md
# [1250. Check If It Is a Good Array](https://leetcode.com/problems/check-if-it-is-a-good-array/)

[contest](https://leetcode.com/contest/weekly-contest-163)
[submission](https://leetcode.com/submissions/detail/301080006/)

```
class Solution:
    def isGoodArray(self, nums
