Below is the translated version of the given Java code into Python:

```python
import sys

def solve(n, K):
    ans = 0
    for i in range(K + 1, n + 1):
        for j in range(0, n // i + 1):
            if i * (j + 1) - 1 <= n:
                ans += i - K
            else:
                ans += max(i - K - (i * (j + 1) - 1 - n), 0)
    if K == 0:
        ans -= n
    return ans

def main():
    inputs = input().split()
    n, K = int(inputs[0]), int(inputs[1])
    result = solve(n, K)
    print(result)

if __name__ == "__main__":
    main()
```

You can use the following sample test case to check if the output is as expected:

Test input:
```
5 2
```

Expected output:
```
7
```

Copy and paste the Python code into a Python interpreter or file, input the test case, and run the program to determine if it provides the correct output.
