Here is the converted code in Python:

```python
# Test input:
n = int(input())

a = [0] * 15
i = 0
while n > 0:
    a[i] = (n + 1) % 3 - 1
    n = (n - a[i]) // 3
    i += 1

result = ''
while i > 0:
    i -= 1
    result += '0' if a[i] == 0 else '+' if a[i] > 0 else '-'

print(result)
```

When you run the Python code with the input 25, you should get the expected output `+0-+`.
