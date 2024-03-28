class main:
    # Read inputs from the user.
    a, b = map(int, input().split())
    
    # Check the condition and print the result.
    if b >= a:
        print(a)
    else:
        print(a - 1)