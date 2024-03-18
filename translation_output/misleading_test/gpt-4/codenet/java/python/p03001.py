Here is the Java code translated into Python:

```python
# Read space-separated integers from input
w, h, x, y = map(int, input().split())

# Calculate the answer (the area of the rectangle divided by 2)
ans = w * h / 2

# Check if the cut goes through the center
a = 1 if x + x == w and y + y == h else 0

# Print the result
print(f"{ans} {a}")

# Test input execution
if __name__ == "__main__":
    # Expected input format: "2 3 1 2"
    # You can simulate this input in your code by running:
    # input_string = "2 3 1 2"
    # w, h, x, y = map(int, input_string.split())
    # And then using w, h, x, y as the variables in the calculation.
    
    # In an actual use-case, you would get the input from a user or an input stream and simply call:
    # w, h, x, y = map(int, input().split())
    
    # I have provided the rest of the code above as the actual implementation.
    
    # To test with the given input:
    # Execute with the provided test case
    _test_input = "2 3 1 2"
    _test_output = "-87.672301595963 43"  # Note that the expected output in the problem statement seems incorrect
    # Here we mimic the input (as if it was provided by the user or an input stream):
    import io
    import sys

    # Replace the standard input with our test input
    sys.stdin = io.StringIO(_test_input)

    # Redirect the standard output to capture the print statements
    sys.stdout = io.StringIO()

    # Call the main method to test it
    main()

    # Get the output and compare it with the expected output
    _output = sys.stdout.getvalue()

    # Cleanup: restore the standard input/output
    sys.stdin = sys.__stdin__
    sys.stdout = sys.__stdout__

    print("Test passed" if _output.strip() == _test_output else "Test failed")
```

Please note that the expected output given in the problem statement seems incorrect because the output of the program should be a float (representing half the area of the rectangle) and 0 or 1 indicating whether the cut goes through the center, not the values -87.672301595963 and 43 as stated. In the Python solution, the correct answer is printed based on the actual code logic.
