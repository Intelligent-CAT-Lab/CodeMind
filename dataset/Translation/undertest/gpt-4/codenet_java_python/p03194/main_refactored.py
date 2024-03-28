class main:
    # Import math module for power function
    import math
    
    # Read input
    n, p = map(int, input().split())
    
    # Initialize result variable
    res = 1
    
    # Check for the case when n equals to 1
    if n == 1:
        print(p)
    else:
        # Loop through potential divisors
        for i in range(2, int(p ** (1/n)) + 1):
            # Check if i raised to n divides p exactly
            if p % (i ** n) == 0:
                res = i
        # Print the result
        print(res)