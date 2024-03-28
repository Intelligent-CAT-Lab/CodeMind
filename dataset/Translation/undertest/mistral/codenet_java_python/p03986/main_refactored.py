class main:
    # Sample test case
    x = "TSTTSS"
    
    # Initialize variables
    c = 0
    len = 0
    
    # Loop through each character in the input string
    for i in range(len(x)):
        # If current character is 'T', decrement count
        if x[i] == 'T':
            c -= 1
        # If count is negative, subtract it from length and reset count to 1
        elif c < 0:
            len -= c
            c = 1
        # Otherwise, increment count
        else:
            c += 1
    
    # Add absolute value of count to length and print result
    len += abs(c)
    print(len)