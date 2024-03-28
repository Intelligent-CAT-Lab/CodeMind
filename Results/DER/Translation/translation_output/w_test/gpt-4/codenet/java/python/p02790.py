Here is the translated code in Python:

```python
a, b = map(int, input().split())

if a >= b:
    print(str(b) * a)
else:
    print(str(a) * b)
```

This code snippet reads two integers from the input, stores them in `a` and `b`, and then prints either `b` repeated `a` times or `a` repeated `b` times depending on the condition specified.
