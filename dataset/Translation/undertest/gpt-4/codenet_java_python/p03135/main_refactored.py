class main:
    # Get input from the user as a string and split it by space, converting each to an integer
    T, X = map(int, input().split())
    
    # Perform the division and store the result in variable 'a'
    a = T / X
    
    # Print the result with 10 decimal places
    print(f"{a:.10f}")