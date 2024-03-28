```python
import sys

class TaskC:
    mod = 998244353

    def solve(self, n):
        res = 7
        p2 = 8
        num = 1
        den = 2
        for i in range(1, n // 2):
            res *= 9
            if i > 1:
                inc = p2
                inc *= num
                inc %= TaskC.mod
                inc *= pow(den, TaskC.mod - 2, TaskC.mod)
                inc %= TaskC.mod
                res += inc
            res %= TaskC.mod
            p2 = (p2 * 2) % TaskC.mod

            k = i
            num *= 2 * k
            num %= TaskC.mod
            num *= 2 * k + 1
            num %= TaskC.mod
            if k > 1:
                den *= k - 1
            den %= TaskC.mod
            den *= k + 2
            den %= TaskC.mod

        return res

def pow(x, y, mod):
    x %= mod
    res = 1
    while y > 0:
        if y % 2 == 1:
            y -= 1
            res = (res * x) % mod
        else:
            y //= 2
            x = (x * x) % mod
    return res

if __name__ == '__main__':
    task = TaskC()
    n = int(input())
    result = task.solve(n)
    print(result)
```

