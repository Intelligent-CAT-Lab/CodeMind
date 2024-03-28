import sys
from collections import defaultdict

MODULO = 10**9 + 7

def solve(zeroes, ones, k):
    depth = (zeroes + ones - 1) // (k - 1)
    ways = defaultdict(lambda: 0)
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

if __name__ == "__main__":
    input_vals = list(map(int, input().split()))
    ans = solve(input_vals[0], input_vals[1], input_vals[2])
    print(ans)