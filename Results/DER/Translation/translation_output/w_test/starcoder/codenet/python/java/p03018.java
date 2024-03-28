<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
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

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ans = 0;
        int a = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                a++;
            } else if (s.charAt(i) == 'B' && i < s.length() - 1 && s.charAt(i + 1) == 'C') {
                ans += a;
            }
        }
        System.out.println(ans);
    }
}
```
<|endoftext|>
