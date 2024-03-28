class main:
    import math
    
    def combination(n, r):
        return math.factorial(n) // (math.factorial(r) * math.factorial(n - r))
    
    n, k = map(int, input().split())
    print(combination(k, n))