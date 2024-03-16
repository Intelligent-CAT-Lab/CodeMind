Here is the translated Python code for the given Java snippet:

```python
# Read input from the user
line = input().split(" ")

# Parse string input to integers
h = int(line[0])
a = int(line[1])

# Calculate the number of attacks needed
n = h // a
if h % a > 0:
    n += 1

# Output the result
print(n)
```

To test the input `10 4` in Python, you could do it like this:

```python
# Test case
input_data = "10 4"

# Mocking the input() function
def input():
    return input_data

# Rest of the translated code
line = input().split(" ")
h = int(line[0])
a = int(line[1])
n = h // a
if h % a > 0:
    n += 1
print(n)
```

If you run the above Python code snippet, it will output `3`, which matches the expected output.
