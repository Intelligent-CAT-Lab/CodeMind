Here's the translated Python code:

```python
A, B, C = map(int, input().split())

if A == B:
    print(C)
elif B == C:
    print(A)
else:
    print(B)
```

To test the code with the provided input, you can run it and enter "5 7 5" when prompted for input, or possibly using the following test script:

```python
# Test function with input and expected output
def test(input_str, expected_output):
    original_input = builtins.input
    builtins.input = lambda: input_str
    try:
        # Redirect stdout to capture the print output
        from io import StringIO
        import sys

        captured_output = StringIO()
        sys.stdout = captured_output
        
        # Run the code
        A, B, C = map(int, input().split())

        if A == B:
            print(C)
        elif B == C:
            print(A)
        else:
            print(B)
        
        # Restore stdout
        sys.stdout = sys.__stdout__
        
        # Check if the captured output matches expected output
        assert captured_output.getvalue().strip() == str(expected_output), f"Test failed for input: {input_str}"
        print(f"Test passed for input: {input_str}")
    except AssertionError as e:
        print(e)
    finally:
        # Restore the original input method
        builtins.input = original_input

# Run the test
import builtins
test('5 7 5', 90)
```

This test function captures the output of the code block and compares it to the expected output to verify correctness. Make sure you have not changed any global Python behaviors before running such tests.
