<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
010

Expected output:
2


```
import sys
readline = sys.stdin.readline
sys.setrecursionlimit(10**8)
mod = 10**9+7
#mod = 998244353
INF = 10**18
eps = 10**-7

S = readline().rstrip()
N = len(S)
ans = N
ans2 = N
for i in range(N):
    if S[i] == "1":
        ans = min(ans,max(N-i-1,i))
    else:
        ans2 = min(ans2,max(N-i-1,i))
print(max(ans,ans2))

```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int N = S.length();
        int ans = N;
        int ans2 = N;
        for (int i = 0; i < N; i++) {
            if (S.charAt(i) == '1') {
                ans = Math.min(ans, Math.max(N - i - 1, i));
            } else {
                ans2 = Math.min(ans2, Math.max(N - i - 1, i));
            }
        }
        System.out.println(Math.max(ans, ans2));
    }
}
```
<|endoftext|>
