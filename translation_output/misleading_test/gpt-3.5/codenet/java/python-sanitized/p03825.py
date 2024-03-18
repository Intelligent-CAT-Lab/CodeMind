import sys

MODULO = int(1e9 + 7)

def solve(zeroes, ones, k):
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

if __name__ == "__main__":
    line = sys.stdin.readline().strip()
    zeroes, ones, k = map(int, line.split())
    result = solve(zeroes, ones, k)
    print(result)