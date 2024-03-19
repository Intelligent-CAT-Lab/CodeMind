<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
123456789

Expected output:
35

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
        String S = "123456789";
        int N = S.length();
        int cnt = 0;

        for (int[] a : IntStream.range(1, N - 2)
                .parallel()
                .map(i -> new int[]{S.substring(0, i), S.substring(i, i + 2), S.substring(i + 2)})
                .filter(x -> isValid(x))
                .toArray(int[][]::new)) {
            cnt += isValid(a);
        }

        System.out.println(cnt);
    }

    private static boolean isValid(int[] a) {
        for (int x : a) {
            if (x > 255) {
                return false;
            }
            if (x == 0 && a.length != 1) {
                return false;
            }
            if (a[0] == '0' && x != 0) {
                return false;
            }
        }
        return true;
    }
}
```</s>
