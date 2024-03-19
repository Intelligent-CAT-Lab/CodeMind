<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
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
                    if (i < n - 1 && s.charAt(i + 1) == 'L') {
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

This Java code does the same thing as the Python code. It reads a string from the user, then iterates over the string. If the current character is 'R' and the next character is 'L', it adds half of the current 'R' count to the current index and half to the next index. If the current character is 'L' and the next character is 'R' or it's the last character, it adds half of the current 'L' count to the previous index and half to the current index. The 'R' and 'L' counts are reset after each operation. The final array is printed to the console.<｜end▁of▁sentence｜>
