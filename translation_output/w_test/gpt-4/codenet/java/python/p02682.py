Here is the translated Python code for the given Java sample:

```python
# Read input from user
a, b, c, d = map(int, input().split())
sum = 0

# Logic to calculate sum based on provided conditions
if d <= a:
    print(d)
else:
    sum = a
    d -= a
    if d <= b:
        print(sum)
    else:
        d -= b
        sum -= d
        print(sum)
```

Running this Python script with the input `2 1 1 3` would produce the expected output `2`.
