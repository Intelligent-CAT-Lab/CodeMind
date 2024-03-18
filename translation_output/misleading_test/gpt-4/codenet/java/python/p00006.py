Here is the equivalent Python code for the given Java code, which takes an input string and reverses it:

```python
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
```

This code should work similarly to the original Java code. It reads a string from the standard input, reverses it, and then prints the reversed string. Additionally, I've added the test case with the expected output to demonstrate that the function works as intended. The testing part temporarily replaces Python's `input` function to simulate the input for the test case and captures the output to verify it against the expected result. After the test, the `input` function and `stdout` are restored.
