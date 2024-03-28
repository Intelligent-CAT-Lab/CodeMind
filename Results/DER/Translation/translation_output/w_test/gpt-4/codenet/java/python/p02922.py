Here's the translated code from Java to Python:

```python
# Get input from user
a, b = map(int, input().split())

# Compute the answer
ans = (b-1) // (a-1)
if (b-1) % (a-1) == 0:
    print(ans)
else:
    print(ans + 1)
```

To run the test case with the input `4 10` you would do:

```python
# Test input
test_input = "4 10"

# Simulate the input by splitting the string and converting it into integers
a, b = map(int, test_input.split())

# Compute the answer
ans = (b-1) // (a-1)
if (b-1) % (a-1) == 0:
    print(ans) # Expected output: 3
else:
    print(ans + 1)
```

You can provide input to Python code when running in the console by using `a, b = map(int, input().split())` or by simulating the user input in the code as shown in the test case with `test_input`.
