class main:
    import sys
    import math
    from collections import defaultdict
    
    class Solver:
        def __init__(self):
            self.input = sys.stdin.readline
    
        def solve(self):
            n, p = map(int, self.input().split())
    
            def get_factors(num):
                factors = defaultdict(int)
                d = 2
                while d * d <= num:
                    while num % d == 0:
                        factors[d] += 1
                        num //= d
                    d += 1
                if num > 1:
                    factors[num] += 1
                return factors
    
            factors = get_factors(p)
            ans = 1
            for factor, count in factors.items():
                if count >= n:
                    ans *= math.pow(factor, count // n)
            
            print(int(ans))
    
    if __name__ == "__main__":
        solver = Solver()
        solver.solve()