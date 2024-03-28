<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
ABCABC

Expected output:
3


```
#https://atcoder.jp/contests/agc034/submissions/5781329
S = input()
ans = 0
a = 0
i = 0
while (i < len(S)):
  if S[i] == 'A':
    a += 1
    i += 1
  elif S[i:i+2] == 'BC':
    ans += a
    i += 2
  else:
    a = 0
    i += 1
print(ans)

```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        int ans = 0;
        int a = 0;
        int i = 0;
        while (i < S.length()) {
            if (S.charAt(i) == 'A') {
                a += 1;
                i += 1;
            } else if (i + 1 < S.length() && S.substring(i, i + 2).equals("BC")) {
                ans += a;
                i += 2;
            } else {
                a = 0;
                i += 1;
            }
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the input, and then iterates over the string. If it encounters an 'A', it increments a counter. If it encounters 'BC', it adds the value of a to an answer, and then increments the index by 2. If it encounters any other character, it resets the counter to 0. The final answer is printed out.<｜end▁of▁sentence｜>
