```python
import sys

MOD = None
N = None
table = None

class MyScanner:
    def __init__(self):
        self.tokenizer = None

    def next(self):
        self.tokenizer = iter(sys.stdin.readline().split())
        return next(self.tokenizer)

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

def main():
    global MOD, N, table
    sc = MyScanner()
    N = sc.nextInt()
    MOD = sc.nextInt()

    table = [[0 for _ in range(N + 1)] for _ in range(N + 1)]

    for rem in range(N + 1):
        table[N][rem] = rem

    for pos in range(N - 1, 0, -1):
        for rem in range(N + 1):
            table[pos][rem] = table[pos + 1][rem]
            factor = min(pos, N + 1 - pos)
            if factor < rem:
                table[pos][rem] += table[pos][rem - factor]
                table[pos][rem] %= MOD

    print(table[1][N])

if __name__ == "__main__":
    main()
```

