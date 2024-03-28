class main:
    def atcoder_ABC142_A(N):
        sum = 0
        for i in range(1, N + 1):
            if i % 2 != 0:
                sum += 1
        return sum / N
    
    # Test input
    N = 64
    
    # Expected output
    print(atcoder_ABC142_A(N))