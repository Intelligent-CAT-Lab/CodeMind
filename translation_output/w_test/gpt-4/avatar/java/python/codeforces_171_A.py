Here is the translated Python code:

```python
def get_num(a, b):
    reverse_b = 0
    while b > 0:
        reverse_b = reverse_b * 10 + b % 10
        b //= 10
    return a + reverse_b

# Sample test case
a, b = map(int, input().split())
ans = get_num(a, b)
print(ans)
```

When you run this Python code and input "35005211 521595368", it should produce the expected output "898600336".
