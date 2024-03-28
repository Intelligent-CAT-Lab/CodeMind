class main:
    def solve(n, k):
        return (n // k + 1) * k
    
    # Test case input
    n, k = map(int, input().split())
    
    # Output the result
    print(solve(n, k))