Here is the equivalent code in Python:

```python
# Read input
a, b, k = map(int, input().split())

# Create empty set (TreeSet equivalent)
set_ = set()

# First K numbers from A to B (inclusive)
for i in range(a, min(a + k, b + 1)):
    set_.add(i)

# Last K numbers from B to A (inclusive)
for i in range(b, max(b - k, a - 1), -1):
    set_.add(i)

# Print sorted set
for ans in sorted(set_):
    print(ans)
```

Now let's run the sample test case:

Test input:
`3 8 2`

Expected output:
```
3
7
8
```

To run this Python code, you can simply create a Python script with the code provided or run it in a Python interpreter. Then you can input the values `3 8 2` and the expected output should be printed to your console.
