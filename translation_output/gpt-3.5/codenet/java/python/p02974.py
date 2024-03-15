```python
import io
import sys

INPUT = ""
is_input_file = False


def solve():
    n = ni()
    K = ni()
    if K % 2 == 1:
        out.println(0)
        return
    mod = 1000000007
    dp = [[0] * (2 * n * n + 1) for _ in range(n + 1)]
    dp[0][n * n] = 1
    for i in range(1, n + 1):
        ndp = [[0] * (2 * n * n + 1) for _ in range(n + 1)]
        for j in range(n + 1):
            for k in range(2 * n * n + 1):
                if dp[j][k] == 0:
                    continue
                # add source
                if j + 1 <= n and k - i >= 0:
                    ndp[j + 1][k - i] += dp[j][k]
                    ndp[j + 1][k - i] %= mod
                # add sink or local sink
                if j - 1 >= 0 and k + i <= 2 * n * n:
                    ndp[j - 1][k + i] += dp[j][k] * j * j
                    ndp[j - 1][k + i] %= mod
                # add intermediate point
                ndp[j][k] += dp[j][k] * 2 * j
                ndp[j][k] %= mod
                # add isolated point
                ndp[j][k] += dp[j][k]
                ndp[j][k] %= mod
        dp = ndp
    out.println(dp[0][K // 2 + n * n])


def main():
    global INPUT
    S = 0
    
    if is_input_file:
        with open(INPUT, 'r') as file:
            INPUT = file.read()
    
    S = time.time()
    solve()
    out.flush()
    G = time.time()
    print(f"{G - S:.2f}ms")


def ni():
    return int(ns())

def nd():
    return float(ns())

def ns():
    while len(INPUT) == 0 or not INPUT[0] >= '!' and INPUT[0] <= '~':
        read_byte()
    i = 0
    while i < len(INPUT) and (INPUT[i] >= '!' and INPUT[i] <= '~'):
        i += 1
    s = INPUT[:i]
    INPUT = INPUT[i:]
    return s

def read_byte():
    global INPUT
    if not is_input_file:
        return input()
    if len(INPUT) == 0:
        raise EOFError
    c = INPUT[0]
    INPUT = INPUT[1:]
    return c

    
if __name__ == "__main__":
    INPUT = """Input your test cases here"""
    is_input_file = False
    out = sys.stdout
    main()
```
