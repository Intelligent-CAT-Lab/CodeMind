Below is the translated Python code from the provided Java code:

```python
x = int(input())
k = int(input())
d = int(input())

ans = 0
abs_x = abs(x)
if abs_x // d >= k:
    ans = abs_x - k * d
else:
    sho = abs_x // d
    amari = abs_x % d
    if (k - sho) % 2 == 0:
        ans = amari
    else:
        ans = d - amari

print(ans)
```

Please note that in Python, the input is generally read using the `input()` function, and integer parsing is done by directly converting the input string to an int using `int()`. Additionally, `//` is used for integer division in Python, to ensure that the result is an integer when dividing two integers, replicating Java's division behavior. Python's `print()` function is used to output the result, and the `math` module is not necessary for the absolute value, as the built-in `abs()` function is used.
