Here is the equivalent Python code for the provided Java code:

```python
# Read input from the user
n, x, t = map(int, input().split())

# Initialize variables
ans = 0
tako = 0

# Calculate the time needed
while n > tako:
    ans += t
    tako += x

# Print the result
print(ans)
```

When you run this Python code and input `20 12 6`, the expected output will be `12`.
