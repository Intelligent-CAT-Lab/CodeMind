Below is the Java code translated into Python, including an example test case with the input provided:

```python
# Read inputs from the user
x, y, z = map(int, input().split())
t = 0

# Loop from x to y and count how many times z is divisible by i
for i in range(x, y + 1):
    if z % i == 0:
        t += 1

# Print the result
print(t)

# Test input
# Input goes here: 5 14 80
# Expected output: 3
```

Currently, this code expects the user to input three integers (which would be 5 14 80 in the test case). If you wish to run this with a specific test case programmatically, you can replace the input line with the specific values as shown below:

```python
# Assign specific test values
x, y, z = 5, 14, 80
t = 0

# Loop from x to y and count how many times z is divisible by i
for i in range(x, y + 1):
    if z % i == 0:
        t += 1

# Print the result
print(t)

# Expected output: 3
```

When run with the value provided in the test case, this Python code will produce the expected output of 3.
