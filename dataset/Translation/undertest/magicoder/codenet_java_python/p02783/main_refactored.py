class main:
    # Python code
    
    # Read input
    h, a = map(int, input().split())
    
    # Calculate number of days
    n = h // a
    if h % a > 0:
        n += 1
    
    # Print result
    print(n)