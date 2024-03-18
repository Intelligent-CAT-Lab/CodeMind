Here is the Java code translated into Python:

```python
# Get the input string
s = input()

# Calculate the length of the string
leng = len(s)

# Output the abbreviation
print(f"{s[0]}{leng-2}{s[-1]}")
```

You can run a test case in Python as follows:

```python
# Test input
test_input = "internationalization"

# Expected output: .18n
# Running the solution with the test input
s = test_input
leng = len(s)
print(f"{s[0]}{leng-2}{s[-1]}")
```

This Python script will produce the output `.18n` when given the input `internationalization`.
