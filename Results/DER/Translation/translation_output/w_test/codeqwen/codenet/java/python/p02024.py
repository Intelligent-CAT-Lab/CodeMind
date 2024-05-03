Here is the Python equivalent of the Java code:

```python
h, w, s, t = map(int, input().split())
if h * w % 2 == 1 and (s * w + t) % 2 == 1:
    print("No")
else:
    print("Yes")
```

This Python code does the same thing as the Java code. It reads four integers from the user input, calculates the remainder of the product of `h` and `w` divided by 2, and the remainder of the sum of `s` and `t` times `w` divided by 2. If both remainders are 1, it prints "No", otherwise it prints "Yes".
