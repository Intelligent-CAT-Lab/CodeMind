Here's the given Java code translated to Python:

```python
def p03502():
    X = int(input())

    N = X

    fx = 0

    while N >= 10:
        fx += N % 10
        N //= 10

    fx += N

    if X % fx == 0:
        print("Yes")
    else:
        print("No")

# Call the function to execute the code
p03502()
```

Remember to call `p03502()` to execute the function when you are ready to test the code.
