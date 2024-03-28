Here is the equivalent Python code for the given Java code:

```python
def main():
    n, m, d = map(int, input().split())

    s = n if d == 0 else ((n - d) * 2)
    print("{:.10f}".format(s / n / n * (m - 1)))

if __name__ == '__main__':
    main()
```

This code reads three space-separated integers from standard input (`n`, `m`, and `d`), computes the value of `s` based on the condition provided, and then prints the result formatted to ten decimal places.

Now let's test it with the input you provided:

Test input:
```
2 3 1
```

Expected output:
```
1.0000000000
```

The Python code should output the expected result when provided with this input.
