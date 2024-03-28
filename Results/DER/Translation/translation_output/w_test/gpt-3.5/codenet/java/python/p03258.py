```python
import sys

MODULO = 10**9 + 7

def solve():
    s = input()
    alternating = True
    for i in range(len(s) - 1):
        if s[i] == s[i + 1]:
            alternating = False
            break

    if alternating:
        print(1)
        return

    sum = [0] * (len(s) + 1)
    for i in range(len(s)):
        sum[i + 1] = sum[i]
        if s[i] == 'a':
            sum[i + 1] += 1
        elif s[i] == 'b':
            sum[i + 1] += 2
        else:
            raise RuntimeError
        sum[i + 1] %= 3

    next = [[len(s) + 1] * (len(s) + 2) for _ in range(3)]
    for i in range(3):
        next[i][len(s) + 1] = len(s) + 1

    for pos in range(len(s), -1, -1):
        for i in range(3):
            next[i][pos] = next[i][pos + 1]
        next[sum[pos]][pos] = pos

    total = sum[len(s)]

    ways = [0] * (len(s) + 2)
    ways[0] = 1

    for i in range(len(s) + 1):
        need = (sum[i] + 1) % 3
        ways[next[need][i]] += ways[i]
        ways[next[need][i]] %= MODULO
        need = (sum[i] + 2) % 3
        ways[next[need][i]] += ways[i]
        ways[next[need][i]] %= MODULO

    res = 0
    for i in range(1, len(s) + 1):
        if sum[i] == total:
            res = (res + ways[i]) % MODULO

    print(res)

if __name__ == "__main__":
    solve()
```
```
