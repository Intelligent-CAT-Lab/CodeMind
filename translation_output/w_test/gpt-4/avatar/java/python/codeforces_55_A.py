Below is the equivalent code in Python:

```python
# read the input from user
n = int(input())

# check if the number is a power of two
if (n & (n - 1)) == 0:
    print("YES")
else:
    print("NO")
```

Here is how you would use this in a test case:

```python
# Sample test input
n = 512

# Test case and expected output
if (n & (n - 1)) == 0:
    print("YES")  # Expected output: YES
else:
    print("NO")
```
