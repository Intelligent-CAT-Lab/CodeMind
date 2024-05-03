Here is the Python equivalent of the Java code:

```python
h = int(input())
w = int(input())
s = int(input())
t = int(input())

if h * w % 2 == 1 and (s * w + t) % 2 == 1:
    print("No")
else:
    print("Yes")
```

This Python code does the same thing as the Java code. It reads four integers from the user, calculates the remainder of the product of `h` and `w` divided by 2, and checks if the sum of `s` times `w` and `t` is odd. If both conditions are met, it prints "No", otherwise it prints "Yes".
