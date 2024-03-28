Here is the equivalent Python code for the provided Java code:

```python
# Read the inputs from the user
a = input().strip()
b = input().strip()

# Compare the inputs and print the result
if a == b:
    print("H")
else:
    print("D")
```

However, it seems there might be a small issue with the input as per the Sample Test input provided ("H H"). In Python, we would typically read this in a single line rather than two separate `input()` calls. If "H H" is intended to be taken as input in a single line, the code should reflect that:

```python
# Read the inputs from the user in a single line
a, b = input().split()

# Compare the inputs and print the result
if a == b:
    print("H")
else:
    print("D")
```

With this modified Python code, here's how you would run the sample test case:

Test input:
H H

Expected output:
H

Just enter "H H" in a single line when prompted for input.
