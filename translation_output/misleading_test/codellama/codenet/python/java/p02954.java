<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

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
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        int rc = 0;
        int lc = 0;
        int p = 0;
        int state = 1; // 1 for R, 0 for L
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            if (state == 1) {
                if (s.charAt(i) == 'R') {
                    rc++;
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
                    lc++;
                    if (i == n - 1 || s.charAt(i + 1) == 'R') {
                        ans[p + 1] += (lc + 1) / 2;
                        ans[p] += lc / 2;
                        state = 1;
                        lc = 0;
                    }
                }
            }
        }
        System.out.println(String.join(" ", ans));
    }
}
```
This code uses a similar approach as the Python code, but it is written in Java. It uses a `Scanner` to read the input string, and then it iterates over the characters in the string using a `for` loop.

Inside the loop, it checks the current character and updates the `rc` and `lc` variables accordingly. It also updates the `state` variable to keep track of whether the current character is an `R` or an `L`.

When it encounters an `R` followed by an `L`, it updates the `ans` array accordingly and resets the `rc` and `lc` variables.

Finally, it prints the `ans` array using `String.join()` and `System.out.println()`.</s>
