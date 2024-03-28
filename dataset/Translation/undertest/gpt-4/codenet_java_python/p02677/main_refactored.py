class main:
    import math
    
    def solve(A, B, H, M):
        a_x = A * math.sin(math.pi * 2 * (H * 60 + M) / 720)
        b_x = B * math.sin(math.pi * 2 * M / 60)
        a_y = A * math.cos(math.pi * 2 * (H * 60 + M) / 720)
        b_y = B * math.cos(math.pi * 2 * M / 60)
        
        return math.sqrt((a_x - b_x) ** 2 + (a_y - b_y) ** 2)
    
    # Test input
    A = 3
    B = 4
    H = 9
    M = 0
    
    # Expected output
    result = solve(A, B, H, M)
    print("{:.20f}".format(result))