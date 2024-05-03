Here is the Python equivalent of the Java code:

```python
def solve():
    N = int(input())
    for h in range(1, 3501):
        for n in range(1, 3501):
            if 4*h*n-N*n-N*h!=0 and (N*h*n)/(4*h*n-N*n-N*h)>0 and (N*h*n)%(4*h*n-N*n-N*h)==0:
                print(h, n, int(N*h*n/(4*h*n-N*n-N*h)))
                return

solve()
```

This Python code does the same thing as the Java code. It takes an integer input, then iterates over possible values of `h` and `n` from 1 to 3500. If it finds a pair of `h` and `n` that satisfies the conditions, it prints them and the result of the division, then returns.
