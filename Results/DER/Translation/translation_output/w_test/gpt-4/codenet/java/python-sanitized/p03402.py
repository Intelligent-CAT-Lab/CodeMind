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