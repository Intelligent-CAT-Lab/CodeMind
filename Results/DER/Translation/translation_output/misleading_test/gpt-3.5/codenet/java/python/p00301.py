```python
n = int(input())
a = [0] * 15
i = 0

while n > 0:
    a[i] = (n + 1) % 3 - 1
    n = (n - a[i]) // 3
    i += 1

output = ""
for j in range(i-1, -1, -1):
    output += ("0" if a[j] == 0 else "+" if a[j] > 0 else "-") + ("\n" if j == 0 else "")

print(output)
```
