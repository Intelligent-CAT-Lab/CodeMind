Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
123456789

Expected output:
1


```
from itertools import combinations

S = raw_input()
N = len(S)
cnt = 0

for a, b, c in combinations(range(1, N), 3):
    ok = True
    A = S[:a]
    B = S[a:b]
    C = S[b:c]
    D = S[c:]
    for x in [A, B, C, D]:
        y = int(x)
        if y > 255:
            ok = False
        if y == 0 and len(x)!= 1:
            ok = False
        if y!= 0 and x[0] == '0':
            ok = False
    cnt += ok

print cnt


```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int N = S.length();
        int cnt = 0;

        for (int a = 1; a < N; a++) {
            for (int b = a + 1; b < N; b++) {
                for (int c = b + 1; c < N; c++) {
                    String A = S.substring(0, a);
                    String B = S.substring(a, b);
                    String C = S.substring(b, c);
                    String D = S.substring(c);

                    boolean ok = true;
                    if (A.length() > 0 &&!A.matches("[1-9]\\d*")) {
                        ok = false;
                    }
                    if (B.length() > 0 &&!B.matches("[1-9]\\d*")) {
                        ok = false;
                    }
                    if (C.length() > 0 &&!C.matches("[1-9]\\d*")) {
                        ok = false;
                    }
                    if (D.length() > 0 &&!D.matches("[1-9]\\d*")) {
                        ok = false;
                    }
                    if (A.length() > 0 && A.charAt(0) == '0') {
                        ok = false;
                    }
                    if (B.length() > 0 && B.charAt(0) == '0') {
                        ok = false;
                    }
                    if (C.length() > 0 && C.charAt(0) == '0') {
                        ok = false;
                    }
                    if (D.length() > 0 && D.charAt(0) == '0') {
                        ok = false;
                    }
                    if (A.length() > 0 && Integer.parseInt(A) > 255) {
                        ok = false;
                    }
                    if (B.length() > 0 && Integer.parseInt(B) > 255) {
                        ok = false;
                    }
                    if (C.length() > 0 && Integer.parseInt(C) > 255) {
                        ok = false;
                    }
                    if (D.length() > 0 && Integer.parseInt(D) > 255) {
                        ok = false;
                    }

                    cnt += ok;
                }
            }
        }

        System.out.println(cnt);
    }
}
```<|endoftext|>
