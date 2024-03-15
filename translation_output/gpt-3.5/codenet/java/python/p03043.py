```python
import sys
from typing import List

class Solver:
    def calc(self, n: int, st: int) -> int:
        ans = 1
        val = st
        while val < n:
            val *= 2
            ans *= 2
        return ans

    def solve(self, n: int, k: int) -> float:
        ans = 0
        for i in range(1, n+1):
            cnt = self.calc(k, i)
            wk = 1 / (cnt * n)
            ans += wk
        return ans

class MyInput:
    def __init__(self):
        self.buffer = []
        self.pos = 0

    def read(self):
        if not self.buffer or self.pos == len(self.buffer):
            self.buffer = input().split()
            self.pos = 0
        return self.buffer[self.pos]

    def next_int(self) -> int:
        return int(self.read())

    def next_string(self) -> str:
        return self.read()

def main():
    solver = Solver()
    input_data = MyInput()
    n = input_data.next_int()
    k = input_data.next_int()
    result = solver.solve(n, k)
    print(result)

if __name__ == "__main__":
    main()
```

