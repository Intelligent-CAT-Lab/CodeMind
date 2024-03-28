class main:
    # Reading input
    a, b = map(int, input().split())
    
    # Calculating the division, remainder and exact quotient
    d = a // b
    r = a % b
    f = a / b
    
    # Displaying the results
    print(f"{d} {r} {f:.5f}")