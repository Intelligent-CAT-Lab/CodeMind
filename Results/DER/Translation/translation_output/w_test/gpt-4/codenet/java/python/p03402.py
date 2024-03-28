Below is the translated Python code:

```python
import sys
import math
from collections import defaultdict, deque, Counter
from bisect import bisect_left, bisect_right
from itertools import permutations, accumulate
from functools import lru_cache

DEBUG = len(sys.argv) > 1 and sys.argv[1] == "-DEBUG"


def err_print(*args, **kwargs):
    if DEBUG:
        print(*args, file=sys.stderr, **kwargs)


def get_ints():
    return list(map(int, sys.stdin.readline().strip().split()))


def get_string():
    return sys.stdin.readline().strip()


class Solver:
    def __init__(self):
        pass

    def solve(self):
        h, w = get_ints()
        h -= 1
        w -= 1
        num = 100
        ans = [[False] * num for _ in range(num)]
        for i in range(num):
            for j in range(num):
                ans[i][j] = j < num // 2
        for i in range(0, num, 2):
            for j in range(0, num // 2, 2):
                if h <= 0:
                    break
                ans[i][j] = not ans[i][j]
                h -= 1
            for j in range(num // 2 + 1, num, 2):
                if w <= 0:
                    break
                ans[i][j] = not ans[i][j]
                w -= 1
        print(num, num)
        for i in range(num):
            print("".join(['#' if ans[i][j] else '.' for j in range(num)]))


if __name__ == '__main__':
    solver = Solver()
    solver.solve()
```

The test case from the question's prompt is as follows:
```shell
# Input from file or standard input:
2 3

# Expected output:
100 100
#...................................................................................................
....................................................................................................
#...................................................................................................
....................................................................................................
#...................................................................................................
....................................................................................................
#...................................................................................................
....................................................................................................
#...................................................................................................
....................................................................................................
[...additional lines truncated...]
```

When running the translated Python code, substitute `2 3` for the actual input values that you want to test. Note that because the program reads from standard input, you need to ensure that the input is provided in the way the program expects.
