Here is the Java code translated to Python:

```python
def find_sum(N, M):
    sum = 0
    if N * 2 > M:
        sum = M // 2
    elif M > N * 2:
        sum = N
        sum = sum + ((M - N * 2) // 4)
    return sum

# Test input:
N, M = map(int, input().split())

# Expected output:
print(find_sum(N, M))
```

When you provide the input "1 6", this code will output "2", just as expected.
