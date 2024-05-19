System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
010

Expected output:
-1

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


Answer:
```java
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s = buffer.readLine();
        int n = s.length();
        int ans = n;
        int ans2 = n;
        for (int pos = 0; pos < n; pos++) {
            if (s.charAt(pos) == '1') {
                ans = Math.min(ans, Math.max(pos, n - pos - 1));
            } else {
                ans2 = Math.min(ans2, Math.max(pos, n - pos - 1));
            }
        }
        System.out.println(Math.max(ans, ans2));
    }
}
```<|endoftext|>
