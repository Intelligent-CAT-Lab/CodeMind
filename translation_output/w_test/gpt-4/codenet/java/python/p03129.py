Here is the translated code from Java to Python:

```python
# Read the input from user
input_values = input().split()  # Split the input by space
x = int(input_values[0])  # Convert the first value to integer
y = int(input_values[1])  # Convert the second value to integer

# Determine and print the result
if (x + 1) // 2 >= y:
    print("YES")
else:
    print("NO")
```

To run the test case with the input "3 2", you would do the following in a Python environment:

```python
# Test input
test_input = "3 2"

# Simulate reading the test input (as if using input())
input_values = test_input.split()  # Split the test input by space
x = int(input_values[0])  # Convert the first value to integer
y = int(input_values[1])  # Convert the second value to integer

# Determine and print the result
if (x + 1) // 2 >= y:
    print("YES")
else:
    print("NO")
```

The expected output in this case would be "YES".
