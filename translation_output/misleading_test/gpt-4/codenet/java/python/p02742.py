Below is the translated version of the provided Java code to Python:

```python
# Read input
w, h = map(int, input().split())

# Calculate and print result
if w == 1 or h == 1:
    print(1)
else:
    c = (w * h) // 2 if (w * h) % 2 == 0 else (w * h) // 2 + 1
    print(c)
```

To run the test case you provided with an input of `4 5`, you would call this Python function and pass the input as follows:

```python
# Test input
test_input = "4 5"

# Simulate inputting the test case
w, h = map(int, test_input.split())

# Calculate and print result following the same logic as the Java code
if w == 1 or h == 1:
    print(1)
else:
    c = (w * h) // 2 if (w * h) % 2 == 0 else (w * h) // 2 + 1
    print(c)
```

When you run this Python code with the input provided, the expected output should be `95`.
