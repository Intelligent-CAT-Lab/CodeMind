class main:
    # Python code
    
    # Get input from user
    a, b, c = map(int, input().split())
    
    # Initialize result as "No"
    result = "No"
    
    # Check if c is between a and b
    if a <= c <= b:
        result = "Yes"
    
    # Print result
    print(result)