class main:
    def find_sum(N, M):
        sum = 0
        if N * 2 > M:
            sum = M // 2
        elif M > N * 2:
            sum = N
            sum = sum + ((M - N * 2) // 4)
        return sum
    
    # Test input:
    N, M = map(int, input().split())
    
    # Expected output:
    print(find_sum(N, M))