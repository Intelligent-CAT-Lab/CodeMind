class main:
    # Python code
    
    # Get input from user
    a, b = map(int, input().split())
    
    # Check if b is greater than or equal to a
    if b >= a:
        print(a)
    else:
        print(a-1)