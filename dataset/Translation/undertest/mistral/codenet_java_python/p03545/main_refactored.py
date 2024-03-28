class main:
    # Test input: 1222
    # Expected output: 1+2+2+2=7
    
    # Read input
    num = input()
    
    # Split input into 4 characters
    chars = list(num)
    
    # Convert characters to integers
    a = int(chars[0])
    b = int(chars[1])
    c = int(chars[2])
    d = int(chars[3])
    
    # Initialize answer list
    ans = ['+', '+', '+']
    
    # Check if a+b+c+d=7
    if a + b + c + d == 7:
        ans[0] = '+'
        ans[1] = '+'
        ans[2] = '+'
    
    # Check if a+b+c-d=7
    elif a + b + c - d == 7:
        ans[0] = '+'
        ans[1] = '+'
        ans[2] = '-'
    
    # Check if a+b-c+d=7
    elif a + b - c + d == 7:
        ans[0] = '+'
        ans[1] = '-'
        ans[2] = '+'
    
    # Check if a-b+c+d=7
    elif a - b + c + d == 7:
        ans[0] = '-'
        ans[1] = '+'
        ans[2] = '+'
    
    # Check if a+b-c-d=7
    elif a + b - c - d == 7:
        ans[0] = '+'
        ans[1] = '-'
        ans[2] = '-'
    
    # Check if a-b+c-d=7
    elif a - b + c - d == 7:
        ans[0] = '-'
        ans[1] = '-'
        ans[2] = '+'
    
    # Check if a-b-c+d=7
    elif a - b - c + d == 7:
        ans[0] = '-'
        ans[1] = '-'
        ans[2] = '+'
    
    # Check if a-b-c-d=7
    elif a - b - c - d == 7:
        ans[0] = '-'
        ans[1] = '-'
        ans[2] = '-'
    
    # Print answer
    print(a, ans[0], b, ans[1], c, ans[2], d, "=7")