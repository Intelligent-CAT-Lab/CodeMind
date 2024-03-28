class main:
    import math
    
    def solve(n1):
        n = (math.sqrt(1 + (8 * n1)) - 1) // 2
        ans = n1 - ((n + 1) * n) // 2
        return ans if ans != 0 else n
    
    n1 = int(input())
    print(solve(n1))