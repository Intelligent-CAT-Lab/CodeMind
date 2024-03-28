Here's the equivalent Python code for the Java code provided. This Python code reads two integers from the input, adds them together, and then prints out their average.

```python
# Read the input from the user
input_numbers = input().split()

# Convert input strings to integers
num1 = int(input_numbers[0])
num2 = int(input_numbers[1])

# Calculate and print the average of the two numbers
print((num1 + num2) // 2)
```

To match it with the Java behavior, you could also import `sys` and read the input directly from `stdin`:

```python
import sys

# Read the input from stdin
input_numbers = sys.stdin.readline().strip().split()

# Convert input strings to integers
num1 = int(input_numbers[0])
num2 = int(input_numbers[1])

# Calculate and print the average of the two numbers
print((num1 + num2) // 2)
```

Both versions of this Python code will provide the expected output when the test input is provided.
