Here's the Python equivalent of the provided Java code:

```python
# Read input from user
a, b = map(int, input().split())

# Check for the given conditions
if a % 3 == 0 or b % 3 == 0 or (a + b) % 3 == 0:
    print("Possible")
else:
    print("Impossible")
```

Now to run the provided test case with this Python code:

Test input:
```
4 5
```

Expected output:
```
Possible
```
