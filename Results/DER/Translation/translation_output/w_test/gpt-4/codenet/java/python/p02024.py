Here is the equivalent code in Python:

```python
# Read the inputs as integers
h, w, s, t = map(int, input().split())

# Check if both condition holds
if h * w % 2 == 1 and (s * w + t) % 2 == 1:
    print("No")
else:
    print("Yes")
```

To test the provided input, you can run the following:

```python
# Sample Test Case
test_input = "4 5 2 3"
input_values = test_input.split()

# Assign the inputs to respective variables by converting them to integers
h, w, s, t = map(int, input_values)

# Check using the condition from java code
if h * w % 2 == 1 and (s * w + t) % 2 == 1:
    print("No")
else:
    print("Yes")

# Expected output should be "Yes"
```
