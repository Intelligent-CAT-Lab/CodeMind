Here is the Python version of the Java code provided:

```python
def check_circle_inside_rectangle(W, H, x, y, r):
    # Judgement processing
    if (x - r) >= 0 and (x + r) <= W:
        if (y - r) >= 0 and (y + r) <= H:
            return "Yes"
    return "No"

# Input handling
try:
    work = input().split()
    W, H, x, y, r = map(int, work)
    
    # Output
    result = check_circle_inside_rectangle(W, H, x, y, r)
    print(result)
except Exception as e:
    print(e)
```

To use the test case provided:

```python
# Test input and expected output
input_data = "5 4 2 2 1"
expected_output = "Yes"

# Simulate input
import io
import sys

backup = sys.stdin
sys.stdin = io.StringIO(input_data)

# Call the Python translated code
try:
    work = input().split()
    W, H, x, y, r = map(int, work)
    
    # Expected output
    result = check_circle_inside_rectangle(W, H, x, y, r)
    print(result)
    assert result == expected_output
finally:
    sys.stdin = backup
```

When you run this code, it should take the test input "5 4 2 2 1", process it and print the expected output "Yes". The `assert` statement is used to validate that the function's output matches the expected output.
