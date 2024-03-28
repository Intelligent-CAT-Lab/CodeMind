class main:
    import math
    
    def solve(n):
        ans = 0
        for i in range(1, int(math.sqrt(n)) + 1):
            if n % i == 0:
                ans += i * (n // i) * (n // i + 1) // 2
        return ans
    
    n = 9995083
    print(solve(n))