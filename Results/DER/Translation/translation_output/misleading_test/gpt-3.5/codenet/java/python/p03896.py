```python
from sys import stdin, stdout

class I3y3sChallenge:
    def solve(self, n):
        if n == 2:
            return -1

        ans = [[0] * (n - 1) for _ in range(n)]
        for i in range(n - 1):
            for j in range(n - 1):
                if i == j:
                    ans[i][j] = n
                else:
                    ans[i][j] = j + 1

        for i in range(n - 1):
            ans[n - 1][i] = (i + 1) % (n - 1) + 1

        return ans

# Read input
n = int(input())

# Solve the problem
solver = I3y3sChallenge()
result = solver.solve(n)

# Output the result
for row in result:
    print(*row)

print("S")
```

