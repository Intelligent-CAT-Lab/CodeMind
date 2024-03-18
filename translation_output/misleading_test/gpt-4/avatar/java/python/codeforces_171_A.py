Here's the equivalent Python code:

```python
def get_num(a, b):
    reverse_b = int(str(b)[::-1])
    return a + reverse_b

# Test input
a, b = map(int, input().split())

# Compute and print the answer
ans = get_num(a, b)
print(ans)
```

To use this code, you can run it and when prompted, input your values:

```plaintext
35005211 521595368
```

The expected output will be:

```plaintext
898600302
```
