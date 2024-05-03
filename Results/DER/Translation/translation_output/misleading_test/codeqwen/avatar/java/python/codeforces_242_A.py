Here is the Python equivalent of the Java code:

```python
import sys

def main():
    x, y, a, b = map(int, sys.stdin.readline().split())
    res = []
    for i in range(a, x+1):
        for j in range(b, y+1):
            if i <= j: continue
            res.append(f"{i} {j}")
    print(len(res))
    for str in res: print(str)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads four integers from the standard input, then it iterates over all pairs of integers from `a` to `x` and from `b` to `y`. If the first integer is not greater than the second, it skips that pair. Otherwise, it appends the pair to the list `res`. After the loop, it prints the length of `res` and then prints each string in `res`.
