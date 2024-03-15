<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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
            if (s.indexOf("3") != -1 && s.indexOf("5") != -1 && s.indexOf("7") != -1 && a <= N) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}
```
[/INST]
```python
import math

N = int(input())
S = input()

ans = 0
for i in range(3, len(S)+1):
    ans += (int(math.pow(3, i)) - 3*int(math.pow(2, i)) + 3)

ans += f(3*math.pow(10, len(S)-1), len(S)-2)
ans += f(5*math.pow(10, len(S)-1), len(S)-2)
ans += f(7*math.pow(10, len(S)-1), len(S)-2)

print(ans)

def f(a, m):
    if m >= 0:
        return f(a+3*math.pow(10, m), m-1) + f(a+5*math.pow(10, m), m-1) + f(a+7*math.pow(10, m), m-1)
    else:
        s = str(a)
        if '3' in s and '5' in s and '7' in s and a <= N:
            return 1
        else:
            return 0
```</s>
