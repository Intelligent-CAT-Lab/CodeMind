<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
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

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
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

This Java code does the same thing as the Python code. It reads a string from the input, calculates the minimum of the maximum of the distance to the end of the string and the current index for each character in the string, and then prints the maximum of these two values.
<|EOT|>
