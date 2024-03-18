Here is the Python code equivalent to the Java code provided:

```python
import sys

MOD = 1000 * 1000 * 1000 + 7
dx = [0, -1, 0, 1]
dy = [1, 0, -1, 0]

def solve():
    LIMIT = 1000 * 10000 + 10
    div = [1] * LIMIT
    for i in range(2, LIMIT):
        for j in range(i, LIMIT, i):
            div[j] += 1

    res = 0
    n = int(input())
    for i in range(1, n + 1):
        res += i * div[i]
    print(res)

if __name__ == "__main__":
    solve()
```

To use this code, you simply run it with Python and input the number when prompted. For instance:

```bash
echo 4 | python script.py
```

This should print out `-10`, which is the expected output according to your test case. However, I believe there might be a mistake in the expected output, since the original Java code does not include any behavior that would result in a negative number for this scenario. Instead, it will print the sum of the products of each index and the number of divisors for each number up to `n`. Please double-check the expected output for the given test case.
