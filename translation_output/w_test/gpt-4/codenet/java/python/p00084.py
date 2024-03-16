Below is the translated code from Java to Python:

```python
# Read input from user
try:
    while True:
        str_input = input()
        # Replace punctuation with spaces
        str_input = str_input.replace('.', ' ').replace(',', ' ')
        # Split the string into tokens
        tokens = str_input.split()
        # Initialize counter for the number of words printed
        count = 0

        # Iterate over each token and check the length
        for token in tokens:
            n = len(token)

            # If the token length is within the specified range, print it
            if 3 <= n <= 6:
                # Print a space before the token if it's not the first one
                if count > 0:
                    print(" ", end='')
                print(token, end='')
                count += 1
                
        # If at least one word was printed, move to a new line
        if count > 0:
            print()
except EOFError:
    # End of file (or input stream), stop the loop
    pass
```

Note that Java's `Scanner.hasNext()` is used to check if there's more input to read, which generally implies reading from a file or standard input until EOF is reached. In Python, inputs are usually read in a loop until an `EOFError` is raised (for example, when a user enters Ctrl+D in a Unix-like system or Ctrl+Z followed by Enter in Windows in the command line shell).

Here is a sample test case to check the Python code:

```python
# Input emulator function for testing purposes
def input_emulator(input_list):
    for _input in input_list:
        yield _input
    raise EOFError

# Test input
test_inputs = [
    'Rain, rain, go to Spain.',
]

# Replace 'input' function with the emulator
input = input_emulator(test_inputs).__next__

# Run the translated Python code
try:
    while True:
        str_input = input()
        str_input = str_input.replace('.', ' ').replace(',', ' ')
        tokens = str_input.split()
        count = 0
        for token in tokens:
            n = len(token)
            if 3 <= n <= 6:
                if count > 0:
                    print(" ", end='')
                print(token, end='')
                count += 1
        if count > 0:
            print()
except EOFError:
    pass
```

This block of code will emulate the input as being 'Rain, rain, go to Spain.' and run the translated Python code providing the expected output 'Rain rain Spain'. Note that it won't work if just copy-pasted into a non-interactive environment, as it relies on replacing the `input` function. It should be used in an environment that supports dynamic replacement of stdin, such as an interactive Python shell.
