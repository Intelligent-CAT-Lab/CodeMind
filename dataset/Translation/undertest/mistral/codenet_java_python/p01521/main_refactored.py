class main:
    # Sample test case
    input = "oxxoxoo"
    
    # Expected output
    output = "o"
    
    # Python code
    c = input[0] == 'x' and input[-1] == 'x'
    print(c)