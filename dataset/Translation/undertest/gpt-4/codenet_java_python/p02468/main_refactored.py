class main:
    import sys
    
    MOD = 1000000007
    
    def power(a, b, mod):
        result = 1
        while b > 0:
            if b % 2:
                result = (result * a) % mod
            a = (a * a) % mod
            b //= 2
        return result
    
    def solve():
        m, n = map(int, input().split())
        print(power(m, n, MOD))
    
    if __name__ == "__main__":
        solve()