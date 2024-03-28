class main:
    import math
    
    def solver(n):
        sqrt = int(math.sqrt(n))
        x, y = 0, 0
        for i in range(sqrt, 0, -1):
            if n % i == 0:
                x = i
                y = n // i
                break
        ans = 0
        if x != 0 and y != 0:
            ans = x - 1 + y - 1
        else:
            ans = n - 1
        return ans
    
    def gcd(a, b):
        if b == 0:
            return a
        else:
            return gcd(b, a % b)
    
    n = int(input())
    print(solver(n))