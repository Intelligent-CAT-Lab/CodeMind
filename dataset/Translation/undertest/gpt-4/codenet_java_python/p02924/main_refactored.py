class main:
    # Test input
    n = int(input())
    
    # Main Processing
    result = 0
    for i in range(n - 1, 0, -1):
        result += i
    
    # Output
    print(result)