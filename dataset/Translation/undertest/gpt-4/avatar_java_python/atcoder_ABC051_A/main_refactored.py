class main:
    # Read the input as a single string
    input_string = input()
    
    # Split the string using ',' as the delimiter and unpack into variables
    a, b, c = input_string.split(',')
    
    # Print the output joined by spaces
    print(a, b, c)