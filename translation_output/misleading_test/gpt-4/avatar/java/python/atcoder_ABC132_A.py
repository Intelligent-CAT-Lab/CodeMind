Here's the translated Python code:

```python
def check_string(s):
    chars = set(s)
    return 'Y' if len(chars) == 2 else 'N'

# Test input
input_string = input().strip()

# Check and print result
print(check_string(input_string))
```

Now, use this Python code snippet to test with the provided test case:

Input:
```
STOP
```

Expected output:
```
N
```
