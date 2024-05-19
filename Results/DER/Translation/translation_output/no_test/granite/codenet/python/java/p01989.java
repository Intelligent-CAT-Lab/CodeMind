System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
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


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        int N = S.length();
        int cnt = 0;

        for (int a = 1; a < N; a++) {
            for (int b = a + 1; b < N; b++) {
                for (int c = b + 1; c < N; c++) {
                    boolean ok = true;
                    String A = S.substring(0, a);
                    String B = S.substring(a, b);
                    String C = S.substring(b, c);
                    String D = S.substring(c);
                    for (String x : new String[]{A, B, C, D}) {
                        int y = Integer.parseInt(x);
                        if (y > 255) {
                            ok = false;
                        }
                        if (y == 0 && x.length()!= 1) {
                            ok = false;
                        }
                        if (y!= 0 && x.charAt(0) == '0') {
                            ok = false;
                        }
                    }
                    cnt += ok? 1 : 0;
                }
            }
        }

        System.out.println(cnt);
    }
}
```<|endoftext|>
