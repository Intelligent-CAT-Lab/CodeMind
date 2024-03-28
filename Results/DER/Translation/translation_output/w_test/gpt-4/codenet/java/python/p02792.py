The following code is a Python equivalent of the provided Java code:

```python
# Test input
n = int(input())

# Calculation
result = 0
array = [[0 for _ in range(10)] for _ in range(10)]
for i in range(1, n + 1):
    head = int(str(i)[0])
    tail = i % 10
    array[head][tail] += 1

keta = len(str(n))
for i in range(1, n + 1):
    head = int(str(i)[0])
    tail = i % 10
    if tail == 0:
        continue
    result += array[tail][head]

# Output
print(result)
```

When you run the above Python code and input `25` as the test case, the expected output would be `17`, matching what is expected from the Java code execution.

If you want to run this as a script and provide the test case programmatically without user input, you could replace the `n = int(input())` line with `n = 25`.
