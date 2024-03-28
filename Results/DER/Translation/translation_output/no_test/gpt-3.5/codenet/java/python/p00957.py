```python
import sys
from io import StringIO
import math

class MyScanner:
    def __init__(self):
        self.input_buffer = sys.stdin.buffer 
        self.st = None
        self.pos = 0

    def readline(self):
        self.st = self.input_buffer.readline().split()
        self.pos = 0

    def next(self) -> str:
        if self.st is None or self.pos == len(self.st):
            self.readline()
        self.pos += 1
        return self.st[self.pos-1]

    def nextInt(self) -> int:
        return int(self.next())

    def nextLong(self) -> int:
        return int(self.next())

class MyPrint:
    def __init__(self):
        self.output_buffer = StringIO()
        
    def println(self, value):
        self.output_buffer.write(str(value) + '\n')

    def flush(self):
        print(self.output_buffer.getvalue(), end='')

def main():
    sc = MyScanner()
    out = MyPrint()
    l = sc.nextInt()
    k = sc.nextInt()
    dp = [[0] * (l+1) for _ in range(2)]
    dp[0][0] = 1
    for i in range(1, l+1):
        dp[0][i] += dp[1][i-1]
        dp[1][i] += dp[0][i-1]
        if i >= k:
            dp[1][i] += dp[0][i-k]
    ans = sum(dp[1][1:])
    out.println(ans)
    out.flush()

if __name__ == "__main__":
    main()
```

