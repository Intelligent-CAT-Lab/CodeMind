```python
from sys import stdin, stdout
from collections import defaultdict


class TaskC:
    def solve(self, in_stream, out_stream):
        mod = 998244353
        n = int(in_stream.readline().strip()) // 2
        res = 7
        p2 = 8
        num = 1
        den = 2

        for i in range(1, n):
            res *= 9
            if i > 1:
                inc = p2 * num % mod
                inc *= pow(den, mod - 2, mod) % mod
                res = (res + inc) % mod

            p2 = (p2 * 2) % mod
            k = i
            num *= (2 * k) * (2 * k + 1) % mod
            num %= mod

            if k > 1:
                den *= k - 1
            den %= mod
            den *= k + 2
            den %= mod

        out_stream.write(str(res) + '\n')


def main():
    in_stream = stdin
    out_stream = stdout
    solver = TaskC()
    solver.solve(in_stream, out_stream)


if __name__ == "__main__":
    main()

```

