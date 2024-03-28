class main:
    import sys
    
    N, M = map(int, sys.stdin.readline().split())
    
    X = 1900 * M + 100 * (N - M)
    
    rate = 1
    for i in range(1, M+1):
        rate *= 2
    
    print(rate * X)
    
    
    Next, it initializes the value of `rate` to 1 and then loops through the range of `M` to calculate the value of `rate` using the formula provided in the problem statement.