class main:
    import math
    
    # Read input
    n1 = int(input())
    # Calculate n using the formula
    n = int((math.sqrt(1 + (8 * n1)) - 1) / 2)
    # Calculate the answer
    ans = n1 - (((n + 1) * n) // 2)
    # Print the result
    print(ans if ans != 0 else n)
    
    # Sample test case
    sample_input = 99992
    print(sample_input)