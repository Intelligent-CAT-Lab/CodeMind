<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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
        if y == 0 and len(x) != 1:
            ok = False
        if y != 0 and x[0] == '0':
            ok = False
    cnt += ok

print cnt


```
[/INST]
```java
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        String S = System.console().readLine();
        int N = S.length();
        int cnt = 0;

        for (int[] a : IntStream.range(1, N - 2)
                .parallel()
                .map(x -> new int[]{x, x + 1, x + 2})
                .filter(x -> S.substring(x[0], x[1]).equals("0") && S.substring(x[1], x[2]).equals("0") && S.substring(x[2], x[3]).equals("0"))
                .filter(x -> isValid(S.substring(x[0], x[1]), x[0]) && isValid(S.substring(x[1], x[2]), x[1]) && isValid(S.substring(x[2], x[3]), x[2])) {
            cnt++;
        }

        System.out.println(cnt);
    }

    private static boolean isValid(String s, int start) {
        int len = s.length();
        int sum = 0;
        for (int i = start; i < len; i++) {
            char c = s.charAt(i);
            if (c == '0') {
                sum++;
            } else {
                sum -= 10;
            }
        }
        return sum == 0;
    }
}
```</s>
