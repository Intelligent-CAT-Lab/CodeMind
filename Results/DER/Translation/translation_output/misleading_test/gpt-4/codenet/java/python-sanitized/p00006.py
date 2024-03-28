# Read the input string
str_input = input()

# Reverse the string
reversed_str = str_input[::-1]

# Print the reversed string
print(reversed_str)

# Test the code with the provided input
if __name__ == "__main__":
    test_input = "w32nimda"
    expected_output = "admin23wn"

    # Temporarily replace the input function
    original_input = __builtins__.input
    __builtins__.input = lambda: test_input

    # Capture the output
    from io import StringIO
    import sys
    old_stdout = sys.stdout
    sys.stdout = mystdout = StringIO()

    # Run the code with the test input
    try:
        str_input = input()
        reversed_str = str_input[::-1]
        print(reversed_str)
    finally:
        # Restore the original input function and stdout
        __builtins__.input = original_input
        sys.stdout = old_stdout

    # Get the output and compare it with the expected output
    output = mystdout.getvalue().strip()
    assert output == expected_output, f"Expected output: '{expected_output}', but got '{output}'"