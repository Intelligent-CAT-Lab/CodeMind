class main:
    def solver(N, A, B):
        base = N // (A + B)
        mod = N % (A + B)
        if mod >= A:
            mod = A
        return base * A + mod
    
    # Test input
    N = 501719768609305159
    A = 370614275896614890
    B = 131105492712690269
    
    # Expected output
    print(solver(N, A, B))
    
    #