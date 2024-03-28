<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
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
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int ans = 0;
        int a = 0;
        int i = 0;
        while (i < S.length()) {
            if (S.charAt(i) == 'A') {
                a++;
                i++;
            } else if (S.substring(i, i + 2).equals("BC")) {
                ans += a;
                i += 2;
            } else {
                a = 0;
                i++;
            }
        }
        System.out.println(ans);
    }
}
```</s>
