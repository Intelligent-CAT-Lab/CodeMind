```python
def find_multiple_of_111(n):
    for i in range(n, 1000):
        if i % 111 == 0:
            return i

n = int(input())
result = find_multiple_of_111(n)
print(result)
```
