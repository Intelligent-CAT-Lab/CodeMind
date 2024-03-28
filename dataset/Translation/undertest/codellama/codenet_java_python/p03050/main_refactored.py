class main:
    import math
    
    def solve(n):
        ans = 0
        for i in range(1, int(math.sqrt(n)) + 1):
            if n % i == 0:
                m = n // i - 1
                if i < m:
                    ans += m
        return ans
    
    n = int(input())
    print(solve(n))