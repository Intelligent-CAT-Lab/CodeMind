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

This Python code does the same thing as the Java code. It takes an input N, then iterates over all possible values of h and n from 1 to 3500. If the conditions in the if statement are met, it prints the values of h, n, and the result of the division of N*h*n by 4*h*n-N*n-N*h. The int function is used to convert the result to an integer before printing. The function solve() is called at the end to run the code.
