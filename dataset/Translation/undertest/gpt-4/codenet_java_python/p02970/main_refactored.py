class main:
    import math
    
    # Read the input
    N, D = map(int, input().split())
    
    # Calculate the result using math.ceil to mimic the CEILING rounding mode.
    ans = math.ceil(N / (D * 2 + 1))
    
    # Print the result
    print(ans)