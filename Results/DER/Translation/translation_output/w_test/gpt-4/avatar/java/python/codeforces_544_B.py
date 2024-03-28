Here is the translated Python code based on the provided Java code:

```python
def print_island(n, count):
    a = (n + 1) // 2
    b = n // 2
    max_val = a * a + b * b
    if count > max_val:
        print("NO")
        return
    print("YES")
    result = []
    for i in range(n):
        row = []
        for j in range(n):
            if (i + j) % 2 == 0 and count > 0:
                row.append('L')
                count -= 1
            else:
                row.append('S')
        result.append("".join(row))
    print("\n".join(result))

# Test case
n, count = map(int, input().split())
print_island(n, count)
```

You can run this Python program and provide the sample test input (`100 10000`) to get the expected output:

Expected output:
```
NO
```
