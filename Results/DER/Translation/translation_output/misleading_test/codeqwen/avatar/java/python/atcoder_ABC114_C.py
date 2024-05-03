Here is the Python equivalent of the Java code:

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
ans = 0
for i in range(3, len(str(N))):
    ans += (3 ** i) - 3 * (2 ** i) + 3
ans += f(3 * (10 ** (len(str(N)) - 1)), len(str(N)) - 2)
ans += f(5 * (10 ** (len(str(N)) - 1)), len(str(N)) - 2)
ans += f(7 * (10 ** (len(str(N)) - 1)), len(str(N)) - 2)
print(ans)
```

This Python code does the same thing as the Java code. It first defines a recursive function `f` that counts the number of numbers less than or equal to `N` that contain the digits 3, 5, and 7. It then calculates the total number of such numbers by adding up the results of `f` for different powers of 10. Finally, it prints the total count.
