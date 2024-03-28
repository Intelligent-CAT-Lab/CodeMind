class main:
    import sys
    
    def gcd(a, b):
        if b == 0:
            return a
        return gcd(b, a % b)
    
    def solve():
        a = int(raw_input())
        b = int(raw_input())
        a = abs(int(raw_input()) - a)
        b = abs(int(raw_input()) - b)
        g = gcd(a, b)
        ans = a / g + b / g - 1
        print ans * g
    
    if __name__ == '__main__':
        solve()