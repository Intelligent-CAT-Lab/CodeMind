class main:
    # Python code
    
    # Get input from user
    x, t = map(int, input().split())
    
    # Check if x is greater than t
    if x > t:
        print(x - t)
    else:
        print("0")