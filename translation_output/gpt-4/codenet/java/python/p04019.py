Here is the equivalent of the provided Java code in Python:

```python
# Read input from user using input()
s = input()

# Initialize check booleans
check_s = False
check_n = False
check_w = False
check_e = False

# Iterate over each character in the string
for char in s:
    if char == 'S':
        check_s = True
    elif char == 'N':
        check_n = True
    elif char == 'W':
        check_w = True
    elif char == 'E':
        check_e = True

# Check conditions and print the result
if check_s == check_n and check_w == check_e:
    print("Yes")
else:
    print("No")
```

The Python code does not need an import statement to use the `input()` function, and Python has a more straightforward syntax for iterating over strings and checking conditions.
