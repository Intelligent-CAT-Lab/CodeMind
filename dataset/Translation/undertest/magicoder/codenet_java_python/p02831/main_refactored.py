class main:
    import math
    
    def calculate_lcm(A, B):
        gcd = math.gcd(A, B)
        lcm = A * B // gcd
        return lcm
    
    A, B = map(int, input().split())
    print(calculate_lcm(A, B))