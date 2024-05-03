Here is the Python version of the Java code:

```python
import sys

class p01892:
    def __init__(self):
        self.A, self.B = map(int, input().split())
        self.N = int(input())

    def solve(self):
        ans = abs(self.A - self.B)
        for i in range(1, self.N + 1):
            for j in range(1, self.N + 1):
                if i * self.B % j != 0:
                    continue
                ans = min(ans, abs(self.A - i * self.B // j))
        print(ans)

if __name__ == "__main__":
    p = p01892()
    p.solve()
```

This Python code does the same thing as the Java code. It reads two integers and an integer N from the standard input, calculates the absolute difference between A and B, and then iterates over all possible pairs of integers (i, j) such that i * B is divisible by j. For each pair, it calculates the absolute difference between A and i * B // j and updates the minimum value of ans. Finally, it prints the minimum value of ans.
