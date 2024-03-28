class main:
    import math
    
    def gcd(a, b):
        if b == 0:
            return a
        else:
            return gcd(b, a % b)
    
    def solve():
        a, b = map(int, input().split())
        a, b = abs(a - 1), abs(b - 1)
        g = gcd(a, b)
        ans = (a // g + b // g - 1) * g
        print(ans)
    
    if __name__ == "__main__":
        solve()