class main:
    import sys
    
    def solve(zeroes, ones, k):
        depth = (zeroes + ones - 1) // (k - 1)
        ways = [1] + [0] * ones
        res = 0
        nice = [False] * (ones + 1)
        for i in range(1, depth + 1):
            nice.fill(False)
            for extra in range(0, depth - i + 1):
                now = ones - extra * (k - 1)
                if now >= 0:
                    nice[now] = True
            for old in range(ones, -1, -1):
                if ways[old] != 0:
                    for cur in range(1, k):
                        if nice[old + cur]:
                            res += ways[old]
                            res %= 1000000007
                        ways[old + cur] += ways[old]
                        ways[old + cur] %= 1000000007
        return res
    
    if __name__ == "__main__":
        zeroes, ones, k = map(int, sys.stdin.readline().split())
        print(solve(zeroes, ones, k))