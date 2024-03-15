```python
import sys
import io

class Solver:

    def calc(self, n, st):
        ans = 1
        val = st
        while val < n:
            val *= 2
            ans *= 2
        return ans

    def solve(self, N, K):
        ans = 0
        for i in range(1, N + 1):
            cnt = self.calc(K, i)
            wk = 1 / (cnt * N)
            ans += wk
        return ans


def main():
    input_iter = map(int, io.StringIO(sys.stdin.read()).read().split())
    N = next(input_iter)
    K = next(input_iter)
    
    solver = Solver()
    answer = solver.solve(N, K)
    print(answer)

if __name__ == "__main__":
    main()
```

This translation removes several parts of the original Java code that are either unnecessary in Python due to the dynamic typing and built-in high-level data structures, or because Python handles IO differently (with less boilerplate). The classes `Pair`, `PPP`, and `MyInput` were also removed since the reading of inputs is straightforward in Python using standard libraries like `sys` or `io`.
