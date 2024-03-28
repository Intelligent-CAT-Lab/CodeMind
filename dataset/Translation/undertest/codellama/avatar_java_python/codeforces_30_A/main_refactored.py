class main:
    import math
    
    def solve(A, B, N):
        for x in range(-1000, 1001):
            if math.pow(x, N) * A == B:
                return x
        return "No solution"
    
    # Test case
    print(solve(7, 896, 7))  # 2