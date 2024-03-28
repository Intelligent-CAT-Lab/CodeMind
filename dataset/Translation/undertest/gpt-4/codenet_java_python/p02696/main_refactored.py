class main:
    # Read input from user
    a, b, n = map(int, input().split())
    
    # Calculate and print the result based on given conditions
    if n >= b:
        print(a * (b-1) // b)
    else:
        print(a * n // b)