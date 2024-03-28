class main:
    # Read input from user
    a, b = map(int, input().split())
    
    # Initialize variables
    r1, x1, y1 = a, 1, 0
    r2, x2, y2 = b, 0, 1
    
    # Extended Euclidean Algorithm
    while r2 != 0:
        q, r3 = divmod(r1, r2)
        x3 = x1 - q * x2
        y3 = y1 - q * y2
        r1, x1, y1 = r2, x2, y2
        r2, x2, y2 = r3, x3, y3
    
    # Print the results
    print(f"{x1} {y1}")