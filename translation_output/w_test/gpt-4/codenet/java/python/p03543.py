Here's the Python equivalent of the Java code provided:

```python
# Read input from user
n = int(input())

# Extract digits
n1 = n % 10
n10 = (n // 10) % 10
n100 = (n // 100) % 10
n1000 = n // 1000

# Check if any three digits are the same
if (n1 == n10 == n100) or (n10 == n100 == n1000):
    print("Yes")
else:
    print("No")
```

Here's a test case for you to try:

```python
# Test input
test_input = 1118

# Expected output: Yes
n = test_input

# Extract digits
n1 = n % 10
n10 = (n // 10) % 10
n100 = (n // 100) % 10
n1000 = n // 1000

# Check if any three digits are the same
if (n1 == n10 == n100) or (n10 == n100 == n1000):
    print("Yes")
else:
    print("No")
```

When you run this Python code with the test input provided (1118), the expected output will be "Yes".
