Here's the Java code translated into Python and enclosed within triple backticks:

```python
# Read input from the user
s1 = input()

ans = 0
c1 = 0
c0 = 0

# Iterate through the characters in the input string
for char in s1:
    if char == '1':
        if c0 > 0:
            c0 -= 1
            ans += 1
        else:
            c1 += 1
    else:  # char == '0'
        if c1 > 0:
            c1 -= 1
            ans += 1
        else:
            c0 += 1

# Print the result multiplied by 2
print(ans * 2)
```

This Python code assumes that the input will be provided in a similar fashion to how it's done in Java, only taking into consideration that Python's `input()` function reads a line from standard input as a string.
