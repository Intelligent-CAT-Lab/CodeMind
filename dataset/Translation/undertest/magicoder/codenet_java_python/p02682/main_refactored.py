class main:
    # Python code
    
    # Read input
    a, b, c, d = map(int, input().split())
    
    # Initialize sum
    sum = 0
    
    # Check if d is less than or equal to a
    if d <= a:
        print(d)
        exit()
    
    # If not, add a to sum and subtract a from d
    sum += a
    d -= a
    
    # Check if d is less than or equal to b
    if d <= b:
        print(sum)
        exit()
    
    # If not, subtract b from d and add it to sum
    d -= b
    sum += d
    
    # Print the sum
    print(sum)