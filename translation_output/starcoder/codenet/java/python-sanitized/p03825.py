import sys

MODULO = 1000000007

def solve(zeroes, ones, k):
    depth = (zeroes + ones - 1) // (k - 1)
    ways = [0] * (ones + 1)
    ways[0] = 1
    res = 0
    nice = [False] * (ones + 1)
    for i in range(1, depth + 1):
        for extra in range(depth - i + 1):
            now = ones - extra * (k - 1)
            if now >= 0:
                nice[now] = True
        for old in range(ones, -1, -1):
            if ways[old]!= 0:
                for cur in range(1, k):
                    if old + cur <= ones and nice[old + cur]:
                        res += ways[old]
                        res %= MODULO
                        ways[old + cur] += ways[old]
                        ways[old + cur] %= MODULO
    return res

def main():
    input = sys.stdin.readline
    zeroes = int(input())
    ones = int(input())
    k = int(input())
    print(solve(zeroes, ones, k))

if __name__ == '__main__':
    main()