<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
333333357

Expected output:
8335


```
import java.util.*;

public class atcoder_ABC114_C {
    static Scanner sc = new Scanner(System.in);
    static int N;

    public static void main(String[] args) {
        String S = sc.next();
        N = Integer.parseInt(S);
        int ans = 0;
        for (int i = 3; i <= S.length() - 1; i++) {
            ans += (int) Math.pow(3, i) - 3 * (int) Math.pow(2, i) + 3;
        }
        ans += f(3 * (int) Math.pow(10, S.length() - 1), S.length() - 2);
        ans += f(5 * (int) Math.pow(10, S.length() - 1), S.length() - 2);
        ans += f(7 * (int) Math.pow(10, S.length() - 1), S.length() - 2);
        System.out.println(ans);
    }

    static int f(int a, int m) {
        if (m >= 0) {
            return f(a + 3 * (int) Math.pow(10, m), m - 1) + f(a + 5 * (int) Math.pow(10, m), m - 1) + f(a + 7 * (int) Math.pow(10, m), m - 1);
        } else {
            String s = Integer.toString(a);
            if (s.indexOf("3")!= -1 && s.indexOf("5")!= -1 && s.indexOf("7")!= -1 && a <= N) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}
```

python code:<fim_suffix><fim_middle>

```python
import sys

def f(a, m):
    if m >= 0:
        return f(a + 3 * (10 ** m), m - 1) + f(a + 5 * (10 ** m), m - 1) + f(a + 7 * (10 ** m), m - 1)
    else:
        s = str(a)
        if "3" in s and "5" in s and "7" in s and a <= N:
            return 1
        else:
            return 0

N = int(sys.stdin.readline())
ans = 0
for i in range(3, len(str(N))):
    ans += 3 ** i - 3 * 2 ** i + 3
ans += f(3 * (10 ** (len(str(N)) - 1)), len(str(N)) - 2)
ans += f(5 * (10 ** (len(str(N)) - 1)), len(str(N)) - 2)
ans += f(7 * (10 ** (len(str(N)) - 1)), len(str(N)) - 2)
print(ans)
```
"""
<|endoftext|>
