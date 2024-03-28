class main:
    # Read input from user
    input_data = input().split()  # Split the input string by spaces
    
    # Parse input to integers
    n, a, b, c = map(int, input_data)  # Map the split string inputs to integers
    
    # Print the result
    print(n - a - b + c)