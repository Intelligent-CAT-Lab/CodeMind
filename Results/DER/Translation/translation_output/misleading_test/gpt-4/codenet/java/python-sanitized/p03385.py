def check_abc_presence(input_string):
    # Create a boolean list to mark the presence of 'a', 'b', and 'c'
    abc = [False, False, False]

    # Iterate over each character in the input string
    for char in input_string:
        if char == 'a':
            abc[0] = True
        if char == 'b':
            abc[1] = True
        if char == 'c':
            abc[2] = True

    # Check if all 'a', 'b', and 'c' were found
    is_OK = all(abc)

    # Return "Yes" if all found, otherwise "No"
    return "Yes" if is_OK else "No"

# Test input
test_input = "bac"

# Expected output: "Yes"
print(check_abc_presence(test_input))