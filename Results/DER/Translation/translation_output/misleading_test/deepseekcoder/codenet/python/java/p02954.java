<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
RRLRL

Expected output:
-30 82 -74 59 81

```
s = str(input())
n = len(s)
rc = 0
lc = 0
p = 0
state = 1 #1ãRã0ãL
ans = [0] * n
for i in range(n):
  #print(ans, rc, lc, p)
  if state:
    if s[i] == "R":
      rc += 1
      if s[i+1] == "L":
        ans[i] += (rc+1)//2
        ans[i+1] += rc//2
        state = 0
        p = i
        rc = 0
  else:
    if s[i] == "L":
      lc += 1
      if i == n-1 or s[i+1] == "R":
        ans[p+1] += (lc+1)//2
        ans[p] += lc//2
        state = 1
        lc = 0
print(" ".join(map(str,ans)))
```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int n = s.length();
        int rc = 0;
        int lc = 0;
        int p = 0;
        int state = 1;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            if (state == 1) {
                if (s.charAt(i) == 'R') {
                    rc += 1;
                    if (i + 1 < n && s.charAt(i + 1) == 'L') {
                        ans[i] += (rc + 1) / 2;
                        ans[i + 1] += rc / 2;
                        state = 0;
                        p = i;
                        rc = 0;
                    }
                }
            } else {
                if (s.charAt(i) == 'L') {
                    lc += 1;
                    if (i == n - 1 || s.charAt(i + 1) == 'R') {
                        ans[p + 1] += (lc + 1) / 2;
                        ans[p] += lc / 2;
                        state = 1;
                        lc = 0;
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the input, then processes it character by character. If it encounters a 'R', it increases the count of 'R's and if it encounters a 'L' after a 'R', it adds half of the count of 'R's to the next character and half of the count of 'R's to the current character. It does the same for 'L's. The result is printed to the console.
<|EOT|>
