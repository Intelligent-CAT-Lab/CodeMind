class main:
    import math
    import sys
    
    def solve():
        n, k = map(int, input().split())
        k -= 1
        sins = [math.sin(2 * math.pi * i / n) / 2 for i in range(n + 1)]
    
        low, high = 0, 2 * math.pi
        for rep in range(50):
            h = (low + high) / 2
            if count(h, n, sins) <= k:
                low = h
            else:
                high = h
        print("{:.14f}".format(high))
    
    def count(h, n, sins):
        result = 0
        for len in range(1, n):
            low, high = 0, (n - len) // 2 + 1
            while high - low > 1:
                q = (high + low) >> 1
                if s(len, q, n - len - q, sins) <= h:
                    low = q
                else:
                    high = q
            result += low * 2
            if low == (n - len) // 2 and (n - len) % 2 == 0:
                result -= 1
        assert result * n % 3 == 0
        return result * n // 3
    
    def s(a, b, c, sins):
        return sins[a] + sins[b] + sins[c]
    
    if __name__ == "__main__":
        solve()