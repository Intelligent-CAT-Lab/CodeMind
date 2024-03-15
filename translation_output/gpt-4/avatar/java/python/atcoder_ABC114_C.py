Below is the translated Python code from the given Java code. Note that in Python, the recursion limit may need to be increased for larger inputs, as Python's default recursion limit is not as generous as Java's stack. However, this specific implementation should typically not hit the recursion limit problem with reasonable inputs:

```python
import math

def f(a, m):
    if m >= 0:
        return f(a + 3 * int(math.pow(10, m)), m - 1) + \
               f(a + 5 * int(math.pow(10, m)), m - 1) + \
               f(a + 7 * int(math.pow(10, m)), m - 1)
    else:
        s = str(a)
        if "3" in s and "5" in s and "7" in s and a <= N:
            return 1
        else:
            return 0

S = input().strip()
N = int(S)
ans = 0

for i in range(3, len(S)):
    ans += int(math.pow(3, i)) - 3 * int(math.pow(2, i)) + 3

ans += f(3 * int(math.pow(10, len(S) - 1)), len(S) - 2)
ans += f(5 * int(math.pow(10, len(S) - 1)), len(S) - 2)
ans += f(7 * int(math.pow(10, len(S) - 1)), len(S) - 2)

print(ans)
```

Please keep in mind that Java and Python have differences in terms of syntax and some built-in functions, but the above code should be the Python counterpart of your original Java code.
