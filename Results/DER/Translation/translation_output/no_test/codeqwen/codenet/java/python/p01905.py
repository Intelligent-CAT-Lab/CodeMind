Here is the Python version of the Java code:

```python
import sys

class p01905:
    def solve(self):
        self.N = int(sys.stdin.readline())
        self.M = int(sys.stdin.readline())

        self.a = [int(sys.stdin.readline()) for _ in range(self.M)]

        b = [True] * (self.N * 2 - 1)
        for i in range(self.M):
            b[self.a[i] + self.N - 1] = False

        for i in range(self.N * 2 - 2, 0, -2):
            if b[i] and b[i - 1]:
                b[(i - 2) // 2] = True
            elif b[i] or b[i - 1]:
                b[(i - 2) // 2] = True
            else:
                b[(i - 2) // 2] = False

        ans = 0
        for i in range(self.N - 1):
            if b[i * 2 + 1] and b[i * 2 + 2]:
                ans += 1

        print(ans)

if __name__ == "__main__":
    p = p01905()
    p.solve()
```

This Python code does the same thing as the Java code. It reads input from the standard input, processes it, and writes the output to the standard output. The main difference is that Python does not have a built-in class system like Java, so we define a class `p01905` and use its methods to perform the operations. The `solve` method is responsible for reading the input, processing it, and writing the output. The `main` method creates an instance of `p01905` and calls its `solve` method.
