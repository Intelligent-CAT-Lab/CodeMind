class main:
    # Python implementation of the given Java code
    
    # Read input string from user
    input_str = input()
    
    # Initialize an empty string to store the output
    output_str = ""
    
    # Iterate over the characters in the input string in reverse order
    for i in range(len(input_str)-1, -1, -1):
        # Append the current character to the output string
        output_str += input_str[i]
    
    # Print the output string
    print(output_str)