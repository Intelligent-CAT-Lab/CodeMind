Here is the Java code translated into Python:

```python
a, b, c = map(int, input().split())
i = 0
cnt = 0
while cnt < c:
    i += 1
    cnt += a
    if i % 7 == 0:
        cnt += b

print(i)
```

Test your solution with the given input `3 0 10` to check if it gives the expected output `-44` (although, based on the logic in the provided code, the output for those test inputs should not be `-44`, but `4`).
