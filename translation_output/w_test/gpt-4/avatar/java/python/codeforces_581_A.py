Here is the equivalent code in Python:

```python
# input two integers
a, b = map(int, input().split())

# initialize count
count = 0
while True:
    if a > 0 and b > 0:
        count += 1
        a -= 1
        b -= 1
    else:
        break

# calculate the answer
ans = a // 2 + b // 2

# output the result
print(count, ans)
```

To run the provided test case with input `45 99`, you would execute the Python script and input the numbers when asked:
```
45 99
```

This would provide the expected output:
```
45 27
```
