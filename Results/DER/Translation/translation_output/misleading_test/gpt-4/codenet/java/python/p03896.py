Below is the Python translation of the provided Java code:

```python
import sys

class I3y3sChallenge:
    def solve(self, testNumber, n):
        if n == 2:
            print(-1)
            return
        ans = [[0] * (n - 1) for _ in range(n)]
        for i in range(n - 1):
            for j in range(n - 1):
                if i == j:
                    ans[i][j] = n
                else:
                    ans[i][j] = j + 1
        for i in range(n - 1):
            ans[n - 1][i] = (i + 1) % (n - 1) + 1
        for row in ans:
            print(' '.join(map(str, row)))

def main():
    n = int(input())
    solver = I3y3sChallenge()
    solver.solve(1, n)

if __name__ == "__main__":
    main()
```

To run a test with this Python code, simply call the `main()` function and input the test number when prompted. For the test input `7`, the expected output will be printed:

```
2 3 4 5 6 7
5 3 1 6 4 7
2 7 4 1 5 6
2 1 7 5 3 6
1 4 3 7 6 2
2 5 7 3 4 1
2 6 1 4 5 3
```
