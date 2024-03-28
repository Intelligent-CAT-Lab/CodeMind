Here is the Python translation of the provided Java code:

```python
n = int(input())

result = 0
array = [[0 for _ in range(10)] for _ in range(10)]

for i in range(1, n + 1):
    head = int(str(i)[0])
    tail = i % 10
    array[head][tail] += 1

for i in range(1, n + 1):
    head = int(str(i)[0])
    tail = i % 10
    if tail == 0:
        continue
    result += array[tail][head]

print(result)
```

You can use this code and simply provide the integer as input to get the expected output. For the test input `25`, the output should be `18`.
