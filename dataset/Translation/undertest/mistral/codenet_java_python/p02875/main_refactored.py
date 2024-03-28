class main:
    import sys
    
    def solve(n):
        res = 7
        p2 = 8
        num = 1
        den = 2
        for i in range(1, n):
            res *= 9
            if i > 1:
                inc = p2
                inc *= num
                inc %= 998244353
                inc *= (den - 1) % 998244353
                inc %= 998244353
                res += inc
            res %= 998244353
            p2 = (p2 * 2) % 998244353
            num *= (2 * i + 1) % 998244353
            num %= 998244353
            den *= (i + 2) % 998244353
            den %= 998244353
        return res
    
    if __name__ == "__main__":
        n = int(input())
        print(solve(n))