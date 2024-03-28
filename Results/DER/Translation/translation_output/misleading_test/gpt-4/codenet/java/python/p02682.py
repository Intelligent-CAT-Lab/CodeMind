Below is the translated code of the provided Java program into Python:

```python
# Read input as a list of integers
a, b, c, d = map(int, input().split())

sum = 0
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

You can test this Python code using your sample test case:

Test input:
2 1 1 3

Expected output:
29

Note:
When you provide input, make sure you input the numbers on the same line separated by spaces as per your sample test case.
