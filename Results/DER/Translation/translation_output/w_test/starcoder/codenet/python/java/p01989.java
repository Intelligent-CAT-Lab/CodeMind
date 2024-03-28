<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
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

java code:<fim_suffix><fim_middle>

```
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int N = S.length();
        int cnt = 0;
        for (int a = 1; a <= N - 2; a++) {
            for (int b = a + 1; b <= N - 1; b++) {
                for (int c = b + 1; c <= N; c++) {
                    String A = S.substring(0, a);
                    String B = S.substring(a, b);
                    String C = S.substring(b, c);
                    String D = S.substring(c);
                    if (A.equals("0") || B.equals("0") || C.equals("0") || D.equals("0")) {
                        continue;
                    }
                    if (A.length() > 1 && A.charAt(0) == '0') {
                        continue;
                    }
                    if (B.length() > 1 && B.charAt(0) == '0') {
                        continue;
                    }
                    if (C.length() > 1 && C.charAt(0) == '0') {
                        continue;
                    }
                    if (D.length() > 1 && D.charAt(0) == '0') {
                        continue;
                    }
                    if (Integer.parseInt(A) > 255 || Integer.parseInt(B) > 255 || Integer.parseInt(C) > 255 || Integer.parseInt(D) > 255) {
                        continue;
                    }
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
```
<|endoftext|>
