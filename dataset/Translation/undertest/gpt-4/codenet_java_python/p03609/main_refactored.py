class main:
    # Get input from the user and split it into two integers x and t
    x, t = map(int, input().split())
    
    # Check if x is greater than t and print the difference, otherwise print 0
    if x > t:
        print(x - t)
    else:
        print(0)