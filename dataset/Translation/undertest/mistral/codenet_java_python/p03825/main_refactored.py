class main:
    import sys
    
    def solve(zeroes, ones, k):
        depth = (zeroes + ones - 1) // (k-1)
        ways = [1] * (ones + 1)
        res = 0
        nice = [False] * (ones + 1)
        for i in range(1, depth + 1):
            nice[0] = True
            for extra in range(1, i + 1):
                now = ones - extra * (k - 1)
                if now >= 0:
                    nice[now] = True
            for old in range(ones - 1, -1, -1):
                if ways[old] != 0:
                    for cur in range(1, k and old + cur <= ones):
                        if nice[old + cur]:
                            res += ways[old]
                            if res >= 10**9 + 7:
                                res %= 10**9 + 7
                    ways[old + cur] += ways[old]
                    if ways[old + cur] >= 10**9 + 7:
                        ways[old + cur] %= 10**9 + 7
        return res
    
    if __name__ == "__main__":
        zeroes = int(input())
        ones = int(input())
        k = int(input())
        res = solve(zeroes, ones, k)
        print(res)