```python
import sys

MODULO = 10**9 + 7

class TaskE:
    def solve(self, in_stream):
        def next_int():
            return int(next(in_stream))

        zeroes = next_int()
        ones = next_int()
        k = next_int()
        depth = (zeroes + ones - 1) // (k - 1)
        ways = [0] * (ones + 1)
        ways[0] = 1
        res = 0
        nice = [False] * (ones + 1)

        for i in range(1, depth + 1):
            nice = [False] * (ones + 1)
            for extra in range(depth - i + 1):
                now = ones - extra * (k - 1)
                if now >= 0:
                    nice[now] = True
            for old in range(ones, -1, -1):
                if ways[old] != 0:
                    for cur in range(1, k):
                        if old + cur <= ones:
                            if nice[old + cur]:
                                res += ways[old]
                                if res >= MODULO:
                                    res -= MODULO
                            ways[old + cur] += ways[old]
                            if ways[old + cur] >= MODULO:
                                ways[old + cur] -= MODULO

        return res

if __name__ == '__main__':
    solver = TaskE()
    result = solver.solve(sys.stdin)
    print(result)
```
