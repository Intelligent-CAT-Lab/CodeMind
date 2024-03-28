import sys

def main():
    zeroes, ones, k = map(int, sys.stdin.readline().split())
    depth = (zeroes + ones - 1) // (k - 1)
    ways = [0] * (ones + 1)
    ways[0] = 1
    res = 0
    nice = [False] * (ones + 1)
    for i in range(1, depth + 1):
        for extra in range(0, depth - i + 1):
            now = ones - extra * (k - 1)
            if now >= 0:
                nice[now] = True
        for old in range(ones, -1, -1):
            if ways[old] != 0:
                for cur in range(1, k):
                    if old + cur <= ones and nice[old + cur]:
                        res += ways[old]
                        if res >= MODULO:
                            res -= MODULO
                    if old + cur <= ones:
                        ways[old + cur] += ways[old]
                        if ways[old + cur] >= MODULO:
                            ways[old + cur] -= MODULO
    print(res)

MODULO = int(1e9 + 7)
main()