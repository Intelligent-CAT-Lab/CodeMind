Here is the translated code from Java to Python:

```python
A, B, C = map(int, input().split())
N = B // A
if N > C:
    print(C)
else:
    print(N)
```

This Python code reads three integers from the input (separated by spaces), performs an integer division of B by A, and then prints either C or the result of the division, depending on which one is smaller.
