Below is the translated Python code from the given Java code template:

```python
import sys
import random

MOD = 1000 * 1000 * 1000 + 7
dx = [0, -1, 0, 1]
dy = [1, 0, -1, 0]

def shuffle(a):
    n = len(a)
    for i in range(n):
        r = i + int(random.random() * (n - i))
        a[i], a[r] = a[r], a[i]

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

def main():
    solve()

if __name__ == "__main__":
    main()
```

Please note that we removed the I/O handling details (such as `nextToken`, `nextInt`, `nextLong`, etc.) because Python has a simpler input mechanism using `input()` which reads a line from standard input as a string and `int(input())` to read an integer directly. We have replaced print PrintWriter with simple print() calls, which will output to stdout in Python. BufferedReader and StringTokenizer are not typically required in Python due to its efficient and simple string handling methods.
