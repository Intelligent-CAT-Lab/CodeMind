<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
333333357

Expected output:
8358

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

Here is the Python code that solves the problem:
```python
import math

def f(a, m):
    if m >= 0:
        return f(a + 3 * (10 ** m), m - 1) + f(a + 5 * (10 ** m), m - 1) + f(a + 7 * (10 ** m), m - 1)
    else:
        s = str(a)
        if "3" in s and "5" in s and "7" in s and a <= N:
            return 1
        else:
            return 0

N = int(input())
S = str(N)
ans = 0
for i in range(3, len(S) - 1):
    ans += (3 ** i) - 3 * (2 ** i) + 3
ans += f(3 * (10 ** (len(S) - 1)), len(S) - 2)
ans += f(5 * (10 ** (len(S) - 1)), len(S) - 2)
ans += f(7 * (10 ** (len(S) - 1)), len(S) - 2)
print(ans)
```
This code first defines a function `f` that takes two arguments: `a` and `m`. If `m` is greater than or equal to 0, it recursively calls `f` with `a + 3 * (10 ** m)`, `a + 5 * (10 ** m)`, and `a + 7 * (10 ** m)` as the arguments, and adds the results together. If `m` is less than 0, it converts `a` to a string and checks if it contains the digits 3, 5, and 7. If it does, it returns 1, otherwise it returns 0.

The code then takes the input `N` as a string, and defines `S` as the string representation of `N`. It then initializes `ans` to 0, and loops through each digit in `S` starting from the third digit (index 2) to the second-to-last digit (index `len(S) - 2`). For each digit, it calculates the sum of the powers of 3 and 2, and adds the result to `ans`.

Finally, the code calls `f` with `3 * (10 ** (len(S) - 1))`, `5 * (10 ** (len(S) - 1))`, and `7 * (10 ** (len(S) - 1))` as the arguments, and adds the results to `ans`. It then prints `ans` as the final answer.</s>
