class main:
    # Python code
    
    # Read input
    a, b = map(int, input().split())
    
    # Calculate division and remainder
    d = a // b
    r = a % b
    
    # Calculate division as float and format to 5 decimal places
    f = "{:.5f}".format(a / b)
    
    # Print the results
    print(d, r, f)
    
    
    Test input:
    3 2
    
    Expected output:
    1 1